package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState)
       {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Log.d( TAG, "onCreate: " );
        }

        protected void onStart(){
               super.onStart();     // SCREEN GET VISIBLE TO USER
            Log.d( TAG, "OnStart: " );
        }
        protected void onResume(){
        super.onResume();          //USER CAN INTERACT WITH THE SCREEN
            Log.d( TAG, "onResume: " );
        }

    @Override
    protected void onPause() {
        super.onPause();      //USER NO LONGER INTERACT WITH THE SCREEN
        Log.d( TAG, "onPause: " );
    }

    @Override
    protected void onStop() {
        super.onStop();      // NOLONGER WITH SCREEN GET VISIBLE TO USER
        Log.d( TAG, "onStop: " );
    }
    protected void onRestart(){
        super.onRestart();  //NOCREATE AGAIN IT ONLY RESTART THE APPLICATION
        Log.d( TAG, "onRestart: " );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();   //APLLICATION OR ACTIVITY
        Log.d( TAG, "onDestroy: " );
    }
}

