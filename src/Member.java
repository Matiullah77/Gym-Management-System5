
// Inheritance
public class Member extends Person {

    // Encapsulation
    private int age;
    private double fee;

    public Member(int id, String name, int age, double fee) {
        // super keyword
        super(id, name);
        setAge(age);
        setFee(fee);
    }

    // Validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    // Validation
    public void setFee(double fee) {
        if (fee >= 0) {
            this.fee = fee;
        } else {
            this.fee = 0;
        }
    }

    // Method overriding
    @Override
    public void work() {
        System.out.println("Member is working out");
    }

    // Method overriding
    @Override
    public String toString() {
        return "Member ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Fee: " + fee;
    }
}
