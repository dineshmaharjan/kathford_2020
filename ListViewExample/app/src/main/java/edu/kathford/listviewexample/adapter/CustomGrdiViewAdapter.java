package edu.kathford.listviewexample.adapter;

import android.app.Activity;
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

public class CustomGrdiViewAdapter extends ArrayAdapter<Movie> {


    private ArrayList<Movie> movieArrayList;
    private Activity context;
    public CustomGrdiViewAdapter(Activity context,
                                 ArrayList<Movie> movieArrayList) {
        super(context, R.layout.item_grid, movieArrayList);
        this.movieArrayList = movieArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {

        LayoutInflater inflater =context.getLayoutInflater();
        View view =inflater.inflate(R.layout.item_grid,parent,
                false);

        ImageView imageView = view.findViewById(R.id.movieImageView);
        TextView titleTextView = view.findViewById(R.id.movieTitleTextView);

        Movie movie = movieArrayList.get(position);

        titleTextView.setText(movie.getTitle());
        Picasso.get().load(movie.getImageUrl()).into(imageView);

        return view;
    }

}
