package edu.kathford.listviewexample;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SimpleGridViewActivity extends AppCompatActivity {

    private GridView gridView;
    //data source for gridview adapter
    private  String[] datas= {"One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight"};

    //array adapter of string
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_gridview);
        gridView = findViewById(R.id.gridView);
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                datas);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view, int position, long id) {
                Toast.makeText(SimpleGridViewActivity.this,
                        datas[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
