/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Persona {
    private String nombre;
    private String apellido;
    private ArrayList<Carro> carros;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    public void adicionarCarro(Carro carro){
        this.carros.add(carro);
    }
    
    public void listarCarros(){
        for (Carro carro : carros) {
            System.out.println(carro.getMarca() + "\n" + carro.getPlaca() );
            carro.carroInfo();
            System.out.println();
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
