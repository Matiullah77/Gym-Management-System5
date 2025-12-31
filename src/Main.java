
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Gym gym = new Gym("Basic Gym", "City Center", 0, 0);

        // Polymorphism: parent reference holding child objects
        ArrayList<Person> people = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1. Add Member");
            System.out.println("2. Add Trainer");
            System.out.println("3. View All");
            System.out.println("4. Polymorphism Demo");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                int id = sc.nextInt();
                sc.nextLine();
                String name = sc.nextLine();
                int age = sc.nextInt();
                double fee = sc.nextDouble();

                people.add(new Member(id, name, age, fee));
                gym.addMember();
            }

            else if (choice == 2) {
                int id = sc.nextInt();
                sc.nextLine();
                String name = sc.nextLine();
                String sp = sc.nextLine();
                double salary = sc.nextDouble();

                people.add(new Trainer(id, name, sp, salary));
                gym.addTrainer();
            }

            else if (choice == 3) {
                for (Person p : people) {
                    System.out.println(p);
                }
                System.out.println(gym);
            }

            else if (choice == 4) {
                for (Person p : people) {
                    // Polymorphism
                    p.work();

                    // instanceof check
                    if (p instanceof Trainer) {
                        System.out.println("Type: Trainer");
                    } else if (p instanceof Member) {
                        System.out.println("Type: Member");
                    }
                }
            }

        } while (choice != 5);

        sc.close();
    }
}
