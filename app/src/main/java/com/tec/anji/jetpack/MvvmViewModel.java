package com.tec.anji.jetpack;

import androidx.lifecycle.ViewModel;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MvvmViewModel extends ViewModel {

    private int number;

    public void add(Integer number) {
        this.number += number;
    }
}
