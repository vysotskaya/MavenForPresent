/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenforpresent.present;

/**
 *
 * @author Admin
 */
public class ForGoodChildPresent extends Present {

    public ForGoodChildPresent() {
//        presentName = "Подарок для послушного ребёнка";
//        card = "Открытка с оленями";
//        chocolate = "Молочный шоколад";
//        bike = "Обычный велосипед";
        
        super.setPresentName("Gift for an obedient child");
        super.setCard("Card with deer");
        super.setChocolate("Milk chocolate");
        super.setBike("Ordinary bicycle");

        //contents.add("Подарок для непослушного ребёнка");
    }
    @Override
    public void drawingCard() {
        //System.out.println("Гномы рисуют открытку с оленями.");
        System.out.println("Dwarves draw a card with deer.");
    }
    @Override
    public void cookingChocolate() {
        //System.out.println("Гномы варят молочный шоколад.");
        System.out.println("Dwarves cook milk chocolate.");
    }
    @Override
    public void packing() {
        //System.out.println("Гномы cкладывают подарок в красную коробку.");
        System.out.println("Dwarves fold gift in red box.");
    }

    @Override
    public void decorating() {
        System.out.println("Dwarves decorated ordinary bicycle.");
    }

}
