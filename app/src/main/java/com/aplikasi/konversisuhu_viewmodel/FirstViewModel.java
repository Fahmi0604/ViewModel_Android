package com.aplikasi.konversisuhu_viewmodel;

import android.util.Log;
import android.view.View;

import androidx.lifecycle.ViewModel;

import com.aplikasi.konversisuhu_viewmodel.databinding.FragmentFirstBinding;

public class FirstViewModel extends ViewModel {
    FragmentFirstBinding binding;
    public Suhu suhu = new Suhu(0.0,0.0,"","");

    public Double Hitung() {
        Double hasilnya=0.0;

        if (suhu.getPilihan1().equals("Celcius") && suhu.getPilihan2().equals("Fahrenheit")){
            hasilnya = (suhu.getInput1() * 9/5) + 32;
        } else if (suhu.getPilihan1().equals("Fahrenheit") && suhu.getPilihan2().equals("Celcius")) {
            hasilnya = (suhu.getInput1() - 32) * 5/9;
        } else if (suhu.getPilihan1().equals("Fahrenheit") && suhu.getPilihan2().equals("Kelvin")) {
            hasilnya = (suhu.getInput1() - 32) * 5/9 + 273.15;
        } else if (suhu.getPilihan1().equals("Celcius") && suhu.getPilihan2().equals("Kelvin")) {
            hasilnya = suhu.getInput1() + 273.15;
        } else if (suhu.getPilihan1().equals("Kelvin") && suhu.getPilihan2().equals("Celcius")) {
            hasilnya = suhu.getInput1() - 273.15;
        } else if (suhu.getPilihan1().equals("Kelvin") && suhu.getPilihan2().equals("Fahrenheit")) {
            hasilnya = (suhu.getInput1() - 273.15) * 9/5 + 32;
        } else {
            hasilnya = suhu.getInput1();
        }
        return hasilnya;
    }

}
