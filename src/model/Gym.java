
package model;

public class Gym {

    private String name;
    private String location;
    private int members;
    private int trainers;

    public Gym(String name, String location, int members, int trainers) {
        this.name = name;
        this.location = location;
        this.members = members;
        this.trainers = trainers;
    }

    public void addMember() {
        members++;
    }

    public void addTrainer() {
        trainers++;
    }

    @Override
    public String toString() {
        return "Gym Name: " + name +
                ", Location: " + location +
                ", Members: " + members +
                ", Trainers: " + trainers;
    }
}
