package edu.kathford.menuexample;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView contentTextView;
    private Button actionButton;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contentTextView = findViewById(R.id.dummyTextView);
        actionButton = findViewById(R.id.actionButton);

        registerForContextMenu(contentTextView);

        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,
                        actionButton);
                MenuInflater inflater =popupMenu.getMenuInflater();
                inflater.inflate(R.menu.popup_menu, popupMenu.getMenu());
                popupMenu.show();

                //handle popup menu item click listener
                //popupMenu.setOnMenuItemClickListener();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.notification){
            Toast.makeText(MainActivity.this, "Notification Clicked", Toast.LENGTH_SHORT).show();
        }

        if(item.getItemId() == R.id.settings){
            Toast.makeText(MainActivity.this, "Settings Clicked", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.select){
            Toast.makeText(this, "Select item clicked", Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.copy){
            Toast.makeText(this, "Copy item clicked", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Cut item clicked", Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}
