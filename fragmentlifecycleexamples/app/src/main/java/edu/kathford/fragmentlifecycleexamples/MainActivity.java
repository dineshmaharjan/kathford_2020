package edu.kathford.fragmentlifecycleexamples;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity","onCreate() callback activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","onStart() callback activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onResume() callback activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","onPause() callback activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","onStop() callback activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","onDestroy() callback activity");
    }
}
