package edu.divyagyan.passingdata;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    private TextView greetingTextView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

       greetingTextView = findViewById(R.id.greetingTextView);

        Intent intent =getIntent();
        if(intent!=null ){
            String userName =intent.getStringExtra("username");
//            intent.getIntExtra("",-1);
//            intent.getFloatExtra("",-1);

            greetingTextView.setText("Hello, "+userName);
        }


    }
}
