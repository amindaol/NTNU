package edu.ntnu.idi.idatt;
import java.util.Scanner;

public class OppgaveOversiktClient {
    public static void main(String [] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        OppgaveOversikt oversikt = new OppgaveOversikt(15);

        boolean running = true;

        while (running) {
            System.out.println("\nVelg et alternativ:");
            System.out.println("1. Registrer ny student");
            System.out.println("2. Øk antall oppgaver for en student");
            System.out.println("3. Vis oversikt over alle studenter");
            System.out.println("4. Avslutt");
            System.out.print("Ditt valg: ");
            int valg = scanner.nextInt();
            scanner.nextLine();

            switch (valg) {
                case 1:
                    System.out.print("Skriv inn studentens navn: ");
                    String navn = scanner.nextLine();
                    System.out.print("Skriv inn antall oppgaver studenten har fullført: ");
                    int antOppg = scanner.nextInt();
                    scanner.nextLine();

                    oversikt.registerNewStudent(navn, antOppg);
                    System.out.println("Student " + navn + " er registrert med " + antOppg + " fullførte oppgaver.");
                    break;

                case 2:
                    System.out.print("Skriv inn navnet på studenten: ");
                    navn = scanner.nextLine();
                    System.out.print("Skriv inn antall oppgaver som skal legges til: ");
                    int oppgaverÅLeggeTil = scanner.nextInt();
                    scanner.nextLine();

                    int nyttAntOppg = oversikt.increaseTaskPerStudent(navn, oppgaverÅLeggeTil);
                    if (nyttAntOppg != -1) {
                        System.out.println("Antall oppgaver for " + navn + " er nå " + nyttAntOppg + ".");
                    } else {
                        System.out.println("Studenten " + navn + " ble ikke funnet.");
                    }
                    break;

                case 3:
                    System.out.println("\nOversikt over alle studenter:");
                    System.out.println(oversikt);
                    break;

                case 4:
                    System.out.println("Avslutter programmet.");
                    running = false;
                    break;

                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
                    break;
            }
        }

        scanner.close();
    }
}
