import java.util.*; //Henter bibliotek for å kunne lese input.
public class Oppgave2 {     // Definerer en offentlig klasse, som jeg kaller oppgave2.
    public static void main(String[] args) throws Exception {   // hovedmetoden, startpunktet til programmet.
        Scanner myScanner = new Scanner(System.in);             // oppretter en scanner for å kunne lese input.
        System.out.println("Skriv inn antall timer: ");         // skriver ut tekst til konsollen til brukeren.
        int hours = myScanner.nextInt();                       // scanner leser inn brukerinput. (int=heltall)

        System.out.println("Skriv inn antall minutter: ");   // skriver ut tekst til konsollen til brukeren.
        int minutes = myScanner.nextInt();                      // scanner leser inn brukerinput. (int=heltall)

        System.out.println("Skriv inn antall sekunder: ");   // skriver ut tekst til konsollen til brukeren.
        int secondsInput = myScanner.nextInt();                 // scanner leser inn brukerinput. (int=heltall)

        myScanner.close();                                      // lukker scanneren, for å bla. forhindre feil.

        int totalSeconds = (hours * 60 * 60) + (minutes * 60) + secondsInput; // regner ut ant. sekunder.

        System.out.println(hours + " timer, " + minutes + " minutter og " + secondsInput + " sekunder er det samme som " + totalSeconds + " sekunder. ");
        // printer svarsetningen.
    }

}