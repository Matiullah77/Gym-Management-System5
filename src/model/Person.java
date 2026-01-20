package model;

// NEW: abstract class Person (requirement #3)
public abstract class Person {

    protected int id;   // NEW: id field
    protected String name; // NEW: name field

    public Person(int id, String name) { // NEW: constructor
        setId(id);      // NEW: use setter
        setName(name);  // NEW: use setter
    }

    public void setId(int id) { // NEW: setter with exception
        if (id < 0) throw new IllegalArgumentException("ID cannot be negative");
        this.id = id;
    }

    public void setName(String name) { // NEW: setter with exception
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public abstract void work(); // NEW: abstract method for polymorphism
}
