package com.nea.myweather.networks;


import android.database.Observable;

import com.nea.myweather.models.Location;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NetworkInterface {

    @GET("discover/movie")
    Observable<Location> getWeather(@Query("api_key") String api_key);

}