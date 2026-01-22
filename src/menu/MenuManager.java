
package menu;

import exception.InvalidInputException;
import model.*;

import java.util.ArrayList;
import java.util.Scanner;

// Implements Menu interface
public class MenuManager implements Menu {

    private Scanner sc = new Scanner(System.in);
    private Gym gym = new Gym("Basic Gym", "City Center", 0, 0);
    private ArrayList<Person> people = new ArrayList<>();

    @Override
    public void displayMenu() {
        System.out.println("\n1. Add Member");
        System.out.println("2. Add Trainer");
        System.out.println("3. View All");
        System.out.println("4. Polymorphism Demo");
        System.out.println("5. Exit");
    }

    @Override
    public void run() {
        int choice = 0;

        while (choice != 5) {
            try {
                displayMenu();
                choice = Integer.parseInt(sc.nextLine());

                if (choice == 1) addMember();
                else if (choice == 2) addTrainer();
                else if (choice == 3) viewAll();
                else if (choice == 4) polymorphismDemo();
                else if (choice == 5) System.out.println("Exiting...");
                else throw new InvalidInputException("Invalid menu choice");

            } catch (NumberFormatException e) {
                System.out.println("Error: Enter numbers only");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void addMember() {
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Fee: ");
        double fee = Double.parseDouble(sc.nextLine());

        people.add(new Member(id, name, age, fee));
        gym.addMember();
    }

    private void addTrainer() {
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Specialization: ");
        String sp = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        people.add(new Trainer(id, name, sp, salary));
        gym.addTrainer();
    }

    private void viewAll() {
        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println(gym);
    }

    private void polymorphismDemo() {
        for (Person p : people) {
            p.work();
        }
    }
}
