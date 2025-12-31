
public class Person {

    // Encapsulation + protected for inheritance
    protected int id;
    protected String name;

    public Person(int id, String name) {
        setId(id);
        setName(name);
    }

    // Validation
    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            this.id = 0;
        }
    }

    // Validation
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Not Set";
        }
    }

    // Method to be overridden
    public void work() {
        System.out.println("Person is doing gym work");
    }
}
