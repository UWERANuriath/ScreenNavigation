package com.example.screennavigation.ui.manage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.screennavigation.R;
import com.example.screennavigation.ui.History.HistoryViewModel;

public class ManageFragment extends Fragment {
    private HistoryViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_managelayout , container, false);
        return root;
    }
}

