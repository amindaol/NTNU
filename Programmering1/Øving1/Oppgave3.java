import java.util.*; //Henter bibliotek for å kunne lese input.
public class Oppgave3 {      // Definerer en offentlig klasse, som jeg kaller oppgave3.

    public static void main(String[] args) throws Exception {   // hovedmetoden, startpunktet til programmet.
        Scanner myScanner = new Scanner(System.in);             // oppretter en scanner for å kunne lese input.
        System.out.println("Skriv inn antall sekunder: ");      // skriver ut tekst til konsollen til brukeren.
        int totalSeconds = myScanner.nextInt();                 // scanner leser inn brukerinput. (int=heltall)

        myScanner.close();                                 // lukker scanneren, for å bla. forhindre feil.

        int hours = (totalSeconds/(60*60));                 // finner ant. hele timer.
        int remainingSeconds = totalSeconds % (60*60);      // finner gjenværende sek. etter ant. hele timer er trukket ut.
        int minutes = remainingSeconds / 60;                // finner ant. hele minutter.
        int seconds = remainingSeconds % 60;                // finner gjenværende sek. etter ant. hele minutter er trukket ut.

        System.out.println(totalSeconds + " sekunder er det samme som " + hours + " timer, " + minutes + " minutter og " + seconds + " sekunder. ");
        // printer svarsetningen.
    }

}