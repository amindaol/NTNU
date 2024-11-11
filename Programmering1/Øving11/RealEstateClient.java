package edu.ntnu.idi.idatt;

import java.util.Scanner;
import java.util.List;

public class RealEstateClient {

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    RealEstateRegistry registry = new RealEstateRegistry();

    RealEstate estate1 = new RealEstate(1445, "Gloppen", 77, 631, null, 1017.6, "Jens Olsen");
    RealEstate estate2 = new RealEstate(1445, "Gloppen", 77, 131, "Syningom", 661.3,
        "Nicolay Madsen");
    RealEstate estate3 = new RealEstate(1445, "Gloppen", 75, 19, "Fugletun", 650.6,
        "Evilyn Jensen");
    RealEstate estate4 = new RealEstate(1445, "Gloppen", 74, 188, null, 1457.2, "Karl Ove Bråten");
    RealEstate estate5 = new RealEstate(1445, "Gloppen", 69, 47, "Høiberg", 1339.4,
        "Elsa Indregård");

    registry.addRealEstate(estate1);
    registry.addRealEstate(estate2);
    registry.addRealEstate(estate3);
    registry.addRealEstate(estate4);
    registry.addRealEstate(estate5);

    boolean running = true;
    while (running) {
      System.out.println("\n--- Real Estate Register Menu ---");
      System.out.println("1. Register a new real estate");
      System.out.println("2. Remove a real estate");
      System.out.println("3. Find number of real estates");
      System.out.println("4. Find real estate from estateID");
      System.out.println("5. Find average area of real estate");
      System.out.println("6. Find all estates with a given lot number");
      System.out.println("7. Exit");

      System.out.print("Choose an option (1-7): ");
      int choice = scanner.nextInt();
      scanner.nextLine(); // Consume newline

      switch (choice) {
        case 1:
          addRealEstate(scanner, registry);
          break;
        case 2:
          removeRealEstate(scanner, registry);
          break;
        case 3:
          getNumberOfEstates(scanner, registry);
          break;
        case 4:
          getRealEstate(scanner, registry);
          break;
        case 5:
          averageArea(scanner, registry);
          break;
        case 6:
          findEstateByLotNumber(scanner, registry);
          break;
        case 7:
          running = false;
          System.out.println("Exiting the program. Goodbye!");
          break;
        default:
          System.out.println("Invalid choice. Please choose a valid option.");
      }
    }
    scanner.close();
  }

  public static void addRealEstate(Scanner scanner, RealEstateRegistry registry) {
    System.out.print("Enter municipality number: ");
    int municipalityNumber = scanner.nextInt();
    scanner.nextLine(); // consume newline
    System.out.print("Enter municipality name: ");
    String municipalityName = scanner.nextLine();
    System.out.print("Enter lot number: ");
    int lotNumber = scanner.nextInt();
    System.out.print("Enter section number: ");
    int sectionNumber = scanner.nextInt();
    scanner.nextLine(); // consume newline
    System.out.print("Enter name: ");
    String name = scanner.nextLine();
    System.out.print("Enter area: ");
    double area = scanner.nextDouble();
    scanner.nextLine(); // consume newline
    System.out.print("Enter owner's name: ");
    String nameOfOwner = scanner.nextLine();

    RealEstate newEstate = new RealEstate(municipalityNumber, municipalityName, lotNumber,
        sectionNumber, name, area, nameOfOwner);
    registry.addRealEstate(newEstate);
    System.out.println("Real estate added successfully.");

  }

  public static void removeRealEstate(Scanner scanner, RealEstateRegistry registry) {
    System.out.print("Enter the estate ID to remove: ");
    String estateID = scanner.nextLine();
    RealEstate estate = registry.getRealEstate(estateID);

    if (estate != null) {
      registry.removeRealEstate(estate);
      System.out.println("Real estate removed successfully.");
    } else {
      System.out.println("Estate with ID " + estateID + " not found.");
    }
  }

  public static void getNumberOfEstates(Scanner scanner, RealEstateRegistry registry) {
    System.out.println("Number of estates: " + registry.getNumberOfEstates());
  }

  public static void getRealEstate(Scanner scanner, RealEstateRegistry registry) {
    System.out.print("Enter the estate ID: ");
    String estateID = scanner.nextLine();
    RealEstate estate = registry.getRealEstate(estateID);

    if (estate != null) {
      System.out.println(
          "Estate found: " + estate.getName() + ", Area: " + estate.getArea() + ", Owner: "
              + estate.getNameOfOwner());
    } else {
      System.out.println("No estate found with ID: " + estateID);
    }
  }

  public static void averageArea(Scanner scanner, RealEstateRegistry registry) {
    System.out.println("Average area of estates: " + registry.averageArea());
  }

  public static void findEstateByLotNumber(Scanner scanner, RealEstateRegistry registry) {
    System.out.print("Enter lot: ");
    int lotNumber = scanner.nextInt();
    List<RealEstate> estates = registry.findEstateByLotNumber(lotNumber);

    if (estates.isEmpty()) {
      System.out.println("No estates found with lot number: " + lotNumber);
    } else {
      System.out.println("Estates with lot number " + lotNumber + ":");
      for (RealEstate estate : estates) {
        System.out.println("- " + estate.getName() + " (ID: " + estate.getEstateID() + ")");
      }

    }


  }

} 