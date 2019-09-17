package com.nea.myweather.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.nea.myweather.models.City;
import com.nea.myweather.models.Forecast;
import com.nea.myweather.models.ForecastList;
import com.nea.myweather.ui.WeatherDetailFragment;

import java.util.List;

public class WeatherPagerAdapter extends FragmentPagerAdapter{
    private List<ForecastList> mWeatherForecasts;
    private City mCity;
    private Forecast mForecast;

    public WeatherPagerAdapter(FragmentManager fm, List<ForecastList> weatherForecast, City city, Forecast forecast){
        super(fm);
        mWeatherForecasts = weatherForecast;
        mCity = city;
        mForecast = forecast;
    }

    @Override
    public Fragment getItem(int position){
        return WeatherDetailFragment.newInstance(mWeatherForecasts.get(position), mCity, mForecast);
    }

    @Override
    public int getCount(){
        return mWeatherForecasts.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return mWeatherForecasts.get(position).getReadableDate();
    }
}
