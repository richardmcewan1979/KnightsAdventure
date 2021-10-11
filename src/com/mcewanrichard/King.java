package com.mcewanrichard;

public class King extends Character{

    public King(){
        weaponBehaviour = new BowAndArrowBehaviour();
    }

    public void fight(){
        System.out.println(getClass().getSimpleName() + " is Fighting...");
        //how do I put this into the parent class to reference this subclass
        //check
    }
}
