package edu.kathford.fragmenmanagerexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CalculationFragment extends Fragment {

    private EditText firstNumberEditText, secondNumberEditTet;
    private Button calculateButton;
    private TextView resultTextView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculation,
                container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        firstNumberEditText = view.findViewById(R.id.firstNumberEditText);
        secondNumberEditTet = view.findViewById(R.id.secondNumberEditText);
        resultTextView = view.findViewById(R.id.resultTextView);
        calculateButton = view.findViewById(R.id.calculateButton);


        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
                int secondNumber = Integer.parseInt(secondNumberEditTet.getText().toString());
                int sum = firstNumber + secondNumber;

                resultTextView.setText("The result is: "+sum);
            }
        });
    }

}
