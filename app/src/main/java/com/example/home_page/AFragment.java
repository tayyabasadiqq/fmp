package com.example.home_page;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.os.CancellationSignal;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AFragment extends Fragment {




    public AFragment() {
        // Required empty public constructor
    }
    CardView namaz,roza,zakat,hajj;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    View view= inflater.inflate(R.layout.fragment_a, container, false);
    namaz=view.findViewById(R.id.namaz);


    namaz.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getContext(), namazActivity.class);
            startActivity(intent);
        }
    });
    return view;
    }
}