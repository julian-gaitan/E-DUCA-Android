package com.example.educa.ui.log;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.educa.databinding.FragmentLogBinding;

public class LogFragment extends Fragment {

private FragmentLogBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        LogViewModel dashboardViewModel =
                new ViewModelProvider(this).get(LogViewModel.class);

    binding = FragmentLogBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        //final TextView textView = binding.textLog;
        //dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}