package LatihanOop1;

class Player {
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int level;
    private Armor armor;
    private Weapon weapon;
    private int healthIncrement;
    private int attackIncrement;
    private int totalDamage;
    private boolean isAlive;


    public Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 20;
        this.level = 1;
        this.healthIncrement = 20;
        this.attackIncrement = 10;
        this.isAlive = true;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getStatus() {
        if (isAlive == false) {
            return "Dead";
        } else {
            return "Alive";
        }
    }

    public void show() {
        System.out.println("Player      : " + this.name);
        System.out.println("Level       : " + this.level);
        System.out.println("Max Health  : " + this.getHealth()+ " / " + this.maxHealth());
        System.out.println("Attack      : " + this.getAttack());
        System.out.println("Status      : " + this.getStatus() + "\n");

    }

    public int maxHealth() {
        return this.baseHealth + (this.level-1)*this.healthIncrement + this.armor.addHealth();
    }

    public int getHealth() {
        return this.maxHealth() - this.totalDamage;
    }

    public void levelUp() {
        this.level++;
    }

    public int getAttack() {
        return this.baseAttack + (this.level-1)*this.attackIncrement + this.weapon.getAttackPower();
    }

    public void attacking(Player enemy) {
        int damage = this.getAttack();
        System.out.println("Player " + this.name + " attacks " + enemy.name + " with " + damage + " damage");
        enemy.receiveDamage(damage);
    }

    public void receiveDamage(int damage) {
        int defencePower = this.armor.getDefencePower();
        int extraDamage;
        if (damage > defencePower) {
            extraDamage = damage - defencePower;
        } else {
            extraDamage = 0;
        }
        this.totalDamage += extraDamage;
        System.out.println("Player " + this.name + " received, -" + extraDamage + " damage\n");
        if (this.getHealth() <= 0) {
            this.isAlive = false;
            System.out.println("Player " + this.name + " is dead");
            totalDamage = this.maxHealth();
        } 
    }
}

class Weapon {
    private String name;
    private int attackPower;

    public Weapon(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

}

class Armor {
    private String name;
    private int defencePower;
    private int health;

    public Armor(String name, int defencePower, int health) {
        this.name = name;
        this.defencePower = defencePower;
        this.health = 100;
    }

    public int getDefencePower() {
        return defencePower;
    }

    public int addHealth() {
        return this.defencePower + this.health;
    }    

}
public class game {
    public static void main(String[] args) {
        Player player1 = new Player("Yono");
        Armor armor1 = new Armor("Light armor", 10, 100);
        Weapon weapon1 = new Weapon("Pedang besi", 20);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        Player player2 = new Player("Imam");
        Armor armor2 = new Armor("Heavy armor", 15, 100);
        Weapon weapon2 = new Weapon("Kapak besi", 30);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.show();
        player2.show();

        player1.attacking(player2);
        player2.attacking(player1);

        player1.show();
        player2.show();
        
        player2.attacking(player1);
        player2.attacking(player1);
        player2.attacking(player1);
        player2.attacking(player1);
        player2.attacking(player1);
        player2.attacking(player1);
        player2.attacking(player1);

        player1.show();
        player2.show();
        
    }
}
