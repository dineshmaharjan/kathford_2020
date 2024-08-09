package edu.kathford.listviewexample;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    private Button simpleListViewButton, customListViewButton, simpleGridViewButton,
            customGridViewButton, recyclerViewButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        simpleListViewButton = findViewById(R.id.simpleListViewButton);
        customListViewButton = findViewById(R.id.customListViewButton);
        simpleGridViewButton = findViewById(R.id.simpleGridViewButton);
        customGridViewButton = findViewById(R.id.customGridViewButton);
        recyclerViewButton = findViewById(R.id.recyclerViewButton);

        simpleListViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });

        customListViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuActivity.this, MovieActivity.class));

            }
        });

        simpleGridViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuActivity.this, SimpleGridViewActivity.class));

            }
        });
        customGridViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuActivity.this, MovieGridViewActivity.class));

            }
        });

        recyclerViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MenuActivity.this,
                        RecyclerViewExampleActivity.class));

            }
        });
    }
}
