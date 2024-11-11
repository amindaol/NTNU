import java.util.Random;

public class MyRandom {         //klasse
    
    private Random random;      //instansvariabel

    public MyRandom() {         // konstruktøri
        random = new Random();
    }

    public int nesteHeltall(int nedre, int ovre) {  //metode
        if (ovre - nedre <= 1) {
            throw new IllegalArgumentException("Ugyldig intervall. Det må være plass til minst ett tall mellom nedre og ovre.");
        }
        return random.nextInt(ovre - nedre + 1) + nedre;
    }

    public double nesteDesimaltall(double nedre, double ovre) {  //metode
        if (nedre >= ovre) {
            throw new IllegalArgumentException("Nedre må være mindre enn ovre.");
        }
        return (random.nextDouble() * (ovre -  nedre)) + nedre;
    }

    public static void main(String[] args) throws Exception {       // main metode
        MyRandom myRandom = new MyRandom();                         // objekt

        System.out.println("Tilfeldige heltall i intervallet (10, 20) : ");        //generere heltall
        for (int i = 0; i < 10; i++) {
            System.out.println(myRandom.nesteHeltall(10,20));
        }

        System.out.println(" ");
        
        System.out.println("Tilfeldige desimaltall i intervallet (0.0, 1.0) : ");   //generere desimaltall
        for (int i = 0; i < 10; i++) {
            System.out.println(myRandom.nesteDesimaltall(0.0, 1.0));
        }
}
    }


