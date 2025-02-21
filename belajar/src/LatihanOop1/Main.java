package LatihanOop1;

class Player {
    private String name;
    private int health;
    private int level;
    private int healthIncrement;
    private int attackIncrement;
    private Weapon weapon;
    private Armor armor;
    private int baseAttack;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.level = 1;
        this.baseAttack = 15;
        this.healthIncrement = 20;
        this.attackIncrement = 10;
    }

    public void showInfo() {
        System.out.println("\nName    : " + this.name);
        System.out.println("Health  : " + this.maxHealth());
        System.out.println("Level   : " + this.level);
        System.out.println("Attack  : " + this.getAttackPower());

    } 

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void levelUp() {
        this.level++;
    }

    public int maxHealth() {
        return (this.healthIncrement * this.level) + this.health + this.armor.getDefence(); 
    }

    public int getAttackPower() {
        return this.baseAttack + (this.attackIncrement * this.level) + this.weapon.getDamage();
    }
}

class Weapon {
    private String name;
    private int damage;

    Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }

}

class Armor {
    private String name;
    private int defence;

    Armor(String name, int defence) {
        this.name = name;
        this.defence = defence;
    }

    public int getDefence() {
        return this.defence;
    }
}


public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Joko");

        Weapon weapon1 = new Weapon("Sword", 20);
        Armor armor1 = new Armor("Chain armor", 50);

        player1.setWeapon(weapon1);
        player1.setArmor(armor1);

        player1.showInfo();
        player1.levelUp();

        player1.showInfo();
        player1.levelUp();

        player1.showInfo();
    }
}
 