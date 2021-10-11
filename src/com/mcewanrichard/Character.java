package com.mcewanrichard;

public abstract class Character {
    WeaponBehaviour weaponBehaviour;

    public Character(){
    }

    public abstract void fight();

    public void performFight(){
        weaponBehaviour.useWeapon();
    }

    public void setWeaponBehaviour(WeaponBehaviour wb){
        weaponBehaviour = wb;
    }
}
