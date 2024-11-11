public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {   // konstruktør 1
        if (denominator == 0) {
            throw new IllegalArgumentException("Nevneren kan ikke være 0");  // feilmelding hvis nevner er 0
        }
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public Fraction(int numerator) {            // konstruktør 2
        this(numerator, 1);
    }

    public int getNumerator() {             // get metode for teller
        return numerator;
    }       

    public int getDenominator() {           // get metode for nevner
        return denominator;
    }

    public void add(Fraction other) {               // +
        this.numerator = (this.numerator * other.getDenominator()) + (other.getNumerator() * this.denominator);
        this.denominator = (this.denominator * other.getDenominator());
        simplify();
    }

    public void subtract(Fraction other) {      // -
        this.numerator = (this.numerator * other.getDenominator()) - (other.getNumerator() * this.denominator);
        this.denominator = (this.denominator * other.getDenominator());
        simplify();
    }

    public void multiply(Fraction other) {      // *
        this.numerator = (this.numerator * other.getNumerator());
        this.denominator = (this.denominator * other.getDenominator());
        simplify();
    }

    public void divide(Fraction other) {        // /
        if (other.getNumerator() == 0) {
            throw new IllegalArgumentException("Kan ikke dele med en brøk som har nevner = 0");
        }
        this.numerator = (this.numerator * other.getDenominator());
        this.denominator = (this.denominator * other.getNumerator());
        simplify();
    }

    private void simplify() {       // forenkle brøken (greatest common divisor)
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    private int gcd(int a, int b) {     //forenkle brøken
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }

    public static void main(String[] args) throws Exception {       //main metode
        Fraction fraction1 = new Fraction(1, 2);    // objekt
        Fraction fraction2 = new Fraction(4, 10);     // objekt

        System.out.println("Brøk 1: " + fraction1.getNumerator() + "/" + fraction1.getDenominator());
        System.out.println("Brøk 2: " + fraction2.getNumerator() + "/" + fraction2.getDenominator());

        fraction1.add(fraction2);  
        System.out.println("Etter addisjon: " + fraction1.getNumerator() + "/" + fraction1.getDenominator());

        fraction1 = new Fraction(1, 2);
        fraction1.subtract(fraction2); 
        System.out.println("Etter subtraksjon: " + fraction1.getNumerator() + "/" + fraction1.getDenominator());

        fraction1 = new Fraction(1, 2);
        fraction1.multiply(fraction2);  
        System.out.println("Etter multiplikasjon: " + fraction1.getNumerator() + "/" + fraction1.getDenominator());

        fraction1 = new Fraction(1, 2);
        fraction1.divide(fraction2);  
        System.out.println("Etter divisjon: " + fraction1.getNumerator() + "/" + fraction1.getDenominator());
    }
}