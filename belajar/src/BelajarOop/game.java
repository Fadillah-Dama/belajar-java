package BelajarOop;

// player
class Player {
    String name;
    double health;
    int level;

    Weapon weapon;

    Player(String name, double health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void showInformation() {
        System.out.println("Player Name: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Level: " + this.level);
    }

}

// weapon
class Weapon {
    String name;
    int damage;

    Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    void show() {
        System.out.println("Weapon: " + this.name);
        System.out.println("Damage: " + this.damage);
    }
}

// enemy
class Enemy {
    String name;
    int health;

    Weapon weapon;

    Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void showInformation() {
        System.out.println("Enemy Name: " + this.name);
        System.out.println("Health: " + this.health);
    }

}

public class game {
    public static void main(String[] args) {

        Player player1 = new Player("Yono", 100, 1);

        Weapon sword = new Weapon("Iron Sword",40);
        Weapon mace = new Weapon("Wooden Mace",15);

        Enemy enemy1 = new Enemy("Goblin", 50);

        // player 1
        player1.showInformation();
        player1.equipWeapon(sword);
        player1.weapon.show();

        System.out.println("\n");

        // enemy1
        enemy1.showInformation();
        enemy1.equipWeapon(mace);
        enemy1.weapon.show();

    }
}
