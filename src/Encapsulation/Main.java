package Encapsulation;

public class Main {

    public static void main(String[] args) {

        EnhancedPlayer player = new EnhancedPlayer("ariel", 50, "sword");
        System.out.println("initial hp is " + player.getHp());

        // bad encapsulation
//        Player player = new Player();
//        player.name = "Ariel";
//        player.health = 20;
//        player.weapon = "Bat";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("hp left: " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("hp left: " + player.healthRemaining());
    }
}
