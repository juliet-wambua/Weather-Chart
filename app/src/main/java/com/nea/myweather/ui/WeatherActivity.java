package com.nea.myweather.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.nea.myweather.R;
import com.nea.myweather.adapters.WeatherAdapter;
import com.nea.myweather.models.Weather;
import com.nea.myweather.service.WeatherService;

import java.io.IOException;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class WeatherActivity extends AppCompatActivity {
    public static final String TAG = WeatherActivity.class.getSimpleName ();
    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;

    public ArrayList<Weather> mWeathers = new ArrayList<> ();

   ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        getWeathers(location);
    }

    private void getWeathers(String location) {
        final WeatherService weatherService = new WeatherService();
        weatherService.find(location, new Callback () {

            private ArrayList<Weather> weathers;

            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                weathers = weatherService.processResults ( response );
                WeatherActivity.this.runOnUiThread ( new Runnable() {

                    @Override
                    public void run() {
                        WeatherAdapter mAdapter = new WeatherAdapter ( getApplicationContext (), weathers );
                        mRecyclerView.setAdapter(mAdapter);
                        RecyclerView.LayoutManager layoutManager =
                                new LinearLayoutManager (WeatherActivity.this);
                        mRecyclerView.setLayoutManager(layoutManager);
                        mRecyclerView.setHasFixedSize(true);
                    }
                });
            }
        });
    }
}