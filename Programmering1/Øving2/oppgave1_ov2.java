import java.util.*;                                      //Henter bibliotek for å kunne lese input.
public class oppgave1_ov2 {                             // Definerer en offentlig klasse, som jeg kaller oppgave1_ov2.

    public static void main(String[] args) throws Exception { // hovedmetoden, startpunktet til programmet.
        Scanner myScanner = new Scanner (System.in);           // oppretter en scanner for å kunne lese input.
        System.out.println("Skriv inn årstall: ");            // skriver ut tekst til konsollen til brukeren.
        int year = myScanner.nextInt();                       // scanner leser inn brukerinput. (int = heltall)
        boolean leap = false;                               // lager variabel "leap" og setter den som false. 

        if(year % 4 == 0) {                            // sjekker om året kan deles på 4, uten rest.
            if (year % 100 != 0 || (year % 400 == 0)) {  // ser om året er delelig på 100, og 400 for å sjekke skuddår.
                leap = true;                                // hvis alt dette er sant, så er året skuddår.
            }
        } 

            if (leap)                                           // hvis året er skuddår printes linja under.
                System.out.println( year + " er et skuddår." );
            else                                                     // hvis det ikke er skuddår, printes linja under.
                System.out.println( year + " er ikke et skuddår." ); 

            myScanner.close();                                       // lukker scanneren, for å bla. forhindre feil.
        }

}
