package com.example.educa.ui.testimonies;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TestimoniesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TestimoniesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
