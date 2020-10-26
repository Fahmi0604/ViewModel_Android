package com.aplikasi.konversisuhu_viewmodel;

public class Suhu {
    private Double input1;
    private Double input2;
    String pilihan1;
    String pilihan2;

    public Suhu() {
    }

    public Suhu(Double input1, Double input2, String pilihan1, String pilihan2) {
        this.input1 = input1;
        this.input2 = input2;
        this.pilihan1 = pilihan1;
        this.pilihan2 = pilihan2;
    }

    public Double getInput1() {
        return input1;
    }

    public void setInput1(Double input1) {
        this.input1 = input1;
    }

    public Double getInput2() {
        return input2;
    }

    public void setInput2(Double input2) {
        this.input2 = input2;
    }

    public String getPilihan1() {
        return pilihan1;
    }

    public void setPilihan1(String pilihan1) {
        this.pilihan1 = pilihan1;
    }

    public String getPilihan2() {
        return pilihan2;
    }

    public void setPilihan2(String pilihan2) {
        this.pilihan2 = pilihan2;
    }
}
