package com.erb.postbrianapp;


import android.graphics.Color;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.activity_main);
        final WindowManager.LayoutParams layoutParams = getWindow().getAttributes();

        Button buttonred = (Button) findViewById(R.id.buttonred);
        buttonred.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                layout.setBackgroundColor(Color.RED);
                layoutParams.screenBrightness = 1.0F;
                getWindow().setAttributes(layoutParams);
            }
        });

        Button buttongreen = (Button) findViewById(R.id.buttongreen);
        buttongreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                layout.setBackgroundColor(Color.GREEN);
                layoutParams.screenBrightness = 1.0F;
                getWindow().setAttributes(layoutParams);
            }
        });

        Button buttonwhite = (Button) findViewById(R.id.buttonwhite);
        buttonwhite.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                layout.setBackgroundColor(Color.WHITE);
                layoutParams.screenBrightness = 1.0F;
                getWindow().setAttributes(layoutParams);
            }
        });

        Button buttonoff = (Button) findViewById(R.id.buttonoff);
        buttonoff.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                layout.setBackgroundColor(Color.WHITE);
                layoutParams.screenBrightness = -1F;
                getWindow().setAttributes(layoutParams);
            }
        });
    }
}

