/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenforpresent.dwarve;

import com.mycompany.mavenforpresent.behavior.BehaviorCONST;
import com.mycompany.mavenforpresent.present.ForBadChildPresent;
import com.mycompany.mavenforpresent.present.Present;

/**
 *
 * @author Admin
 */
public class DwarveForBadChild extends DwarveForCreatePresent{
    
    public static DwarveForBadChild uniqueDwarveForBadChild;
    
    private DwarveForBadChild () {}
    
    public static DwarveForBadChild getDwarve() {
        if (uniqueDwarveForBadChild == null) {
            uniqueDwarveForBadChild = new DwarveForBadChild();
        }
        return uniqueDwarveForBadChild;
    }
    
    @Override
    protected Present createPresent(String type) {
        if (type.equals(BehaviorCONST.BAD))
            return new ForBadChildPresent();
        else return null;
    }
}
