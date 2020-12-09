package com.example.screennavigation.ui.Client;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.screennavigation.R;

public class ClientFragment extends Fragment {

    private ClientViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(ClientViewModel.class);
        View root = inflater.inflate(R.layout.fragment_client, container, false);

        return root;
    }
}