package com.nea.myweather.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.nea.myweather.R;
import com.nea.myweather.adapters.WeatherAdapter;
import com.nea.myweather.constants.Constants;
import com.nea.myweather.models.Weather;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WeatherListActivity extends AppCompatActivity {
    private SharedPreferences mSharedPreferences;
    private String mRecentAddress;
    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    private WeatherAdapter mAdapter;
    public ArrayList<Weather> mWeathers = new ArrayList<> ( );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");

        getClimates(location);


//        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
//        mRecentAddress = mSharedPreferences.getString(Constants.PREFERENCES_LOCATION_KEY, null);
//
//        if (mRecentAddress != null) {
//            getRestaurants(mRecentAddress);
//        }
    }

    private void getClimates(String location) {
    }
}
