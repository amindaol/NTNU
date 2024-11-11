package edu.ntnu.idi.idatt;

public class ClientArbTaker {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person("Aminda","Lunde", 2005);
        ArbTaker arbTaker1 = new ArbTaker(person1, 1, 2022, 40000, 22, 2024);

        double skattMaanedsLonn = arbTaker1.skattMaanedsLonn();
        int arbTakerNr = arbTaker1.arbTakerNr();
        double aarsLonn = arbTaker1.aarsLonn();
        double skatteTrekkAar = arbTaker1.skatteTrekkAar();
        String name = arbTaker1.name();
        int age = arbTaker1.age();
        int yearsEmployed = arbTaker1.yearsEmployed();
        boolean employedMoreThan = arbTaker1.employedMoreThan(10);

        System.out.println("Journal arbeidstaker: ");
        System.out.println(skattMaanedsLonn + " kr trekkes i skatt pr. måned.");
        System.out.println(arbTakerNr + " er arbeidstakerens arbeidstakernummer. ");
        System.out.println(aarsLonn + " kr er årslønnen.");
        System.out.println(skatteTrekkAar + " kr er skattetrekket pr. år. ");
        System.out.println(name + " er navnet til arbeidstakeren.");
        System.out.println(age + " er alderen til arbeidstakeren.");
        System.out.println(yearsEmployed + " er antall år arbeidstakeren har jobbet i denne bedriften.");

        if (employedMoreThan) {
            System.out.println("Arbeidstakeren har jobbet her i mer enn 10 år.");
        } else {
            System.out.println("Arbeidstakeren har jobbet her i under 10 år.");
        }
    }


}
