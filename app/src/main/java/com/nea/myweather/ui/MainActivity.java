package com.nea.myweather.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.nea.myweather.R;
import com.nea.myweather.constants.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    private SharedPreferences mSharedPreferences;
//    private SharedPreferences.Editor mEditor;

    private DatabaseReference mSearchedLocationReference;

    @BindView(R.id.getWeatherButton)
    Button mGetWeatherButton;
    @BindView(R.id.locationEditText)
    EditText mLocationEditText;
    @BindView(R.id.appNameTextView)
    TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            mSearchedLocationReference = FirebaseDatabase
                    .getInstance()
                    .getReference()
                    .child(Constants.FIREBASE_CHILD_SEARCHED_LOCATION);
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        ButterKnife.bind ( this );
//
//        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences ( this );
//        mEditor = mSharedPreferences.edit ();
//        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences ( this );
//        mEditor = mSharedPreferences.edit ();

        mGetWeatherButton.setOnClickListener ( new View.OnClickListener () {

            @Override
            public void onClick(View v) {
                if (v == mGetWeatherButton) {
                    String location = mLocationEditText.getText ().toString ();
                    addToSharedPreferences ( location );
                    Intent intent = new Intent ( MainActivity.this, WeatherActivity.class );
                    intent.putExtra ( "location", location );
                    startActivity ( intent );
                }
            }

            private void addToSharedPreferences(String location) {
//                mEditor.putString ( Constants.PREFERENCES_LOCATION_KEY, location ).apply ();
            }
//    private void addToSharedPreferences(String location) {
//        mEditor.putString(Constants.PREFERENCES_LOCATION_KEY, location).apply();
//    }



    } );


    }

    @Override
    public void onClick(View view) {

    }
}