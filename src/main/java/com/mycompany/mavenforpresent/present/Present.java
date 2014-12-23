/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenforpresent.present;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public abstract class Present {

    private String presentName;
    private String card;
    private String chocolate;
    private String bike;

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
    
    public void creating() {
        //System.out.println("Гномы готовятся собирать " + presentName);
        System.out.println("Dwarves are preparing to gather " + presentName);
        
        //System.out.println("Они достают краски и карандаши...");
        System.out.println("They take out paints and crayons...");
        
        //System.out.println("Замешивают смесь для шоколада...");
        System.out.println("Knead mixture for chocolate...");
        
        //System.out.println("Подбирают украшения...");
        System.out.println("Pick up decorations...");
        
        System.out.print("   " + presentName);

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
    
    @Override
    public boolean equals(Object obj) {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(obj instanceof Present ) {
            Present temp=(Present)obj;
            return this.presentName.equals(temp.presentName) &&
                    this.card.equals(temp.card) &&
                    this.chocolate.equals(temp.chocolate) &&
                    this.bike.equals(temp.bike);          
        }
        else 
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.presentName);
        hash = 23 * hash + Objects.hashCode(this.card);
        hash = 23 * hash + Objects.hashCode(this.chocolate);
        hash = 23 * hash + Objects.hashCode(this.bike);
        return hash;
    }
}
