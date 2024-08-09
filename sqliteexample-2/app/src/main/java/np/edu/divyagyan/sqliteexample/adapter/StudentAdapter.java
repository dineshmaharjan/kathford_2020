package np.edu.divyagyan.sqliteexample.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import np.edu.divyagyan.sqliteexample.R;
import np.edu.divyagyan.sqliteexample.StudentModel;

public class StudentAdapter extends ArrayAdapter<StudentModel> {

    private ArrayList<StudentModel> arrayList;

    public StudentAdapter(@NonNull Context context, ArrayList<StudentModel> arrayList) {
        super(context, R.layout.item_student, arrayList);
        this.arrayList = arrayList;
    }

    @SuppressLint("MissingInflatedId")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view
                = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent,
                false);

        TextView studentInfoTextView = view.findViewById(R.id.studentTextView);

        StudentModel studentModel = arrayList.get(position);

        studentInfoTextView.setText("Id " + studentModel.getId() + " FullName "
                + studentModel.getFullName() + " Address " + studentModel.getAddress());

        return view;
    }
}
