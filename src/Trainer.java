
// Inheritance
public class Trainer extends Person {

    // Encapsulation
    private String specialization;
    private double salary;

    public Trainer(int id, String name, String specialization, double salary) {
        // super keyword
        super(id, name);
        this.specialization = specialization;
        setSalary(salary);
    }

    // Validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }

    // Method overriding
    @Override
    public void work() {
        System.out.println("Trainer is training members");
    }

    // Method overriding
    @Override
    public String toString() {
        return "Trainer ID: " + id +
                ", Name: " + name +
                ", Specialization: " + specialization +
                ", Salary: " + salary;
    }
}
