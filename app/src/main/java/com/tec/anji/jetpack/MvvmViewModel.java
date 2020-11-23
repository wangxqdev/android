package com.tec.anji.jetpack;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import lombok.ToString;

@ToString
public class MvvmViewModel extends ViewModel {

    private MutableLiveData<Integer> likedNumber;

    public MutableLiveData<Integer> getLikedNumber() {
        if (null == likedNumber) {
            likedNumber = new MutableLiveData<>(0);
        }

        return likedNumber;
    }

    public Integer addLikedNumber(int n) {
        if (null == likedNumber) {
            return -1;
        }
        likedNumber.setValue(likedNumber.getValue() + n);

        return likedNumber.getValue();
    }
}
