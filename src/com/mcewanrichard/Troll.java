package com.mcewanrichard;

public class Troll extends Character{

    public Troll(){
        weaponBehaviour = new AxeBehaviour();
    }

    @Override
    public void fight() {
        System.out.println("Fighting....");
    }
}
