package edu.ntnu.idi.idatt;

public class ArbTaker {
    private final Person person;
    private final int arbTakerNr;
    private final int ansettelsesAar;
    private double maanedsLonn;
    private double skatteProsent;
    private final int year;

    public ArbTaker(Person person, int arbTakerNr, int ansettelsesAar, double maanedsLonn, double skatteProsent, int year) {
        this.person = person;
        this.arbTakerNr = arbTakerNr;
        this.ansettelsesAar = ansettelsesAar;
        this.maanedsLonn = maanedsLonn;
        this.skatteProsent = skatteProsent;
        this.year = year;
    }

    public Person getPerson() {
        return person;
    }

    public int getArbTakerNr() {
        return arbTakerNr;
    }

    public int getAnsettelsesAar() {
        return ansettelsesAar;
    }

    public double getMaanedsLonn() {
        return maanedsLonn;
    }

    public double getSkatteProsent() {
        return skatteProsent;
    }

    public int getYear() {
        return year;
    }

    public void setMaanedsLonn(double newMaanedsLonn) {
        this.maanedsLonn = newMaanedsLonn;
    }

    public void setSkatteProsent(double newSkatteProsent) {
        this.skatteProsent = newSkatteProsent;
    }

    public int arbTakerNr() {
        return arbTakerNr;

    }
    public double skattMaanedsLonn() {
        return maanedsLonn * (skatteProsent / 100);
    }

    public double aarsLonn() {
        return maanedsLonn * 12;
    }

    public double skatteTrekkAar() {
        return aarsLonn() * (skatteProsent / 100) * (10.5 / 12);
    }

    public String name() {
        return person.getLastName() + ", " + person.getFirstName();
    }

    public int age () {
        return year - person.getBirthYear();
    }

    public int yearsEmployed () {
        return year - ansettelsesAar;
    }

    public boolean employedMoreThan(int threshold) {
        return yearsEmployed() > threshold;
    }

}
