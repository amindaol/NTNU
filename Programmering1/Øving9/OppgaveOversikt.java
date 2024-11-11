package edu.ntnu.idi.idatt;

public class OppgaveOversikt {
    private Student[] students;
    private int antStud = 0;

    public OppgaveOversikt(int size) {
        students = new Student[size];
    }

    //metode for å finne antall studenter registrert
    public int getAntStud() {
        return antStud;
    }

    //metode for å finne ant. oppg. gjort for en spesifikk student
    public int getAntOppgaver(String navn) {
        for(int i = 0; i < antStud; i++) {
            if (students[i].getNavn().equals(navn)) {
                return students[i].getAntOppg();
            }
        }
        return -1;
    }

    //metode for å registrere ny student
    public void registerNewStudent(String navn, int antOppg) {
        students[antStud] = new Student(navn, antOppg);
        antStud++;
    }

    //metode for å øke ant. oppg. for en bestemt student
    public int increaseTaskPerStudent(String navn, int antOppg) {
        for(int i = 0; i < antStud; i++) {
            if (students[i].getNavn().equals(navn)) {
                students[i].setAntOppg(students[i].getAntOppg() + antOppg);
                return students[i].getAntOppg();
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Oversikt over studenter:\n");
        for (int i = 0; i < antStud; i++) {
            result.append(students[i].toString()).append("\n");
        }
        return result.toString();
    }
}
