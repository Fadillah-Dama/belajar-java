package BelajarOop;

class Player {
    String name;
    private int baseHealth;
    private int baseDamage;
    
    public Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseDamage = 15;

    }

    public void displayInformation() {
        System.out.println("Name player : " + this.name);
        System.out.println("Health      : " + this.baseHealth);
        System.out.println("Damage      : " + this.baseDamage);
    }
}

public class latihan_encapsulasi {
    public static void main(String[] args) {
        Player player1 = new Player("Joko");

        player1.displayInformation();
    }

    
}
