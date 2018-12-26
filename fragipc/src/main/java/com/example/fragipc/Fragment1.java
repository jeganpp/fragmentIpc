package com.example.fragipc;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;

public class Fragment1 extends Fragment {
    IfcContract contract;
    Button b;
    int count;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1_layout, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.e("MY_FRAG1", "onActivityCreated");
        contract = (IfcContract)getActivity();
        if(savedInstanceState != null && savedInstanceState.containsKey("count")) {
            count = (int)savedInstanceState.get("count");
        } else {
            count = 0;
        }
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        b = (Button)getActivity().findViewById(R.id.bt_click_me);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count ++;
                Log.e("MY_FRAG1", "going to pass " + count);
                contract.respond("clicked " + count + " times");
            }
        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt("count", count);
        super.onSaveInstanceState(outState);
    }

}
