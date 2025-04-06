package org.example;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0, 0);
        System.out.println("distance()= " + point.distance());

        Player player = new Player("Zeynep", 120, Weapon.SWORD);
        System.out.println("Health: " + player.healthRemaining());

        player.loseHealth(30);
        System.out.println("Health after damage: " + player.healthRemaining());

        player.restoreHealth(50);
        System.out.println("Health after restore: " + player.healthRemaining());

        player.loseHealth(200);

        System.out.println("Weapon Damage: " + Weapon.SWORD.getDamage());
        System.out.println("Attack Speed: " + Weapon.SWORD.getAttackSpeed());
    }
}