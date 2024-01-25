package com.example.educa.ui.prices;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.educa.databinding.FragmentPricesBinding;

public class PricesFragment extends Fragment {

    private FragmentPricesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PricesViewModel pricesViewModel =
                new ViewModelProvider(this).get(PricesViewModel.class);

        binding = FragmentPricesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.text;
        //pricesViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}