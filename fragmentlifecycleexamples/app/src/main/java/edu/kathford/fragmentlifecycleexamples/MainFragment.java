package edu.kathford.fragmentlifecycleexamples;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {

    private String TAG = MainFragment.class.getSimpleName();


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i(TAG, "onAttach() callback");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate() callback");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        Log.i(TAG, "onCreateView() callback");
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() callback");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() callback");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() callback");
    }


    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() callback");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach() callback");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView() callback");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() callback");
    }
}
