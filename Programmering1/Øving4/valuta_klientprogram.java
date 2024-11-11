import java.util.*;

public class valuta_klientprogram {
    
    public static void main(String[] args) {
        valuta nok = new valuta("Norske kroner", 1.00, "NOK");
        valuta sek = new valuta("Svenske kroner", 1.04, "SEK");
        valuta usd = new valuta("Dollar", 10.61, "USD");
        valuta eur = new valuta("Euro", 11.79, "EUR");


        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 4) {
            System.out.println(); 
            System.out.println("Velg en valuta du vil konvertere til/fra NOK: ");
            System.out.println(); 
            System.out.println("1. Svenske kroner (SEK)");
            System.out.println("2. Dollar (USD)");
            System.out.println("3. Euro (EUR)");
            System.out.println("4. Jeg ønsker å avslutte");
            System.out.println(); 
            System.out.println("Skriv inn nummeret til valutaen du ønsker:");
            choice = scanner.nextInt();

            valuta chosenValuta = null;

            switch (choice) {
                case 1:
                    chosenValuta = sek;
                    break;
                case 2:
                    chosenValuta = usd;
                    break;
                case 3:
                    chosenValuta = eur;
                    break;
                case 4:
                    System.out.println("Avslutter. Takk for nå! ");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Ugyldig svar :( ");
                    continue;
        }

            if (choice == 4) {
                break;
        }
            System.out.println(); 
            System.out.println("Du valgte" + " " + chosenValuta.getName());
            System.out.println(); 
            System.out.println("Ønsker du å:");
            System.out.println("1. Konvertere fra NOK til " + chosenValuta.getName());
            System.out.println("2. Konvertere fra " + chosenValuta.getName() + " til NOK");

            int convertChoice = scanner.nextInt();

            System.out.println(); 
            System.out.println("Skriv inn beløpet du vil konvertere: ");
            double amount = scanner.nextDouble();

            double convertedAmount = 0;

            if (convertChoice == 1) {
                convertedAmount = amount / chosenValuta.getExchangeRate();
                System.out.printf("%.2f NOK = %.2f %s%n", amount, convertedAmount, chosenValuta.getName());
            } else if (convertChoice == 2) {
                convertedAmount = amount * chosenValuta.getExchangeRate();
                System.out.printf("%.2f %s = %.2f NOK%n", amount, chosenValuta.getName(), convertedAmount);
            } else {
                System.out.println("Ugyldig konverteringsvalg :(");
        }       
        
        System.out.println(); 
    }
        scanner.close();

    }
}
