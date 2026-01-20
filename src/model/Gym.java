package model;

// NEW: Gym class to track members and trainers
public class Gym {

    private final String name;
    private final String location;
    private int members;
    private int trainers;

    public Gym(String name, String location, int members, int trainers) { // NEW: constructor
        this.name = name;
        this.location = location;
        this.members = members;
        this.trainers = trainers;
    }

    public void addMember() { members++; } // NEW: increment members
    public void addTrainer() { trainers++; } // NEW: increment trainers

    @Override
    public String toString() { // NEW: display gym info
        return "Gym Name: " + name + ", Location: " + location +
                ", Members: " + members + ", Trainers: " + trainers;
    }
}
