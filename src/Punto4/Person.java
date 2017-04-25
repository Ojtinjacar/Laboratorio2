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
public class Person {
    
    private String Nombre;
    private String Apellido;
    private Date DateBrithday;
    
    public Person(String Name, String LastName, Date DateBrithday){
    this.Nombre=Name;
    this.Apellido=LastName;
    this.DateBrithday=DateBrithday;          
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @return the DateBrithday
     */
    public Date getDateBrithday() {
        return DateBrithday;
    }
}
