/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenforpresent.behavior;

/**
 *
 * @author Admin
 */
public class Behavior {
    public String findOut() {
      int rand = (int)(Math.random()*3);
      if (rand == 1) return BehaviorCONST.PERFECT;
      else {
            if (rand == 2) return BehaviorCONST.BAD;
            else return BehaviorCONST.GOOD;
      }
    }
}