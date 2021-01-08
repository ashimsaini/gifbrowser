package com.giphy.gifbrowser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.giphy.gifbrowser.models.Datum
import com.giphy.gifbrowser.models.GIFModel
import com.giphy.gifbrowser.network.ApiClient
import com.giphy.gifbrowser.network.ApiService
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import java.io.File

class DownloadActivity : AppCompatActivity() {
    private val TAG = DownloadActivity::class.java.simpleName
    var recyclerView: RecyclerView? = null
    var recyclerViewAdapter: DownloadAdapter? = null
    var gifmodelist: ArrayList<File>?= ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv_gifview)
        val staggeredGridLayoutManager =
            StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        recyclerView!!.setLayoutManager(staggeredGridLayoutManager)
        recyclerViewAdapter = DownloadAdapter(this@DownloadActivity, gifmodelist)
        recyclerView!!.setAdapter(recyclerViewAdapter)
        fetchAllNotes()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.getItemId()) {
            android.R.id.home -> {
                val i = Intent(this@DownloadActivity, DownloadActivity::class.java)
                startActivity(i)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun fetchAllNotes() {
        var path = Utils.getRootDirPath(this@DownloadActivity)
        var directory = File(path)
        var files = directory.listFiles()
        for (i in files.indices){
            gifmodelist!!.add(files[i]);
        }

        recyclerView!!.adapter!!.notifyDataSetChanged()
    }

    private fun showError(e: Throwable) {
        Toast.makeText(
            this, "ERROR IN FETCHING API RESPONSE. Try again",
            Toast.LENGTH_LONG
        ).show()
    }
}