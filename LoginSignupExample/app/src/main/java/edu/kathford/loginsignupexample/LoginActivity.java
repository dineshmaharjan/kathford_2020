package edu.kathford.loginsignupexample;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText userNameEditText;
    private EditText passwordEditText;
    private Button submitButton;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       userNameEditText = findViewById(R.id.userNameEditText);
       passwordEditText = findViewById(R.id.passwordEditText);
       submitButton = findViewById(R.id.submitButton);

       submitButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
             String userName=  userNameEditText.getText().toString().trim();
             String password = passwordEditText.getText().toString().trim();

               Log.i("Username", userName);
               Log.i("Password",password);

           }
       });
    }
}
