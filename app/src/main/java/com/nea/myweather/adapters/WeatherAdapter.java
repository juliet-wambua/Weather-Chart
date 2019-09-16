package com.nea.myweather.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.nea.myweather.R;
import com.nea.myweather.models.Weather;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {

     private ArrayList<Weather> mWeather = new ArrayList<> (  );
       private Context mContext;

       public WeatherAdapter(Context context, ArrayList<Weather> weathers) {
            mContext = context;
            mWeather = weathers;
        }

    @Override
    public WeatherAdapter.WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_list_item, parent, false);
        WeatherViewHolder viewHolder = new WeatherViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(WeatherAdapter.WeatherViewHolder holder, int position) {
        holder.bindWeather(mWeather.get(position));
    }

    @Override
    public int getItemCount() {
        return mWeather.size();
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.weatherImageView) ImageView mRestaurantImageView;
        @BindView(R.id.weatherNameTextView) TextView mNameTextView;
        @BindView(R.id.categoryTextView) TextView mCategoryTextView;
        @BindView(R.id.ratingTextView) TextView mRatingTextView;
        private Context mContext;

        public RestaurantViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }

        public void bindRestaurant(Weather weather) {
            mNameTextView.setText(weather.getWeatherDetails());
        }
    }
}
