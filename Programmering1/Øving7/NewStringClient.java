import java.util.Scanner;

public class NewStringClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        NewString newString = new NewString(userInput);

        String shortenedText = newString.shorten();
        System.out.println("Shortened Text: " + shortenedText);

        System.out.print("Enter a character to remove: ");
        char charToRemove = scanner.nextLine().charAt(0);

        String textWithoutChar = newString.removeCharacter(charToRemove);
        System.out.println("Text after removing '" + charToRemove + "': " + textWithoutChar);

        scanner.close();
    }
}







