package CompositionChallenge;

public class Room {

    private String name;
    private Desk desk;
    private Door door;
    private Bed bed;

    public Room(String name, Desk desk, Door door, Bed bed) {
        this.name = name;
        this.desk = desk;
        this.door = door;
        this.bed = bed;
    }

    public void makeBed() {
        System.out.println("You have made the " + bed.getSize() + " size bed.");
    }

    public String getName() {
        return name;
    }

    public Desk getDesk() {
        return desk;
    }

    public Door getDoor() {
        return door;
    }

    public Bed getBed() {
        return bed;
    }
}
