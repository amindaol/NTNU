package edu.ntnu.idi.idatt;

public class Student {
    private final String navn;
    private int antOppg;

    public Student(String navn, int antOppg) {
        this.navn = navn;
        this.antOppg = antOppg;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntOppg() {
        return antOppg;
    }

    public void setAntOppg(int antOppg) {
        this.antOppg = antOppg;
    }

    public void okAntOppg(int okning) {
        if (okning > 0) {
            antOppg += okning;
        } else {
            System.out.println("Error: Cannot increase by a negative number.");
        }
    }

    public String toString() {
        return navn + ", " + antOppg + " oppgaver fullført.";
    }
}
