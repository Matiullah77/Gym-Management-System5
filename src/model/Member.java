
package model;

public class Member extends Person implements Payable {

    private int age;
    private double fee;

    public Member(int id, String name, int age, double fee) {
        super(id, name);
        setAge(age);
        setFee(fee);
    }

    public void setAge(int age) {
        if (age < 0)
            throw new IllegalArgumentException("Invalid age");
        this.age = age;
    }

    public void setFee(double fee) {
        if (fee < 0)
            throw new IllegalArgumentException("Invalid fee");
        this.fee = fee;
    }

    @Override
    public void work() {
        System.out.println("Member is working out");
    }

    @Override
    public double calculatePayment() {
        return fee;
    }

    @Override
    public String toString() {
        return "Member ID: " + id + ", Name: " + name +
                ", Age: " + age + ", Fee: " + fee;
    }
}
