package com.jenniferlam.jlam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class FilterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        Log.d("My filter", "onCreate() method called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("My filter", "onStart() method called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("My filter", "onPause() method called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("My filter", "onResume() method called");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("My filter", "onStop() method called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("My filter", "onDestroy() method called");
    }
}
