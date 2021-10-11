package com.mcewanrichard;

public class Main {

    public static void main(String[] args) {

        Character king = new King();
        king.fight();
        king.performFight();
        king.setWeaponBehaviour(new AxeBehaviour());
        king.performFight();

        System.out.println();
        System.out.println();

        Character knight = new Knight();
        knight.fight();
        knight.performFight();
        knight.setWeaponBehaviour(new KnifeBehaviour());
        knight.performFight();


    }
}
