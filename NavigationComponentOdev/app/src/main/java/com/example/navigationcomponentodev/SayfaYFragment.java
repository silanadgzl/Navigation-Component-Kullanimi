package com.example.navigationcomponentodev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponentodev.databinding.FragmentSayfaBBinding;
import com.example.navigationcomponentodev.databinding.FragmentSayfaYBinding;

public class SayfaYFragment extends Fragment {
    private FragmentSayfaYBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaYBinding.inflate(inflater, container, false);
        binding.buttonGeriDonus.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.anaSayfaDon);
        });
        return binding.getRoot();
    }
}