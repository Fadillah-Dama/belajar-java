package BelajarOop;

// player
class Player {
    String name;
    double health;
    int level;

    Weapon weapon;
    Armor armor;

    Player(String name, double health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void showInformation() {
        System.out.println("Player Name: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Level: " + this.level);
    }

    void attack(Enemy enemy) {
        double damage = this.weapon.damage * this.level;
        System.out.println("Player " + this.name + " attacks " + enemy.name + " with " + damage + " damage");
        enemy.getAttacked(damage);
    }

    void getAttacked(double damage) {
        // this.health -= damage;
        // System.out.println("Player " + this.name + " is attacked " +" with " + damage + " damage");
        if (damage > this.armor.defencePower) {
            damage = damage - this.armor.defencePower;
        } else {
            damage = 0;
        }
        this.health -= damage;
        System.out.println("Player " +  this.name + " is attacked, -" + damage + " hp");
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

class Armor {
    String name;
    double defencePower;

    Armor(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
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

    void attack(Player player) {
        double damage = this.weapon.damage;
        System.out.println("Enemy " + this.name + " attacks " + player.name + " with " + damage + " damage");
        player.getAttacked(damage);
    }

    void getAttacked(double damage) {
        this.health -= damage;
        System.out.println("Enemy " + this.name + " is attacked " +" with " + damage + " damage");

    }

}

public class game {
    public static void main(String[] args) {

        Player player1 = new Player("Yono", 100, 1);

        Weapon sword = new Weapon("Iron Sword",40);
        Weapon mace = new Weapon("Wooden Mace",15);

        Armor armor1 = new Armor("Chain armor", 10);

        Enemy enemy1 = new Enemy("Goblin", 50);

        // player 1
        player1.showInformation();
        player1.equipWeapon(sword);
        player1.equipArmor(armor1);

        player1.weapon.show();

        System.out.println("\n");

        // enemy1
        enemy1.showInformation();
        enemy1.equipWeapon(mace);
        enemy1.weapon.show();

        System.out.println("\n");

        // gelud
        player1.attack(enemy1);
        enemy1.showInformation();

        System.out.println("\n");

        enemy1.attack(player1);
        player1.showInformation();

    }
}
