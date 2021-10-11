package com.mcewanrichard;

public class BowAndArrowBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Bow and Arrow attack");
    }
}