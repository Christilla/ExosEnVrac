/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosenvrac;

import java.util.Scanner;

/**
 *
 * @author Christilla
 */
class Exercice6 {

  public void launch() {
       System.out.print("Saisir la valeur du tableau: ");
       Scanner sc = new Scanner(System.in);
        //Crée la phrase qui demandera la valeur choisie dans la console
             int colonnetableau = sc.nextInt();
        System.out.println(colonnetableau);
        //Crée la variable Cotedamier qui sera la première colonne
         
        for (int lignetableau = 0; lignetableau < colonnetableau; lignetableau ++ ) {
            System.out.println();
            //Première boucle pour créer les lignes du tableau
            boolean cell = true;  
            //variable cell qui sera affiché aléatoirement (V/F) dans les cases du tableau
            for (int a = 0; a <= colonnetableau; a++) {
                //Deuxième boucle qui va remplir les lignes du tableau
                if (cell == true){
                    System.out.print(" Vrai ");
                    //Première condition: si cell = vrai, affiche * dans la case
                }else{
                    System.out.print(" Faux ");
                    //Deuxième conditon: si cell est faux, affiche / dans la case
                }
                cell = !cell;
                //Flag (?) pour inverser la condition de cell et afficher * et / à la suite
                    }
        
              }
        }
  }

