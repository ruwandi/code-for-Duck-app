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
public class MiniDuckSimiulaor {
     public static void main(String[] args) {     
         Duck mallard = new MallardDuck();   
         mallard.performQuack();     
         mallard.performFly();  
         
      Duck model = new ModelDuck();
      model.performFly();
      model.setFlyBehavior(new FlyRocketPowered());
      model.performFly();
     } 
}
