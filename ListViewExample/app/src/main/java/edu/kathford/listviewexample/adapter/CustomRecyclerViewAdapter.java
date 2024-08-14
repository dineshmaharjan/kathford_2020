package edu.kathford.listviewexample.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import edu.kathford.listviewexample.R;
import edu.kathford.listviewexample.model.Movie;


public class CustomRecyclerViewAdapter extends
        RecyclerView.Adapter<CustomRecyclerViewAdapter.CustomViewHolder>{

    private ArrayList<Movie> movieArrayList;
    CustomOnItemClickListener listener;

    public CustomRecyclerViewAdapter(ArrayList<Movie> movieArrayList,
                                     CustomOnItemClickListener listener) {
        this.movieArrayList = movieArrayList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_movie,
                parent,
                false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        Movie movie = movieArrayList.get(position);

        holder.titleTextView.setText(movie.getTitle());
        holder.releaseDateTextView.setText(movie.getReleaseDate());

        Picasso.get().load(movie.getImageUrl()).into(holder.posterImageView);

        holder.posterImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(movie);
            }
        });

    }

    @Override
    public int getItemCount() {
        return movieArrayList.size();
    }

    class CustomViewHolder extends  RecyclerView.ViewHolder{

        ImageView posterImageView;
        TextView titleTextView;
        TextView releaseDateTextView;


        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            posterImageView = itemView.findViewById(R.id.posterImageView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            releaseDateTextView = itemView.findViewById(R.id.releaseDate);
        }
    }

    public interface  CustomOnItemClickListener{
        void onClick(Movie movie);
    }


}
