package com.nea.myweather.networks;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.nea.myweather.constants.Constants.ACCESS_BASE_URL;

public class NetworkClient {

        public static Retrofit retrofit;
        public void NetworkClient(){
        }
        public static Retrofit getRetrofit(){
            if(retrofit==null){
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                OkHttpClient okHttpClient = builder.build();
                retrofit = new Retrofit.Builder()
                        .baseUrl(ACCESS_BASE_URL)
                        .addConverterFactory( GsonConverterFactory.create())
                        .addCallAdapterFactory( RxJava2CallAdapterFactory.create())
                        .client(okHttpClient)
                        .build();
            }
            return retrofit;
        }
    }

