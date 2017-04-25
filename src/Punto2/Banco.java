/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.util.ArrayList;

/**
 *
 * @author Yeison
 */
public class Banco {

    private String name;
    private ArrayList<Cuenta> cuentas;
    private ArrayList<Tipo> tipos;

    public Banco(String name) {
        this.name = name;
        cuentas = new ArrayList<>();
        tipos = new ArrayList<>();
    }
    
    public void agregarCuenta(Cuenta cuenta){
        this.cuentas.add(cuenta);
    }
    
    public void agregarTipo(Tipo tipo){
        this.tipos.add(tipo);
    }
    
    public void infoCuenta(){
        System.out.println("INFORMACIÓN DE CUENTAS: ");
        for (Cuenta cuenta : cuentas) {
            System.out.println("\nNumero de cuenta: " + cuenta.getNumero() + "\nFecha de creación: " + cuenta.getFechaCreacion().getFecha() + "\nNombre propietario: " + cuenta.getCliente().getNombre() + " " + cuenta.getCliente().getApellido() + "\nSaldo actual: " + cuenta.getSaldoActual());
            cuenta.mostrarMovimientos();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public ArrayList<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(ArrayList<Tipo> tipos) {
        this.tipos = tipos;
    }
    
    
}
