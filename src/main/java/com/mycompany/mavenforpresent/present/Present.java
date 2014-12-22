/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenforpresent.present;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public abstract class Present {

    private String presentName;
    private String card;
    private String chocolate;
    private String bike;
    private List<String> contents = new ArrayList<>();

    public void setPresentName(String name) {
        presentName = name;
    }
    
    public void setCard(String card) {
        this.card = card;
    }
    
    public void setChocolate (String chocolate) {
        this.chocolate = chocolate;
    }
    
    public void setBike(String bike) {
        this.bike = bike;
    }
    
    public void addPresent(String present) {
        contents.add(present);
    }
    
    public void creating() {
        //System.out.println("Гномы готовятся собирать " + presentName);
        System.out.println("Dwarves are preparing to gather " + presentName);
        
        //System.out.println("Они достают краски и карандаши...");
        System.out.println("They take out paints and crayons...");
        
        //System.out.println("Замешивают смесь для шоколада...");
        System.out.println("Knead mixture for chocolate...");
        
        //System.out.println("Подбирают украшения...");
        System.out.println("Pick up decorations...");
        
        for (int i = 0; i < contents.size(); i++)
        {
            System.out.print("   " + contents.get(i));
        }
        //System.out.println(" подготавливается следующим образом: ");
        System.out.println(" is prepared following way: ");
    }
    
    abstract public void drawingCard();    
    abstract public void cookingChocolate();
    abstract public void decorating();
    abstract public void packing();
    
    @Override
    public String toString() {
        return presentName;
    }
}
