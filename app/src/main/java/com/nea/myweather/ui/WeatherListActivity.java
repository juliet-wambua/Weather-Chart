package com.nea.myweather.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.nea.myweather.constants.Constants;

public class WeatherListActivity extends AppCompatActivity {
    private SharedPreferences mSharedPreferences;
    private String mRecentAddress;
//    ...

    @Override
    protected void onCreate(Bundle savedInstanceState) {

//    ...

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mRecentAddress = mSharedPreferences.getString( Constants.PREFERENCES_LOCATION_KEY, null);
        Log.d("Shared Pref Location", mRecentAddress);
    }
//    ...
}
