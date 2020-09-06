package com.abhai.composite.demo;

import com.abhai.composite.demo.composite.Menu;
import com.abhai.composite.demo.leaf.MenuItem;

public class Demo {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");
        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        mainMenu.add(safetyMenuItem);

        Menu claimSubMenu = new Menu("Claims", "/claims");
        mainMenu.add(claimSubMenu);

        MenuItem personalClaimMenu = new MenuItem("Personal Claim", "/personalClaim");
        claimSubMenu.add(personalClaimMenu);

        System.out.println(mainMenu.toString());
    }
}
