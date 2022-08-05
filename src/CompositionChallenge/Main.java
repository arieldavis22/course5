package CompositionChallenge;

public class Main {

    public static void main(String[] args) {
        Desk desk = new Desk("Brown", 5, 5);
        Door door = new Door(5, 5, "red");
        Bed bed = new Bed("King", true);

        Room room = new Room("ariel", desk, door, bed);
        room.makeBed();
    }
}
