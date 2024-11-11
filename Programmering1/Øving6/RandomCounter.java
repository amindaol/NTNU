public class RandomCounter {                      // oppretter klasse RandomCounter
    java.util.Random random = new java.util.Random();   //oppretter random objekt
    int[] quantity = new int[10];                      // Array,plass til 10 heltall (0, 9)


    public void registerNumber(int quantityPasses) {         // metode for å registrere antall ganger vi genererer tilfeldige tall
        for (int i = 0; i < quantityPasses; i++) {          // for-løkke som teller antall "passeringer" av tall
            int number = random.nextInt(10);         // random tall (0-9)
            quantity[number]++;                             //øke verdien i quantity-arrayet
        }
    }

    public void printQuantity() {                           //metode for å finne antall ganger hvert tall ble trukket.
        for (int i = 0; i < quantity.length; i++) {
            System.out.println("Tallet " + i + " ble trukket " + quantity[i] + " ganger.");
        }
    }

    public static void main(String[] args) throws Exception {       //hovedmetoden
        RandomCounter counter = new RandomCounter();                //lager nytt objekt counter
        counter.registerNumber(1000);                 //Registrerer 1000 tilfeldige tall
        counter.printQuantity();                                   // printer antall av hvert tall
    }
}
