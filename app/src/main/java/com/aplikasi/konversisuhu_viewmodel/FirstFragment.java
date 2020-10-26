package com.aplikasi.konversisuhu_viewmodel;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.aplikasi.konversisuhu_viewmodel.databinding.FragmentFirstBinding;


public class FirstFragment extends Fragment {

    private static  final  String[] tipeSuhu = {"Celcius","Fahrenheit","Kelvin"};
    public FirstViewModel mViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final FragmentFirstBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false);
        mViewModel = new ViewModelProvider(this).get(FirstViewModel.class);
        binding.setLifecycleOwner(this);
        binding.setFirstViewModel(mViewModel);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_dropdown_item, tipeSuhu);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.Spinner.setAdapter(adapter);
        binding.Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                mViewModel.suhu.setPilihan1(tipeSuhu[i]);
                Log.d("Pilihan 1", mViewModel.suhu.getPilihan1());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        binding.Spinner2.setAdapter(adapter);
        binding.Spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                mViewModel.suhu.setPilihan2(tipeSuhu[i]);
                Log.d("Pilihan 2", mViewModel.suhu.getPilihan2());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewModel.suhu.setInput1(Double.valueOf(binding.ET1.getText().toString()));
//                mViewModel.suhu.setInput2(Integer.parseInt(binding.ET2.getText().toString()));
                Log.d("Input aku", mViewModel.suhu.getInput1()+" "+mViewModel.suhu.getInput2());
                binding.ET2.setText(Double.toString(mViewModel.Hitung()));
                Log.d("hasilku", Double.toString(mViewModel.Hitung()));
            }
        });

        return binding.getRoot();
    }
}