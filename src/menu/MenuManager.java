package menu;

import InvalidInputException.InvalidInputException;
import model.*;
import java.util.ArrayList;
import java.util.Scanner;

// NEW: MenuManager implements Menu interface
public class MenuManager implements menu.Menu {

    private final Scanner sc = new Scanner(System.in); // NEW: Scanner for input
    private final model.Gym gym = new model.Gym("Basic Gym", "City Center", 0, 0); // NEW: Gym object
    private final ArrayList<model.Person> people = new ArrayList<>(); // NEW: list of Members & Trainers

    @Override
    public void displayMenu() { // NEW: display menu
        System.out.println("\n1. Add Member");
        System.out.println("2. Add Trainer");
        System.out.println("3. View All");
        System.out.println("4. Polymorphism Demo");
        System.out.println("5. Exit");
    }

    @Override
    public void run() { // NEW: run menu loop
        int choice = 0;
        while (choice != 5) {
            try {
                displayMenu();
                choice = Integer.parseInt(sc.nextLine()); // NEW: parse input

                switch (choice) {
                    case 1 -> addMember();
                    case 2 -> addTrainer();
                    case 3 -> viewAll();
                    case 4 -> polymorphismDemo();
                    case 5 -> System.out.println("Exiting...");
                    default -> throw new InvalidInputException("Invalid menu choice"); // NEW: custom exception
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error: Enter a valid number.");
            }
            catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
            catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    // NEW: addMember method
    private void addMember() {
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Fee: ");
            double fee = Double.parseDouble(sc.nextLine());

            people.add(new model.Member(id, name, age, fee)); // NEW: create Member object
            gym.addMember();                            // NEW: increment member count
            System.out.println("Member added successfully!");
        }
        catch (NumberFormatException e) { // separate catch
            System.out.println("Error: Invalid number input.");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // NEW: addTrainer method
    private void addTrainer() {
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Specialization: ");
            String sp = sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            people.add(new model.Trainer(id, name, sp, salary)); // NEW: create Trainer object
            gym.addTrainer();                              // NEW: increment trainer count
            System.out.println("Trainer added successfully!");
        }
        catch (NumberFormatException e) { // separate catch
            System.out.println("Error: Invalid number input.");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // NEW: viewAll method
    private void viewAll() {
        for (model.Person p : people) System.out.println(p); // NEW: polymorphic toString()
        System.out.println(gym);                      // NEW: gym info
    }

    // NEW: polymorphism demo
    private void polymorphismDemo() {
        for (model.Person p : people) p.work(); // NEW: call abstract work()
    }
}
