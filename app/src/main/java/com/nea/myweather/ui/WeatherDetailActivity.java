package com.nea.myweather.ui;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.nea.myweather.R;
import com.nea.myweather.adapters.WeatherPagerAdapter;
import com.nea.myweather.models.City;
import com.nea.myweather.models.Forecast;
import com.nea.myweather.models.ForecastList;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;


import butterknife.BindView;
import butterknife.ButterKnife;

public class WeatherDetailActivity extends AppCompatActivity {

    @BindView(R.id.viewPager)
    ViewPager mViewpager;
    private WeatherPagerAdapter adapterViewpager;
    City mCity;
    Forecast mForecast;
    List<ForecastList> mWeatherForecasts =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_weather_detail);
        ButterKnife.bind(this);

        mForecast = Parcels.unwrap(getIntent().getParcelableExtra("forecast"));
        mCity = Parcels.unwrap(getIntent().getParcelableExtra("city"));
        mWeatherForecasts = Parcels.unwrap(getIntent().getParcelableExtra("forecastLists"));
        int startingPosition = getIntent().getIntExtra("position", 0);

        adapterViewpager = new WeatherPagerAdapter(getSupportFragmentManager(), mWeatherForecasts, mCity, mForecast);
        mViewpager.setAdapter(adapterViewpager);
        mViewpager.setCurrentItem(startingPosition);
    }

}
