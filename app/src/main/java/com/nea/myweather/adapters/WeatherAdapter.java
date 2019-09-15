package com.nea.myweather.adapters;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import com.nea.myweather.models.Location;

import java.util.List;

public class WeatherAdapter {
    List<Location> weatherDetails;
    Context context;

    public WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>{
        this.weatherDetails=weatherDetails;
        this.context = context;
    }

    }


