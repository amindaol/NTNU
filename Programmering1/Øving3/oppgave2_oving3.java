import java.util.*;             //Henter bibliotek for å kunne lese input.
public class oppgave2_oving3 {      // Definerer en offentlig klasse, som jeg kaller oppgave1_ov2.

    public static void main(String [] args) throws Exception {      // hovedmetoden, startpunktet til programmet.

    Scanner myScanner = new Scanner (System.in);     // oppretter en scanner for å kunne lese input.

    while(true) {
    System.out.println("Hvilket tall lurer du på om er et primtall? ");      // skriver ut spørsmål
    int number = myScanner.nextInt();                                           // scanner leser inn brukerinput. (int = heltall)

    boolean isPrime = true;

    if(number <=1) {                                                //sjekker om tallet er en eller mindre
        isPrime = false;                                            // Hvis så, er det ikke primtall
    } else {                                                        // hvis det er mer enn en
        for(int i = 2; i <= Math.sqrt(number); i++ ) {              //Sjekker divisor mellom 2 og kvadratroten av tallet 
        if (number % i == 0) {                                      //sjekker om taller er delbart på i
            isPrime = false;                                        // hvis så, er det ikke primtall                                               
            }
        }
    }                               

    if(isPrime) {                                           // Hvis det er primtall, print:
        System.out.println( number + " er et primtall. ");
    } else {                                                    //Hvis ikke, print:
        System.out.println( number + " er ikke et primtall. ");
        }

    System.out.println("Vil du sjekke et annet tall? (ja/nei): ");   // sjekker om bruker vil sjekke flere tall
    String response = myScanner.next(); 
        if (!response.equalsIgnoreCase("ja")) {            
            break; 
    }
    }

    myScanner.close();  // lukker scanneren, for å bla. forhindre feil.
}
}