package com.example.tabbedapp.ui.main;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.tabbedapp.R;

/**
 * A simple {@link Fragment} subclass.

 */
public class HomeFragment extends Fragment {

Button mBtnHome;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View x = inflater.inflate(R.layout.fragment_home, container, false);
        mBtnHome=x.findViewById(R.id.btnHome);
        mBtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), " Home Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return x;
    }


}
