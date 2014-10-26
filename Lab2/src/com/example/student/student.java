package com.example.student;

/**
 * Created by VoldHouse on 10/26/2014.
 */
public class student {
    private String nume;
    private String prenume;
    private boolean IsMilitar;
    private double medie;
    private int nr_matricol;

    public student(String nume, String prenume, boolean isMilitar, double medie, int nr_matricol) {
        this.nume = nume;
        this.prenume = prenume;
        IsMilitar = isMilitar;
        this.medie = medie;
        this.nr_matricol = nr_matricol;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public boolean isMilitar() {
        return IsMilitar;
    }

    public void setMilitar(boolean isMilitar) {
        IsMilitar = isMilitar;
    }

    public double getMedie() {
        return medie;
    }

    public void setMedie(double medie) {
        this.medie = medie;
    }

    public int getNr_matricol() {
        return nr_matricol;
    }

    public void setNr_matricol(int nr_matricol) {
        this.nr_matricol = nr_matricol;
    }
    public void afisare_student()
    {
        System.out.println("Studentul este:\n"+
        "Nume:"+getNume()+
        "\nPrenume:"+getPrenume()+
        "\nMedia:"+getMedie()+
        "\nNr_matricol:"+getNr_matricol());
    }
}
