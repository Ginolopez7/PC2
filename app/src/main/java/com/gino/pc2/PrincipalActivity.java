package com.gino.pc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.gino.pc2.databinding.ActivityPrincipalBinding;
import com.google.android.material.snackbar.Snackbar;

public class PrincipalActivity extends AppCompatActivity {

    private ActivityPrincipalBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrincipalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.fabAddMovie.setOnClickListener(v -> {
            Snackbar.make(binding.getRoot(), "Add a movie", Snackbar.LENGTH_SHORT).show();
            Snackbar.make(binding.getRoot(), "Add a not", Snackbar.LENGTH_SHORT).show();
            Snackbar.make(binding.getRoot(), "Add a serie", Snackbar.LENGTH_SHORT).show();
        });
    }
}