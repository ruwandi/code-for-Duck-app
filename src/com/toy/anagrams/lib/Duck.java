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

    public abstract class Duck {
    
   FlyBehavior ﬂyBehavior; 
   QuackBehavior quackBehavior;  
   public Duck() {   }    
   public abstract void display();
   public void performFly() 
            {      ﬂyBehavior.ﬂy();   }
   public void performQuack() 
            {      quackBehavior.quack();   } 
   public void swim()  { 
       System.out.println("All ducks ﬂoat, even decoys!"); 
   } 
   public void setFlyBehavior(FlyBehavior fb) {    ﬂyBehavior = fb; }
   public void setQuackBehavior(QuackBehavior qb) {    quackBehavior = qb; }

}


