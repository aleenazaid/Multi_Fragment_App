package com.example.multifragmentapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FileDetailFragment extends Fragment {

    private static final String ARG_FILE_NAME = "file_name";

    public static FileDetailFragment newInstance(String fileName) {
        FileDetailFragment fragment = new FileDetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_FILE_NAME, fileName);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_file_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView fileDetailTextView = view.findViewById(R.id.file_detail_text_view);

        if (getArguments() != null) {
            String fileName = getArguments().getString(ARG_FILE_NAME);
            fileDetailTextView.setText("Details for file: " + fileName);
        }
    }
}
