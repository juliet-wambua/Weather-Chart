package com.nea.myweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.getWeatherButton)
    Button mGetWeatherButton;
    @BindView(R.id.locationEditText)
    EditText mLocationEditText;
    @BindView(R.id.appNameTextView)
    TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        ButterKnife.bind ( this );

        mGetWeatherButton.setOnClickListener ( new View.OnClickListener () {

            @Override
            public void onClick(View v) {
                if (v == mGetWeatherButton) {
                    String location = mLocationEditText.getText ().toString ();
                    Intent intent = new Intent ( MainActivity.this, WeatherActivity.class );
                    intent.putExtra ( "location", location );
                    startActivity ( intent );
                }
            }
        } );
    }

    @Override
    public void onClick(View view) {

    }
}