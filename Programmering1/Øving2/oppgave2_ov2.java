public class oppgave2_ov2 {         // Definerer en offentlig klasse, som jeg kaller oppgave2_ov2.

    public static void main(String[] args) throws Exception {       // hovedmetoden, startpunktet til programmet.
        double kjottdeigA = (35.9 / 450);                   // merke A sin kjøttdeig, kr delt på gram.
        double kjottdeigB = (39.5 / 500);                   // merke B sin kjøttdeig, kr delt på gram.

        if (kjottdeigA > kjottdeigB) // Hvis variabelen kjøttdeig A er større, printes det at kjøttdeig B er billigst.
            System.out.println("Kjøttdeig av merke B er billigst. ");
        else                        // Hvis ikke, printes det at kjøttdeig A er billigst.
            System.out.println("Kjøttdeig av merke A er billigst. ");
    }

}