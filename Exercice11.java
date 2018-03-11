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
class Exercice11 {
    public void launch(){
       int suite[]; {
       
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
  
      System.out.print(fib+";"); //}//fin du tableau suite
    
  int nombrespairs[]; {
  if((fib % 2) == 0){
             System.out.println("le tableau nombrespairs contient "+fib+" valeurs "); }
                } //fin du tableau nombrespairs
  
    int nombresimpairs[]; {
  if((fib % 1.5) == 0){
             System.out.println("le tableau nombresimpairs contient "+fib+" valeurs "); }
                } //fin du tableau nombrespairs
    int multiplesdecinq[]; {
  if((fib % 5) == 0){
             System.out.println("le tableau multiplesdecinq contient "+fib+" valeurs "); }
                } //fin du tableau multiplesdecinq
      int multiplesdetrois[]; {
  if((fib % 3) == 0){
             System.out.println("le tableau multiplesdetrois contient "+fib+" valeurs "); }
                } //fin du tableau nombrespairs
         }//fin de la boucle for 
                

       } //fin du tableau suite
   
    
   
    }//fin de la méthode launch()
 
    
}//fin de class Exercice11 
