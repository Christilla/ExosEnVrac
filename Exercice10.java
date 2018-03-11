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
class Exercice10 {
    public void launch(){
      int ind;
  
  
    int fib = 1;
    int terme_prec1 = 2;
    int terme_prec2 = 1;
    
    
    for ( ind = 1 ; ind <= 100; ind++ ) {
  
      if ( ind == 2 ) {
        fib = 2; }
  
      if ( ind > 2 ) {
        fib = terme_prec1 + terme_prec2;
        terme_prec2 = terme_prec1;
        terme_prec1 = fib; }
  
      System.out.print(fib+";"); }
    
    
    }
}
