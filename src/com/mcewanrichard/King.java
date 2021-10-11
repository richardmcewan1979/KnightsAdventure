package com.mcewanrichard;

public class King extends Character{

    public King(){
        weaponBehaviour = new BowAndArrowBehaviour();
    }

    public void fight(){
        System.out.println("Fighting...");
    }
}
