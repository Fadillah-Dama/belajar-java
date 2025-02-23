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
    private int totalDamage;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.level = 1;
        this.baseAttack = 15;
        this.healthIncrement = 20;
        this.attackIncrement = 10;
    }

    public void showInfo() {
        System.out.println("Player    : " + this.name);
        System.out.println("Level   : " + this.level);
        System.out.println("Health  : " + this.getHealth() + "/" + this.maxHealth());
        System.out.println("Attack  : " + this.getAttackPower());
        System.out.println("Alive   : " + isAlive() + "\n");

    } 

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    private void levelUp() {
        this.level++;
        System.out.println("player " + this.name + " level up, now level " + this.level + "\n");
    }

    public int maxHealth() {
       // if(this.level == 1) return this.health + this.armor.getDefence();
        return (this.healthIncrement * (this.level - 1)) + this.health + this.armor.getDefence(); 
    }

    public int getHealth() {
        this.health = (this.healthIncrement * (this.level - 1)) + this.health + this.armor.getDefence();
        return this.health;
    }

    private int getAttackPower() {
        return this.baseAttack + (this.attackIncrement * this.level) + this.weapon.getDamage();
    }

    public void attack(Player player) {
        int damage = this.getAttackPower();
        System.out.println(this.name + " attacking " + player.name + " with " + damage + " damage");
        player.defence(damage);
        //levelUp();
    }

    public void defence(int damage ) {
        this.health -= damage;
        System.out.println(this.name + " receive " + damage + " damage");
    }

    private boolean isAlive() {
        if(this.health <= 0) {
            return false;
        } else {
            return true;
        }
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

        Player player2 = new Player("Yanto");
        Weapon weapon2 = new Weapon("Axe", 30);
        Armor armor2 = new Armor("Leather armor", 40);

        player1.setWeapon(weapon1);
        player1.setArmor(armor1);
        player2.setWeapon(weapon2);
        player2.setArmor(armor2);

        player1.showInfo();
        player2.showInfo();

        player1.attack(player2);
        player2.attack(player1);

        player1.showInfo();
        player2.showInfo();
        
    }
}
 