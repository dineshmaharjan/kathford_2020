package edu.kathford.listviewexample.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import edu.kathford.listviewexample.R;
import edu.kathford.listviewexample.model.Movie;

public class CustomListViewAdapter extends ArrayAdapter<Movie> {

    private ArrayList<Movie> movieArrayList;
    private  Activity context;
    public CustomListViewAdapter(Activity context,
                                 ArrayList<Movie> movieArrayList) {
        super(context, R.layout.item_movie, movieArrayList);
        this.movieArrayList = movieArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {

        LayoutInflater inflater =context.getLayoutInflater();
        View view =inflater.inflate(R.layout.item_movie,parent,
                false);

        ImageView imageView = view.findViewById(R.id.posterImageView);
        TextView titleTextView = view.findViewById(R.id.titleTextView);
        TextView releaseDateTextView = view.findViewById(R.id.releaseDate);

        Movie movie = movieArrayList.get(position);

        titleTextView.setText(movie.getTitle());
        releaseDateTextView.setText(movie.getReleaseDate());
        Picasso.get().load(movie.getImageUrl()).into(imageView);

        return view;
    }
}
