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
public class Cuenta {

    private int numero;
    private Date fechaCreacion;
    private Cliente cliente;
    private double saldoActual;
    private ArrayList<Movimiento> movimientos;

    public Cuenta(int numero, String fechaCreacion, Cliente cliente, double saldoActual) {
        this.numero = numero;
        this.fechaCreacion = new Date(fechaCreacion);
        this.cliente = cliente;
        this.saldoActual = saldoActual;
        movimientos = new ArrayList<>();
//        movimientos.add(new Movimiento("26/04/2017", "ajsha", saldoActual, saldoActual));
    }
    
    public void agregarMovimiento(Movimiento movimiento){
        this.movimientos.add(movimiento);
    }
    
    public void mostrarMovimientos(){
        System.out.println("MOVIMIENTOS: ");
        for (Movimiento movimiento : movimientos) {
            this.saldoActual = movimiento.getSaldoAnterior();
            System.out.print("-Fecha movimiento: " + movimiento.getFecha().getFecha() + "\n Tipo movimiento: " + movimiento.getTipo().getDescripcion() + "\n Saldo anterior: " + this.saldoActual + "\n Monto: " + movimiento.getMonto());
            System.out.println();
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
    
    

}
