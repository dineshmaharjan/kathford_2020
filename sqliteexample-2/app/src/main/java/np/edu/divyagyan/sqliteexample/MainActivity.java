package np.edu.divyagyan.sqliteexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import np.edu.divyagyan.sqliteexample.adapter.StudentAdapter;
import np.edu.divyagyan.sqliteexample.helper.StudentDbHelper;

public class MainActivity extends AppCompatActivity {

    private EditText fullNameEditText, addressEditText, idEditText;
    private Button saveButton, showButton, updateButton, deleteButton;
    private ListView studentListView;

    private StudentDbHelper studentDbHelper;

    private StudentAdapter studentAdapter;
    private ArrayList<StudentModel> arrayList;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullNameEditText = findViewById(R.id.fullNameEditText);
        addressEditText = findViewById(R.id.addressEditText);
        idEditText = findViewById(R.id.idEditText);
        saveButton = findViewById(R.id.saveButton);
        showButton = findViewById(R.id.showButton);
        updateButton = findViewById(R.id.updateButton);
        deleteButton = findViewById(R.id.deleteButton);
        studentListView = findViewById(R.id.studentListView);

        studentDbHelper = new StudentDbHelper(MainActivity.this);


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fullName = fullNameEditText.getText().toString().trim();
                String address = addressEditText.getText().toString().trim();

                if (!fullName.isEmpty() && !address.isEmpty()) {
                    StudentModel studentModel = new StudentModel().setFullName(fullName).setAddress(address);

                    long rowId = studentDbHelper.insert(studentModel);

                    if (rowId != -1) {
                        fullNameEditText.setText(null);
                        addressEditText.setText(null);

                        arrayList = studentDbHelper.getAllStudent();

                        studentAdapter = new StudentAdapter(MainActivity.this, arrayList);
                        studentListView.setAdapter(studentAdapter);

                        Toast.makeText(MainActivity.this, "Student info inserted " + rowId,
                                Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Failed to insert student info",
                                Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "All fields are required!",
                            Toast.LENGTH_SHORT).show();
                }


            }

        });

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList = studentDbHelper.getAllStudent();
                studentAdapter = new StudentAdapter(MainActivity.this, arrayList);
                studentListView.setAdapter(studentAdapter);

            }
        });

        studentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                StudentModel studentModel = arrayList.get(position);

                fullNameEditText.setText(studentModel.getFullName());
                addressEditText.setText(studentModel.getAddress());
                idEditText.setText(String.valueOf(studentModel.getId()));

                Toast.makeText(MainActivity.this, "clicked " + studentModel.getFullName(),
                        Toast.LENGTH_SHORT).show();

            }
        });

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id = idEditText.getText().toString().trim();
                String fullName = fullNameEditText.getText().toString().trim();
                String address = addressEditText.getText().toString().trim();

                StudentModel studentModel = new StudentModel().setId(Integer.parseInt(id))
                        .setFullName(fullName).setAddress(address);

                int rowId = studentDbHelper.updateStudent(studentModel);
                if (rowId > 0) {
                    idEditText.setText(null);
                    fullNameEditText.setText(null);
                    addressEditText.setText(null);

                    arrayList = studentDbHelper.getAllStudent();
                    studentAdapter = new StudentAdapter(MainActivity.this, arrayList);
                    studentListView.setAdapter(studentAdapter);

                    Toast.makeText(MainActivity.this, "Student info updated successfully",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Failed to update", Toast.LENGTH_SHORT).show();
                }


            }
        });


        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //do it by yourself
            }
        });


    }
}
