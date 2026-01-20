package model;

// NEW: Member class extends abstract Person and implements Payable
public class Member extends model.Person implements Payable {

    private int age;    // NEW: age field
    private double fee; // NEW: fee field

    public Member(int id, String name, int age, double fee) { // NEW: constructor
        super(id, name); // NEW: call Person constructor
        setAge(age);     // NEW: use setter
        setFee(fee);     // NEW: use setter
    }

    public void setAge(int age) { // NEW: setter with exception
        if (age < 0) throw new IllegalArgumentException("Invalid age");
        this.age = age;
    }

    public void setFee(double fee) { // NEW: setter with exception
        if (fee < 0) throw new IllegalArgumentException("Invalid fee");
        this.fee = fee;
    }

    @Override
    public void work() { // NEW: implement abstract method
        System.out.println(name + " (Member) is working out.");
    }

    @Override
    public double calculatePayment() { // NEW: implement Payable
        return fee;
    }

    @Override
    public String toString() { // NEW: display member info
        return "Member ID: " + id + ", Name: " + name + ", Age: " + age + ", Fee: " + fee;
    }
}
