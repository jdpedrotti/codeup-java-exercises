package rpg;

import java.util.Comparator;

public class Monster implements Comparator<Monster> {
    private int armorClass;
    private int hitPoints;
    private int damage;
    private String name;

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }

    // to crete a custom comparison method, we implement Comparable <ObjectClassName>
    // in the object class. can use this syntax below
    public int compare(Monster m1, Monster m2){
        return Integer.compare(m2.getHitPoints(), m1.getHitPoints());
    }

    public static void generateMonster(){}

    public Monster(){}

    public Monster(int armorClass, int hitPoints, int damage, String name) {
        this.name = name;
        this.armorClass = armorClass;
        this.hitPoints = hitPoints;
        this.damage = damage;

    }
}
