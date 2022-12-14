package Encapsulation;

public class EnhancedPlayer {

    private String name;
    private int hp = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100) {
            this.hp = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hp -= damage;
        if(this.hp <=0) {
            System.out.println("Player KO");
            // Reduce number of lives remaining for the player.
        }
    }

    public int getHp() {
        return hp;
    }
}
