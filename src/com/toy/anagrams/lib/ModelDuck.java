/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toy.anagrams.lib;

/**
 *
 * @author User-PC
 */
public class ModelDuck extends Duck{
      public ModelDuck() {
          ﬂyBehavior = new FlyNoWay(); 
          quackBehavior = new Quack();    }
    public void display() { 
        System.out.println("I’m a model duck"); 
    } 
}
