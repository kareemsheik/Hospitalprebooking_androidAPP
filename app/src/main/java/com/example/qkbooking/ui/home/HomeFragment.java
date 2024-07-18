package com.example.qkbooking.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.qkbooking.R;
import com.example.qkbooking.databinding.FragmentHomeBinding;
import com.example.qkbooking.hselect;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        CardView c=root.findViewById(R.id.c1);
        CardView c1=root.findViewById(R.id.c2);
        CardView c2=root.findViewById(R.id.c3);
        CardView c3=root.findViewById(R.id.c4);
        CardView c4=root.findViewById(R.id.c5);
        CardView c5=root.findViewById(R.id.c6);
        CardView c6=root.findViewById(R.id.c7);
        c.setOnClickListener(v -> {Intent i=new Intent(getActivity(), hselect.class);startActivity(i);
            Toast.makeText(getActivity(), "Selected Hospital 1", Toast.LENGTH_SHORT).show();});
        c1.setOnClickListener(v -> {Intent r=new Intent(getActivity(), hselect.class);startActivity(r);
            Toast.makeText(getActivity(), "Selected Hospital 2", Toast.LENGTH_SHORT).show();});
        c2.setOnClickListener(v -> {Intent i=new Intent(getActivity(), hselect.class);startActivity(i);
            Toast.makeText(getActivity(), "Selected Hospital 3", Toast.LENGTH_SHORT).show();});
        c3.setOnClickListener(v -> {Intent i=new Intent(getActivity(), hselect.class);startActivity(i);
            Toast.makeText(getActivity(), "Selected Hospital 4", Toast.LENGTH_SHORT).show();});
        c4.setOnClickListener(v -> {Intent i=new Intent(getActivity(), hselect.class);startActivity(i);
            Toast.makeText(getActivity(), "Selected Hospital 5", Toast.LENGTH_SHORT).show();});

        c5.setOnClickListener(v -> {Intent i=new Intent(getActivity(), hselect.class);startActivity(i);
            Toast.makeText(getActivity(), "Selected Hospital 6", Toast.LENGTH_SHORT).show();});

        c6.setOnClickListener(v -> {Intent i=new Intent(getActivity(), hselect.class);startActivity(i);
            Toast.makeText(getActivity(), "Selected Hospital 7", Toast.LENGTH_SHORT).show();});


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}