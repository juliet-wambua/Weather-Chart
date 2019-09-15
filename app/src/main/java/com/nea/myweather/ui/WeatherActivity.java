package com.nea.myweather.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.nea.myweather.R;
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
    public static final String TAG = WeatherActivity.class.getSimpleCondition();
    @BindView(R.id.locationTextView) TextView mLocationTextView;
    @BindView(R.id.listView) ListView mListView;

    public ArrayList<Weather> mWeathers = new ArrayList<> ();

   ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Current Weather at: " + location);
        getWeathers(location;);
    }

    private void getWeathers(String location) {
        final WeatherService weatherService = new WeatherService();
        weatherService.findWeathers(location, new Callback () {

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
                        String[] weatherCondition = new String[mWeathers.size ()];
                        for (int i = 0; i < weatherCondition.length; i++) {
                            weatherCondition[i] = mWeathers.get(i).getCondition();
                            mListView.setAdapter(adapter);

                        }                    }
                });
            }

        });
    }
}



