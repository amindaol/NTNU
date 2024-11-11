package edu.ntnu.idi.idatt;

public class Rett {
    private String navn;
    private String type;
    private double pris;
    private String oppskrift;

    public Rett(String navn, String type, double pris, String oppskrift) {
        this.navn = navn;
        this.type = type;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

    public String getNavn() {
        return navn;
    }

    public String getType() {
        return type;
    }

    public double getPris() {
        return pris;
    }

    public String getOppskrift() {
        return oppskrift;
    }

    public String toString() {
        return navn + " ( " + type + " ) - " + pris + " NOK\\nOppskrift: " + oppskrift;
    }
}
