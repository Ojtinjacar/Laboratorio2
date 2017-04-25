/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

/**
 *
 * @author Dario Arango
 */
public class MAIN {
     public static void main(String[] args) {
        // TODO code application logic here
    int y=2015;
    Date CumpleDario=new Date(28,8,1992,"Viernes","Agosto");
    Person p1=new Person("Dario","Arango",CumpleDario);
    Boolean a=CumpleDario.IsLeapYear(CumpleDario.getYear());
    System.out.println("La persona: "+p1.getNombre()+" "+p1.getApellido()+" cumple el día "+ p1.getDateBrithday().getDay()+ " de "+p1.getDateBrithday().getNameMonths());
    System.out.println("La persona: "+p1.getNombre()+" "+p1.getApellido()+" nació en "+ p1.getDateBrithday().getYear());
    System.out.println("¿Bisiesto?");
        System.out.println(a);
       
    
    }
    
}
