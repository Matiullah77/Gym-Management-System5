package model;

public class Trainer extends Person implements Payable {

    private String specialization;
    private double salary;

    public Trainer(int id, String name, String specialization, double salary) {
        super(id, name);
        setSpecialization(specialization);
        setSalary(salary);
    }

    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.isEmpty())
            throw new IllegalArgumentException("Invalid specialization");
        this.specialization = specialization;
    }

    public void setSalary(double salary) {
        if (salary < 0)
            throw new IllegalArgumentException("Invalid salary");
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("Trainer is training members");
    }

    @Override
    public double calculatePayment() {
        return salary;
    }

    @Override
    public String toString() {
        return "Trainer ID: " + id + ", Name: " + name +
                ", Specialization: " + specialization +
                ", Salary: " + salary;
    }
}
