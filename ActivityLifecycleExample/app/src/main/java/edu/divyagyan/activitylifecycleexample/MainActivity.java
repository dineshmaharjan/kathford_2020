package edu.divyagyan.activitylifecycleexample;



import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    private Button clickButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickButton = findViewById(R.id.clickButton);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });

        Log.i(TAG, "onCreate method called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart method called");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume method called");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause method called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop method called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy method called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart method called");
    }
}
