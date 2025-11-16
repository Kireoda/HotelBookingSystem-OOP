package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Load rooms from CSV
        List<HotelRoom> rooms = loadFromCSV("OOP_Project/src/data/hotelRooms.csv");
        // Show number of valid rooms and a sample
        System.out.println("Loaded " + rooms.size() + " valid rooms");
        rooms.stream().limit(3).forEach(System.out::println);

        int sortChoice = sortingOptions();
        switch (sortChoice) {
            case 1:
                // Sorting by price (natural order)
                rooms.sort(null);
                System.out.println("\nRooms sorted by price(Ascending):");
                rooms.forEach(System.out::println);
                break;
            case 2:
                // Sorting by rating
                rooms.sort(new HotelRoom.ByRatingComparator());
                System.out.println("\nRooms sorted by rating:");
                rooms.forEach(System.out::println);
                break;
            case 3:
                // Sorting by Room Number
                rooms.sort(new HotelRoom.RoomNumberComparator());
                System.out.println("\nRooms sorted by room number:");
                rooms.forEach(System.out::println);
                break;
            default:
                System.err.println("Invalid sorting option selected.");
                break;
        }

    }
    // CSV loader
    public static List<HotelRoom> loadFromCSV(String filename) {
        List<HotelRoom> rooms = new ArrayList<>();

        try (Scanner sc = new Scanner(new File(filename))) {
            int row = 0;

            while (sc.hasNextLine()) {
                row++;
                String line = sc.nextLine();
                String[] cols = line.split(",");

                if (cols.length < 9) {
                    System.out.println("Skipping row " + row + ": not enough columns");
                } else {
                    try {
                        HotelRoom hr = new HotelRoom(
                                cols[0],
                                cols[1],
                                cols[2],
                                Integer.parseInt(cols[3]),
                                Double.parseDouble(cols[4]),
                                Boolean.parseBoolean(cols[5]),
                                LocalDate.parse(cols[6]),
                                LocalDate.parse(cols[7]),
                                Integer.parseInt(cols[8])
                        );
                        rooms.add(hr);
                    } catch (Exception e) {
                        System.out.println("Invalid row " + row + ": " + e.getMessage());
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("CSV file not found: " + filename);
        }
        return rooms;
    }
    public static int sortingOptions() {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean validInput = false;
        
        while (!validInput) {
            System.out.println("Choose sorting option");
            System.out.println("1. Price");
            System.out.println("2. Rating");
            System.out.println("3. Room Number");
            System.out.print("Enter your choice (1-3): ");
            try {
                choice = sc.nextInt();
                if (choice >= 1 && choice <= 3) {
                    validInput = true;
                } 
                else {
                    System.err.println("Invalid choice. Please enter a number between 1 and 3.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a number.");
                sc.nextLine(); 
            }
        }
        return choice;
    }
}
