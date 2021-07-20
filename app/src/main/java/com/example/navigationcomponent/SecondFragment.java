package com.example.navigationcomponent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class SecondFragment extends Fragment {

    Button mBtnNavigateThreeFragment;
    RecyclerView mRecyclerView;
    View view;
    TextAdapter textAdapter;
    List<String> mList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_second, container, false);
        mBtnNavigateThreeFragment = view.findViewById(R.id.buttonNavigateThreeFragment);
        mRecyclerView = view.findViewById(R.id.recyclerView);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            mList.add("Index " + i);
        }
        textAdapter = new TextAdapter(mList);
        mRecyclerView.setAdapter(textAdapter);

        mBtnNavigateThreeFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this).navigate(R.id.threeFragment);
            }
        });

    }
}