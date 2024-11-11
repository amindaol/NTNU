package edu.ntnu.idi.idatt;
import java.util.Scanner;

public class ArrangementClient {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrangementRegister register = new ArrangementRegister(10);

            boolean running = true;
            while (running) {
                System.out.println("\n--- Arrangement Register Menu ---");
                System.out.println("1. Register a new arrangement");
                System.out.println("2. Find arrangements at a specific location");
                System.out.println("3. Find arrangements at a specific time");
                System.out.println("4. Find arrangements within a time interval");
                System.out.println("5. Display all registered arrangements sorted by time");
                System.out.println("6. Exit");

                System.out.print("Choose an option (1-6): ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        registerNewArrangement(scanner, register);
                        break;
                    case 2:
                        findArrangementsAtLocation(scanner, register);
                        break;
                    case 3:
                        findArrangementsAtTime(scanner, register);
                        break;
                    case 4:
                        findArrangementsInTimeInterval(scanner, register);
                        break;
                    case 5:
                        displaySortedArrangements(register);
                        break;
                    case 6:
                        running = false;
                        System.out.println("Exiting the program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a valid option.");
                }
            }
            scanner.close();
        }

        // Option 1: Register a new arrangement
        private static void registerNewArrangement(Scanner scanner, ArrangementRegister register) {
            System.out.print("Enter arrangement number: ");
            int number = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter arrangement name: ");
            String name = scanner.nextLine();

            System.out.print("Enter location: ");
            String location = scanner.nextLine();

            System.out.print("Enter organizer: ");
            String organizer = scanner.nextLine();

            System.out.print("Enter description: ");
            String description = scanner.nextLine();

            System.out.print("Enter time (YYYYMMDDHHMM, e.g., 202411071800 for 7th Nov 2024, 6:00 PM): ");
            long time = scanner.nextLong();
            scanner.nextLine();

            register.registerNewArrangement(number, name, location, organizer, description, time);
            System.out.println("Arrangement registered successfully!");
        }

        // Option 2: Find arrangements at a specific location
        private static void findArrangementsAtLocation(Scanner scanner, ArrangementRegister register) {
            System.out.print("Enter location to search for: ");
            String location = scanner.nextLine();

            String result = register.arrangementsAtThisPlace(location);
            if (result.isEmpty()) {
                System.out.println("No arrangements found at this location.");
            } else {
                System.out.println("Arrangements at " + location + ":\n" + result);
            }
        }

        // Option 3: Find arrangements at a specific time
        private static void findArrangementsAtTime(Scanner scanner, ArrangementRegister register) {
            System.out.print("Enter time to search for (as an integer, e.g., 1500 for 3 PM): ");
            long time = scanner.nextLong();
            scanner.nextLine(); // Consume newline

            String result = register.arrangementsAtThisTime(time);
            if (result.isEmpty()) {
                System.out.println("No arrangements found at this time.");
            } else {
                System.out.println("Arrangements at " + time + ":\n" + result);
            }
        }

        // Option 4: Find arrangements in a time interval
        private static void findArrangementsInTimeInterval(Scanner scanner, ArrangementRegister register) {
            System.out.print("Enter start time (as an integer, e.g., 1000 for 10 AM): ");
            int startTime = scanner.nextInt();
            System.out.print("Enter end time (as an integer, e.g., 1800 for 6 PM): ");
            int endTime = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            String result = register.arrangementsInTimeInterval(startTime, endTime);
            if (result.isEmpty()) {
                System.out.println("No arrangements found in this time interval.");
            } else {
                System.out.println("Arrangements from " + startTime + " to " + endTime + ":\n" + result);
            }
        }

        // Option 5: Display all arrangements sorted by time
        private static void displaySortedArrangements(ArrangementRegister register) {
            String result = register.getSortedArrangements();
            if (result.isEmpty()) {
                System.out.println("No arrangements registered.");
            } else {
                System.out.println("All arrangements sorted by time:\n" + result);
            }
        }
    }

