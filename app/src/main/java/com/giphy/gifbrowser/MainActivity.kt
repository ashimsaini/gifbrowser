package com.giphy.gifbrowser

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.giphy.gifbrowser.models.GIFModel
import com.giphy.gifbrowser.network.ApiClient
import com.giphy.gifbrowser.network.ApiService
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers


public class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName
    private var apiService: ApiService? = null
    var recyclerView: RecyclerView? = null
    var recyclerViewAdapter: Adapter? = null
    var gifmodelist: GIFModel? = GIFModel()
    var compositeDisposable: CompositeDisposable? = null
    private var loading = true
    var pastVisiblesItems = 0
    var visibleItemCount: Int = 0
    var totalItemCount: Int = 0
    var paginationCount = 50

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        compositeDisposable = CompositeDisposable()
        recyclerView = findViewById(R.id.rv_gifview)
        val staggeredGridLayoutManager =
            StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        recyclerView!!.setLayoutManager(staggeredGridLayoutManager)
        recyclerViewAdapter = Adapter(this@MainActivity, gifmodelist)
        recyclerView!!.setAdapter(recyclerViewAdapter)



        recyclerView!!.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                if (dy > 0) { //check for scroll down
                    visibleItemCount = staggeredGridLayoutManager.getChildCount()
                    totalItemCount = staggeredGridLayoutManager.getItemCount()
                    var firstVisibleItems: IntArray? = null
                    firstVisibleItems =
                        staggeredGridLayoutManager.findFirstVisibleItemPositions(firstVisibleItems);
                    if (firstVisibleItems != null && firstVisibleItems.size > 0) {
                        pastVisiblesItems = firstVisibleItems[0];
                    }
                    if (loading) {
                        if (visibleItemCount + pastVisiblesItems >= totalItemCount) {
                            loading = false
                            fetchAllNotes()
                            loading = true
                        }
                    }
                }
            }
        })

        apiService =
            ApiClient.getClient(applicationContext).create(ApiService::class.java)
        fetchAllNotes()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.getItemId()) {
            R.id.menuAbout -> {
                val i = Intent(this@MainActivity, DownloadActivity::class.java)
                startActivity(i)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun fetchAllNotes() {
        val gIFModelObservable: Observable<GIFModel> =
            ApiClient.getClient(this@MainActivity).create(ApiService::class.java)
                .getGIFData("ARq9FP1DLaEW41qPJdo2d7Iz4HmY8ChI", paginationCount)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())


        val gIFModelDisposableObserver: DisposableObserver<GIFModel?> =
            object : DisposableObserver<GIFModel?>() {
                override fun onNext(gifModel: GIFModel) {
                    if (gifModel.pagination.count < paginationCount) {
                        paginationCount = paginationCount + 50
                    }
                    gifmodelist!!.data.addAll(gifModel.data)
                    recyclerView!!.adapter!!.notifyDataSetChanged()
                }

                override fun onError(e: Throwable) {
                    showError(e)
                }

                override fun onComplete() {

                }
            }

        compositeDisposable!!.add(gIFModelObservable.subscribeWith(gIFModelDisposableObserver))
    }

    private fun showError(e: Throwable) {
        Toast.makeText(
            this, "ERROR IN FETCHING API RESPONSE. Try again",
            Toast.LENGTH_LONG
        ).show()
    }
}