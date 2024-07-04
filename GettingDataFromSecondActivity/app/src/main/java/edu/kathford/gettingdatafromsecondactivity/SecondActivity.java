package edu.kathford.gettingdatafromsecondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private EditText userNameEditText;
    private Button submitButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        userNameEditText = findViewById(R.id.userNameEditText);
        submitButton = findViewById(R.id.submitButton);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String userName =   userNameEditText.getText().toString().trim();

             if(!userName.isEmpty()){
                 Intent intent = getIntent();
                 intent.putExtra("username", userName);
                 setResult(12, intent);
                 finish();
             }else{
                 Toast.makeText(SecondActivity.this, "", Toast.LENGTH_LONG).show();
             }


            }
        });
    }
}
