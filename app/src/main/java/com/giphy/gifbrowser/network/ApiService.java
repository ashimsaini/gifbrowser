package com.giphy.gifbrowser.network;

import com.giphy.gifbrowser.MainActivity;
import com.giphy.gifbrowser.models.GIFModel;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ravi on 20/02/18.
 */
 
public interface ApiService {


    @GET("trending?")
    Observable<GIFModel> getGIFData( @Query("api_key") String apiKey,
                                     @Query("limit") int limit);
}