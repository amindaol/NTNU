package edu.ntnu.idi.idatt;
import java.util.List;
public class MenyClient {
    public static void main(String[] args) {
        // Initialize the menu register
        MenyRegister register = new MenyRegister();

        // Register a few dishes
        Rett rett1 = new Rett("Salat", "Forrett", 50.0, "Enkel salat med tomat og agurk");
        Rett rett2 = new Rett("Biff", "Hovedrett", 200.0, "Grillet biff med tilbehør");
        Rett rett3 = new Rett("Iskrem", "Dessert", 75.0, "Vaniljeis med sjokoladesaus");

        register.registrerRett(rett1);
        register.registrerRett(rett2);
        register.registrerRett(rett3);

        // Create a menu with some dishes
        Meny meny = new Meny(List.of(rett1, rett2, rett3));
        register.registrerMeny(meny);

        // Display the menu
        System.out.println("Registered menu:");
        System.out.println(meny);

        // Find and display all dishes of type "Hovedrett" (main course)
        System.out.println("\nDishes of type 'Hovedrett':");
        for (Rett rett : register.finnRetterAvType("Hovedrett")) {
            System.out.println(rett);
        }
    }
}


