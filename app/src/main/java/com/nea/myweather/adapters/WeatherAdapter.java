package com.nea.myweather.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.nea.myweather.R;

public class WeatherAdapter {
    List<LocationResponse> weatherDetails;
    Context context;

    public WeatherAdapter(List<LocationResponse> weatherDetails, Context context){
        this.weatherDetails=weatherDetails;
        this.context = context;
    }
    @Override
    public WeatherHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from (context).inflate ( R.layout.weather_list,parent,false );
        WeatherHolder weatherHolder = new WeatherHolder(view);
        return  weatherHolder;
    }

    @Override
    public void onBindViewHolder(WeatherHolder holder, int position) {
        holder.tvTitle.setText(weatherDetails.get(position).getObservationTime ());
        holder.tvOverview.setText(weatherDetails.get(position).getTemperature ());
        holder.tvReleaseDate.setText(weatherDetails.get(position).getWindSpeed ());
        Glide.with(context).load("https://assets.weatherstack.com/images/wsymbols01_png_64/"+weatherDetails.get(position).getWeatherIcons ()).into(holder.ivMovie);
    }
    @Override
    public int getItemCount() {
        return weatherDetails.size();
    }
    public class WeatherHolder extends RecyclerView.ViewHolder {
        TextView tvTitle,tvOverview,tvReleaseDate;
        ImageView ivMovie;
        public WeatherHolder(View v) {
            super(v);
            tvTitle = (TextView) v.findViewById(R.id.tvTitle);
            tvOverview = (TextView) v.findViewById(R.id.tvOverView);
            tvReleaseDate = (TextView) v.findViewById(R.id.tvReleaseDate);
            ivMovie = (ImageView) v.findViewById(R.id.ivMovie);
        }
    }
}
}
