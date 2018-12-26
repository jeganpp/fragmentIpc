package com.example.fraglifecycle;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MY_ACTIVITY", "onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MY_ACTIVITY", "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MY_ACTIVITY", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MY_ACTIVITY", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MY_ACTIVITY", "onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d("MY_ACTIVITY", "onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MY_ACTIVITY", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MY_ACTIVITY", "onDestroy");
    }
}
