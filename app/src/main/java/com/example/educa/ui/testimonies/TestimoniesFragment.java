package com.example.educa.ui.testimonies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.educa.databinding.FragmentTestimoniesBinding;

public class TestimoniesFragment extends Fragment {

    private FragmentTestimoniesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TestimoniesViewModel testimoniesViewModel =
                new ViewModelProvider(this).get(TestimoniesViewModel.class);

        binding = FragmentTestimoniesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.text;
        //testimoniesViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}