import java.util.Scanner;

public class StringClassClient {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in en tekst som skal analyseres: ");
        String text = scanner.nextLine();

        StringClass analysis = new StringClass(text);

        System.out.println("Antall forskjellige bokstaver: " + analysis.findNumberOfDifferentLetters());
        System.out.println("Totalt antall bokstaver: " + analysis.findTotalNumberLetter());
        System.out.println("Andel av tegn som ikke er bokstaver: " + analysis.findNumberNotLetter() + "%");
        System.out.println("Antall av bokstaven 'a': " + analysis.findNumberOfSpecificLetter('a'));
        System.out.println("Vanligste bokstav(er): " + analysis.findCommonLetter());

        scanner.close();
    }
}

