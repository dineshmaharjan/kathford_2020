package edu.kathford.loginsignupexample;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    private EditText fullNameEditText;
    private Button signupButton;

    private RadioGroup genderRadioGroup;
    private CheckBox termsAndConditionCheckBox;
    private Spinner countrySpinner;

    private String selectedGender;
    private boolean isCheckedTermsAndCondition;
    private  String selectedCountry;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        fullNameEditText = findViewById(R.id.fullNameEditText);
        signupButton = findViewById(R.id.signupButton);
        genderRadioGroup = findViewById(R.id.genderRadioGroup);
        termsAndConditionCheckBox = findViewById(R.id.termsAndConditionCheckBox);
        countrySpinner = findViewById(R.id.countrySpinner);

        genderRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.maleRadioButton){
                    selectedGender = "Male";
                }else if(checkedId == R.id.femaleRadioButton){
                    //Female
                    selectedGender = "Female";
                }else{
                    //others
                    selectedGender = "Others";
                }

            }
        });

        termsAndConditionCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                isCheckedTermsAndCondition = isChecked;
            }
        });

        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedCountry = countrySpinner.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullName = fullNameEditText.getText().toString().trim();

                Log.i("FullName", fullName);
                Log.i("Gender",selectedGender);
                Log.i("Country",selectedCountry);
                Log.i("T&C", String.valueOf(isCheckedTermsAndCondition));
            }
        });


    }
}
