import java.util.*; //Henter bibliotek for å kunne lese input.
public class Oppgave1 {  // Definerer en offentlig klasse, som jeg kaller Oppgave1.
  public static void main(String[] args) throws Exception {  // hovedmetoden, startpunktet til programmet.
    Scanner myScanner = new Scanner(System.in);             // oppretter en scanner for å kunne lese input.
    System.out.println("Skriv inn antall tommer: ");      // skriver ut tekst til konsollen til brukeren.
    double inch = myScanner.nextDouble();                   // scanner leser inn brukerinput. (double = desimaltall)
    double cm = 2.54*inch;                                  // omgjør tommer til cm.

    myScanner.close();                                      // lukker scanneren, for å bla. forhindre feil.

    System.out.println(inch + " tommer er lik " + cm + " cm.");  //printer hva ant. tommer er i cm. 
  }
}