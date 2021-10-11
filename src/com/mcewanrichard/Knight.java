package com.mcewanrichard;

public class Knight extends Character {

    public Knight(){
        weaponBehaviour = new SwordBehaviour();
    }

    public void fight() {
        System.out.println("Fighting....");
    }
}
