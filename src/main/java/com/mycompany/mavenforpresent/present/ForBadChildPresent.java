/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenforpresent.present;

import com.mycompany.mavenforpresent.behavior.*;

/**
 *
 * @author Admin
 */
public class ForBadChildPresent extends Present {

    public ForBadChildPresent() {
//        presentName = "Подарок для непослушного ребёнка";
//        card = "Открытка с ёлкой";
//        chocolate = "Горький шоколад.";
//        bike = "Самокат";
        
        super.setPresentName("Gift for a disobedient child");
        super.setCard("Card with Christmas tree");
        super.setChocolate("Dark chocolate");
        super.setBike("Kick scooter");

        //contents.add("Подарок для непослушного ребёнка");
        super.addPresent(BehaviorCONST.BAD);
    }
    
    @Override
    public void drawingCard() {
        //System.out.println("Гномы рисуют открытку с ёлкой.");
        System.out.println("Dwarves draw a card with Christmas tree.");
    }
    
    @Override
    public void cookingChocolate() {
        //System.out.println("Гномы варят горький шоколад.");
        System.out.println("Dwarves cook dark chocolate.");
    }
    
    @Override
    public void packing() {
        //System.out.println("Гномы cкладывают подарок в жёлтую коробку.");
        System.out.println("Dwarves fold gift in yellow box.");
    }
    
    @Override
    public void decorating() {
        //System.out.println("Гномы украшают самокат.");
        System.out.println("Dwarves decorate kick scooter.");
    }
}
