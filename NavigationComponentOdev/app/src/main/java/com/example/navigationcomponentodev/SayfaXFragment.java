package com.example.navigationcomponentodev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponentodev.databinding.FragmentSayfaABinding;
import com.example.navigationcomponentodev.databinding.FragmentSayfaXBinding;

public class SayfaXFragment extends Fragment {
    private FragmentSayfaXBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaXBinding.inflate(inflater, container, false);

        binding.buttonYSayfa2.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.sayfaYGecis);
        });

        return binding.getRoot();
    }
}