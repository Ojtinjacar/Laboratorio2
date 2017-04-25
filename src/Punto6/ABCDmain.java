/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

/**
 *
 * @author Dario Arango
 */
public class ABCDmain {
     public static void main(String[] args) {
        // TODO code application logic here
        G[] elements={new G(), new F(), new H(), new E()};
         for (int i = 0; i <elements.length; i++) {
             System.out.println(elements[i]);
             elements[i].Metodo1();
             elements[i].Metodo2();
             System.out.println();
         }
        
    }
}
