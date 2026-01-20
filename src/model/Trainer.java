package model;

// NEW: Trainer class extends abstract Person and implements Payable
public class Trainer extends Person implements Payable {

    private String specialization; // NEW: specialization field
    private double salary;         // NEW: salary field

    public Trainer(int id, String name, String specialization, double salary) { // NEW: constructor
        super(id, name);
        setSpecialization(specialization);
        setSalary(salary);
    }

    public void setSpecialization(String specialization) { // NEW: setter with exception
        if (specialization == null || specialization.isBlank())
            throw new IllegalArgumentException("Specialization cannot be empty");
        this.specialization = specialization;
    }

    public void setSalary(double salary) { // NEW: setter with exception
        if (salary < 0) throw new IllegalArgumentException("Invalid salary");
        this.salary = salary;
    }

    @Override
    public void work() { // NEW: implement abstract method
        System.out.println(name + " (Trainer) is training members.");
    }

    @Override
    public double calculatePayment() { // NEW: implement Payable
        return salary;
    }

    @Override
    public String toString() { // NEW: display trainer info
        return "Trainer ID: " + id + ", Name: " + name +
                ", Specialization: " + specialization + ", Salary: " + salary;
    }
}
