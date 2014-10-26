package com.example.babies;

/**
 * Created by VoldHouse on 10/26/2014.
 */
public class babies {
    //clasa separata care va fi importata in main
    //au fost generati constructor, getteri si setteri
    //click dreapta generate->constructor generate->getter and setter
    private String nume;
    private boolean isMale;
    private double weight;
    private double decibels;
    private int numPoops=0;

    public babies(String nume, boolean isMale, double weight, double decibels, int numPoops) {
        this.nume = nume;
        this.isMale = isMale;
        this.weight = weight;
        this.decibels = decibels;
        this.numPoops = numPoops;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDecibels() {
        return decibels;
    }

    public void setDecibels(double decibels) {
        this.decibels = decibels;
    }

    public int getNumPoops() {
        return numPoops;
    }

    public void setNumPoops(int numPoops) {
        this.numPoops = numPoops;
    }
    public void afisare()
    {
        System.out.println("Detaliile bebelusului sunt:\n" +
                "Nume:"+getNume() +
                "\nDecibeli:"+getDecibels()+
                "\nNo.Poops:"+getNumPoops()+
                "\nGreutate:"+getWeight());
    }
    public void poop(){
        numPoops++;
    }
}
