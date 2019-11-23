package com.example.calculator.length;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;



public class lengthViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public lengthViewModel() {
        mText = new MutableLiveData<>();
    }
}