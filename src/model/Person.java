
package model;


public abstract class Person {

    protected int id;
    protected String name;

    public Person(int id, String name) {
        setId(id);
        setName(name);
    }

    public void setId(int id) {
        if (id < 0)
            throw new IllegalArgumentException("ID cannot be negative");
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public abstract void work();
}
