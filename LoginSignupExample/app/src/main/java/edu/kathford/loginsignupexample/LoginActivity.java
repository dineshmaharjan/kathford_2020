package edu.kathford.loginsignupexample;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText userNameEditText;
    private EditText passwordEditText;
    private Button submitButton;

    private TextView signupTextView;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       userNameEditText = findViewById(R.id.userNameEditText);
       passwordEditText = findViewById(R.id.passwordEditText);
       submitButton = findViewById(R.id.submitButton);
       signupTextView = findViewById(R.id.signupTextView);


       submitButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
             String userName=  userNameEditText.getText().toString().trim();
             String password = passwordEditText.getText().toString().trim();

             if(userName.isEmpty() && password.isEmpty()){
                 Toast.makeText(LoginActivity.this,
                         "All fields are required", Toast.LENGTH_SHORT).show();
                 return;
             }
             if(!userName.isEmpty()){
                 if(!password.isEmpty()){
                     Toast.makeText(LoginActivity.this,
                             "Success", Toast.LENGTH_SHORT).show();
                 }else{
                     passwordEditText.setError("Invalid password");
                 }

             }else{
                 userNameEditText.setError("Invalid username");
             }

               Log.i("Username", userName);
               Log.i("Password",password);

           }
       });

       signupTextView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent =new  Intent(LoginActivity.this,
                       SignupActivity.class);
               startActivity(intent);
           }
       });
    }
}
