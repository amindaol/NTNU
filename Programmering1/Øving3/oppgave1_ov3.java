import java.util.*;             //Henter bibliotek for å kunne lese input.
public class oppgave1_ov3 {     // Definerer en offentlig klasse, som jeg kaller oppgave1_ov2.

    public static void main (String[] args) throws Exception {  // hovedmetoden, startpunktet til programmet.

    Scanner myScanner = new Scanner (System.in);                // oppretter en scanner for å kunne lese input.
    System.out.println("Hvilken del av multiplilkasjonstabellen vil du ha skrevet ut fra? "); // skriver ut spørsmål
    int numberStart = myScanner.nextInt();                      // scanner leser inn brukerinput. (int = heltall)

    System.out.println("Hvilken del av multiplikasjonstabellen vil du ha skrevet ut til? "); // skriver ut spørsmål
    int numberEnd = myScanner.nextInt();                        // scanner leser inn brukerinput. (int = heltall)

    if(numberStart > numberEnd) {                              // Legger inn kontroll av inndata.
    System.out.println("Sluttverdien må være høyere enn startverdien. ");
    System.exit(0);
    }
    
    for(int k = numberStart; k <= numberEnd; k++) {    //opretter de forskjellige tabellene (tittel)
        System.out.println(k + "-gangen");              // printer navnet til tabellen

        for(int l = 1; l <= 10; l++) {                  // kjører l for 1 til 10, øker med en. 
            int m = k * l;                                 // ganger k med l.
            System.out.println(k + "x"  + l + " = " + m); // printer selve tabellen.
        }
        System.out.println(" - - -");   // print for å "rydde" mellom tabellene
    }

    myScanner.close();                                   // lukker scanneren, for å bla. forhindre feil.
    }
}