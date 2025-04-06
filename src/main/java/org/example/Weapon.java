package org.example;

public enum Weapon {
    SWORD(15, 1.2),
    AXE(20, 0.9),
    BOW(10, 1.8);
    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
    public int getDamage() {
        return damage;
    }
    public double getAttackSpeed() {
        return attackSpeed;
    }
}
