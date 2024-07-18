package com.example.qkbooking.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.qkbooking.R;
import com.example.qkbooking.databinding.FragmentGalleryBinding;
import com.example.qkbooking.dataffetcher;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;
    private EditText usernameEditText;
    private EditText passwordEditText;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
      usernameEditText= root.findViewById(R.id.editText_username);
      passwordEditText=root.findViewById(R.id.editText_password);
        Button loginButton = root.findViewById(R.id.button_login);
        loginButton.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            // Implement logic to validate credentials (e.g., call a server-side API)
            // Here's a placeholder for validation (replace with your actual logic)
            if ((username.equals("Hospital1") && password.equals("hospital1@123") )||(username.equals("Hospital2") && password.equals("hospital2@123")) || (username.equals("Hospital3") && password.equals("hospital3@123"))|| (username.equals("Hospital4") && password.equals("hospital4@123")) ||(username.equals("Hospital5") && password.equals("hospital5@123"))) {

                Intent intent = new Intent(getActivity(), dataffetcher.class);
                startActivity(intent);
                usernameEditText.setText("");
                passwordEditText.setText("");
                Toast.makeText(getActivity(), "Login Successfully", Toast.LENGTH_SHORT).show();


            } else {
                // Login failed
                Toast.makeText(getActivity(), "Invalid username or password", Toast.LENGTH_SHORT).show();
            }
            username=null;
            password=null;
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}