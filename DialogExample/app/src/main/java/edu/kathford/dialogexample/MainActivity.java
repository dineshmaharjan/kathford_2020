package edu.kathford.dialogexample;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button logoutButton;

    private Button customDialogButton;
    private Button dialogFragmentButton;
    private EditText firstNumberEditText, secondNumberEditText;
    private Button calculateButton;
    private TextView resultTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logoutButton = findViewById(R.id.logoutButton);
        customDialogButton = findViewById(R.id.customDialogButton);
        dialogFragmentButton = findViewById(R.id.dialogFragmentButton);

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new
                        AlertDialog.Builder(MainActivity.this);
                builder.setCancelable(false);
                builder.setTitle("Confirmation");
                builder.setMessage
                        ("Are you sure, you want to logout?");

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //call logout api
                        //clear local data
                        Toast.makeText(MainActivity.this,
                                "Yes button clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this,
                                "No button clicked", Toast.LENGTH_SHORT).show();
                    }
                });

              AlertDialog alertDialog =  builder.create();
              alertDialog.show();

            }
        });

        customDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            customDialog();

            }
        });


        dialogFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragmentExample dialogFragmentExample =
                        new DialogFragmentExample();

                dialogFragmentExample.show(getSupportFragmentManager(),
                        "LogoutDialog");
            }
        });
    }

    private void customDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        View view =getLayoutInflater().inflate(R.layout.dialog_calculation,
                null);

        firstNumberEditText = view.findViewById(R.id.firstNumberEditText);
        secondNumberEditText = view.findViewById(R.id.secondNumberEditText);
        calculateButton = view.findViewById(R.id.calculationButton);
        resultTextView = view.findViewById(R.id.resultTextView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString().trim());
                int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString().trim());
                int sum = firstNumber + secondNumber;

                resultTextView.setText("The result is:: "+sum);
            }
        });
        builder.setView(view);

        AlertDialog alertDialog =builder.create();
        alertDialog.show();

    }
}
