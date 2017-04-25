/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

/**
 *
 * @author Yeison
 */
public class Movimiento {

    private Date fecha;
    private Tipo tipo;
    private double monto;
    private double saldoAnterior;

    public Movimiento(String fecha, Tipo tipo, double saldoAnterior, double monto) {
        this.fecha = new Date(fecha);
        this.tipo = tipo;
        this.monto = monto;
        this.saldoAnterior = saldoAnterior;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

}
