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
class Exercice4 extends ComBewebBeziersProgrammationExosEnVrac{
    
    public void launch() {
     boolean flag = false;
     int i = 0;
     
     if (flag == false ) {
       System.out.println(++i);
     }
     else{
    System.out.println(--i);
     }
       flag = !flag;  
     
     if (flag == true ) {
       System.out.println(++i);
     }
     else{
    System.out.println(--i);
     }
     //la valeur finale de l'algorythme est de 2
     
     
    }
}
