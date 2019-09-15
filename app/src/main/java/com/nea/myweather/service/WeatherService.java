package com.nea.myweather.service;

import com.nea.myweather.models.Weather;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Response;

public class WeatherService {
    public ArrayList<Weather> processResults(Response response){
        ArrayList<Weather> weathers = new ArrayList<>();
        try{
            String jsonData = response.body().string();
            JSONObject accessJSON = new JSONObject(jsonData);
            JSONArray climateJSON = accessJSON.getJSONArray("climate");
            if (response.isSuccessful()){
                for (int i = 0; i < climateJSON.length(); i++){
                    JSONObject weatherJSON = climateJSON.getJSONObject(i);
                    String observationTime = weatherJSON.getString("time");
                    String windDir = weatherJSON.getString("direction");
                    double precip = weatherJSON.getDouble("precip");
                    Weather weather = new Weather(observationTime, windDir, precip);
                    weathers.add(weather);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return weathers;
    }



}
