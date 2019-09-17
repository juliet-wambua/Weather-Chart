package com.nea.myweather.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nea.myweather.R;
import com.nea.myweather.adapters.WeatherListAdapter;
import com.nea.myweather.models.Forecast;
import com.nea.myweather.models.ForecastList;
import com.nea.myweather.service.WeatherService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import butterknife.BindView;
import butterknife.ButterKnife;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class WeatherListActivity extends AppCompatActivity {

//    public String mRecentAddress;
//    public SharedPreferences mSharedPreferences;

    public List<ForecastList> mWeatherForecasts = new ArrayList<>();
    public static final String TAG = WeatherListActivity.class.getSimpleName();
    @BindView(R.id.recyclerView)
    RecyclerView mRecycleView;
    private WeatherListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_weather);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        getWeather(location);

//        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
//        mRecentAddress = mSharedPreferences.getString(Constants.PREFERENCES_LOCATION_KEY, null);
//        if(mRecentAddress != null){
//            getWeather(mRecentAddress);
//        }
    }

    private void getWeather(String location){
        final WeatherService weatherService = new WeatherService();
        weatherService.findForecast(location, new Callback(){
            @Override
            public void onFailure(Call call, IOException e){
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                    final Forecast forecast = weatherService.processResults(response);
                    mWeatherForecasts = forecast.getForecastList();
                    WeatherListActivity.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mAdapter = new WeatherListAdapter(getApplicationContext(), mWeatherForecasts, forecast);
                            mRecycleView.setAdapter(mAdapter);
                            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager (WeatherListActivity.this);
                            mRecycleView.setLayoutManager(layoutManager);
                            mRecycleView.setHasFixedSize(true);
                        }
                    });
            }
        });
    }
}
