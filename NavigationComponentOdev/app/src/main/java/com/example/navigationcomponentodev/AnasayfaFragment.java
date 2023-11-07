package com.example.navigationcomponentodev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponentodev.databinding.ActivityMainBinding;
import com.example.navigationcomponentodev.databinding.FragmentAnasayfaBinding;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);

        binding.buttonASayfa.setOnClickListener(v->{
            Navigation.findNavController(v).navigate(R.id.sayfaAGecis);
        });

        binding.buttonXSayfa.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.sayfaXGecis);
        });

        return binding.getRoot();
    }
}