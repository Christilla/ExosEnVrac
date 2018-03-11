/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosenvrac;

/**
 *
 * @author Christilla
 */
class Exercice8 {
    public void launch(){
    
      for (int i = 243;  i >= 0; i--){
         if((i % 2) == 0){
             System.out.println(i);}
     
         if((i % 5 )== 0){
             System.out.println(i);
            } 
         if ((i % 10)== 0){
             System.out.println(i);
         }
         
      }
    }
}
