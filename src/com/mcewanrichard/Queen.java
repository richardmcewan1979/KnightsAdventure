package com.mcewanrichard;

public class Queen extends Character{

    public Queen(){
        weaponBehaviour = new KnifeBehaviour();
    }

    public void fight(){
        System.out.println("Fighting...");
    }
}
