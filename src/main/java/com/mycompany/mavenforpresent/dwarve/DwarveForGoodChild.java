/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenforpresent.dwarve;

import com.mycompany.mavenforpresent.behavior.BehaviorCONST;
import com.mycompany.mavenforpresent.present.ForGoodChildPresent;
import com.mycompany.mavenforpresent.present.ForPerfectChildPresent;
import com.mycompany.mavenforpresent.present.Present;

/**
 *
 * @author Admin
 */
public class DwarveForGoodChild extends DwarveForCreatePresent{
    
    public static DwarveForGoodChild uniqueDwarveForGoodChild;
    
    private DwarveForGoodChild () {}
    
    public static DwarveForGoodChild getDwarve() {
        if (uniqueDwarveForGoodChild == null) {
            uniqueDwarveForGoodChild = new DwarveForGoodChild();
        }
        return uniqueDwarveForGoodChild;
    }
    
    @Override
    protected Present createPresent(String type) {
        if (type.equals(BehaviorCONST.GOOD))
             return new ForGoodChildPresent();
        if (type.equals(BehaviorCONST.PERFECT))
             return new ForPerfectChildPresent();
        else return null;
             

    }
}