package edu.ntnu.idi.idatt;
import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class ArbTakerMenu {
    public static void main(String[] args) throws Exception {

        Person person1 = new Person("Aminda", "Lunde", 2005);

        ArbTaker arbTaker1 = new ArbTaker(person1, 1, 2022, 40000, 22, 2024);

        Scanner scanner = new Scanner(System.in);

        int valg = -1;

        while (valg != 0) {
            System.out.println("\n=== Meny ===");
            System.out.println("1 - Endre månedslønn");
            System.out.println("2 - Endre skatteprosent");
            System.out.println("3 - Vis informasjon om arbeidstakeren");
            System.out.println("0 - Avslutt");
            System.out.print("Velg et alternativ: ");
            valg = scanner.nextInt();

            switch (valg) {
                case 1:
                    System.out.print("Skriv inn ny månedslønn: ");
                    double nyMaanedsLonn = scanner.nextDouble();
                    arbTaker1.setMaanedsLonn(nyMaanedsLonn);
                    System.out.println("Månedslønn oppdatert.");
                    break;

                case 2:
                    System.out.print("Skriv inn ny skatteprosent: ");
                    double nySkatteProsent = scanner.nextDouble();
                    arbTaker1.setSkatteProsent(nySkatteProsent);
                    System.out.println("Skatteprosent oppdatert.");
                    break;

                case 3:
                    System.out.println("\n=== Arbeidstaker Info ===");
                    System.out.println(arbTaker1.name() + " er navnet til arbeidstakeren.");
                    System.out.println(arbTaker1.age() + " er alderen til arbeidstakeren.");
                    System.out.println(arbTaker1.getArbTakerNr() + " er arbeidstakerens nummer.");
                    System.out.println(arbTaker1.yearsEmployed() + " er antall år arbeidstakeren har jobbet.");
                    System.out.println(arbTaker1.skattMaanedsLonn() + " kr trekkes i skatt pr. måned.");
                    System.out.println(arbTaker1.aarsLonn() + " kr er årslønnen.");
                    System.out.println(arbTaker1.skatteTrekkAar() + " kr er skattetrekket pr. år.");
                    if (arbTaker1.employedMoreThan(10)) {
                        System.out.println("Arbeidstakeren har jobbet her i mer enn 10 år.");
                    } else {
                        System.out.println("Arbeidstakeren har jobbet her i under 10 år.");
                    }
                    break;

                case 0:

                    System.out.println("Avslutter programmet...");
                    break;

                default:
                    System.out.println("Ugyldig valg. Vennligst prøv igjen.");
            }
        }

        scanner.close();
    }
}
