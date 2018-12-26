package com.example.fraglifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("MY_FRAGMENT", "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("MY_FRAGMENT", "onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e("MY_FRAGMENT", "onCreateView");
        return inflater.inflate(R.layout.fragment_layout, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("MY_FRAGMENT", "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("MY_FRAGMENT", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("MY_FRAGMENT", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("MY_FRAGMENT", "onPause");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("MY_FRAGMENT", "onSaveInstanceState");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("MY_FRAGMENT", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("MY_FRAGMENT", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("MY_FRAGMENT", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("MY_FRAGMENT", "onDetach");
    }
}
