package com.example.sematecone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//region Sematec Session 3 Task 1 : LifeCycle


    @Override
    protected void onStart() {
        super.onStart();


        Log.d("LifeCycleTest","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("LifeCycleTest","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("LifeCycleTest","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("LifeCycleTest","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("LifeCycleTest","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("LifeCycleTest","onRestart");
    }
    //endregion




}
