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
            return 0;
        }
        int value = likedNumber.getValue();
        likedNumber.setValue(0 >= n && 0 == value ? 0 : value + n);

        return likedNumber.getValue();
    }
}
