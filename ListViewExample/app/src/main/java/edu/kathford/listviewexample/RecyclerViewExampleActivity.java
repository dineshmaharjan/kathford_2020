package edu.kathford.listviewexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import edu.kathford.listviewexample.adapter.CustomRecyclerViewAdapter;
import edu.kathford.listviewexample.model.Movie;

public class RecyclerViewExampleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CustomRecyclerViewAdapter adapter;
    private ArrayList<Movie> movieArrayList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_example);
        recyclerView = findViewById(R.id.recyclerView);
        initMovies();
        adapter = new CustomRecyclerViewAdapter(movieArrayList, new CustomRecyclerViewAdapter.CustomOnItemClickListener() {
            @Override
            public void onClick(Movie movie) {
                Toast.makeText(RecyclerViewExampleActivity.this,
                        movie.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


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
