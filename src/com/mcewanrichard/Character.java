package com.mcewanrichard;

public abstract class Character {
    WeaponBehaviour weaponBehaviour;

    public Character(){
    }

    public abstract void fight();

    public void performFight(){
        System.out.println("Take this foe!");
        weaponBehaviour.useWeapon();
    }

    public void setWeaponBehaviour(WeaponBehaviour wb){
        weaponBehaviour = wb;
        System.out.println("Changing weapons");
    }
}
