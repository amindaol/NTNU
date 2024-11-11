import java.util.Scanner;

public class TextProcessingClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn en tekst:");
        String userInput = scanner.nextLine();

        TextProcessing tp = new TextProcessing(userInput);

        System.out.println("Antall ord i teksten: " + tp.wordCount());
        System.out.println("Gjennomsnittlig ordlengde: " + tp.averageWordLength());
        System.out.println("Gjennomsnittlig antall ord i en setning: " + tp.averageWordsPerSentence());

        System.out.println("Skriv inn et ord du vil erstatte:");
        String oldWord = scanner.nextLine();
        System.out.println("Skriv inn ordet du vil erstatte det med:");
        String newWord = scanner.nextLine();
        tp.replaceWord(oldWord, newWord);

        System.out.println("Teksten etter å ha byttet ord: " + tp.getText());

        System.out.println("Teksten i store bokstaver: " + tp.getTextInUpperCase());

        scanner.close();
    }
}



