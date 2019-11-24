package com.example.calculator.length;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class LengthViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LengthViewModel() {
        mText = new MutableLiveData<>();
    }
}