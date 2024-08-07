package edu.kathford.listviewexample;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import edu.kathford.listviewexample.adapter.CustomListViewAdapter;
import edu.kathford.listviewexample.model.Movie;

public class MovieActivity extends AppCompatActivity {

    private ListView listView;

    private ArrayList<Movie> movieArrayList;
    private CustomListViewAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        initMovies();

        adapter = new CustomListViewAdapter(this,movieArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MovieActivity.this,
                        movieArrayList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initMovies() {
        movieArrayList = new ArrayList<>();
        Movie movie = new Movie("God of War",
                "4th August",
                "https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");

        movieArrayList.add(movie);

        movie = new Movie("Alone",
                "12th August",
                "https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);

        movie = new Movie("Demon",
                "12th August",
                "https://marketplace.canva.com/EAFRL_wsIbA/1/0/1131w/canva-red-and-black-horror-movie-poster-6lVWihK5Sro.jpg");
        movieArrayList.add(movie);

        movie = new Movie("Test",
                "12th August",
                "https://i.pinimg.com/736x/9d/fc/1c/9dfc1cd609a41b68fcc1f24a748239ec.jpg");
        movieArrayList.add(movie);

        movie = new Movie("Alone",
                "12th August",
                "https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);

        movie = new Movie("Alone",
                "12th August",
                "https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);

        movie = new Movie("Alone",
                "12th August",
                "https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);

        movie = new Movie("Alone",
                "12th August",
                "https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);

        movie = new Movie("Alone",
                "12th August",
                "https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);


    }
}
