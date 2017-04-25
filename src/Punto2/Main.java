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
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Yeison", "Serna", "123456");
        Cliente cliente2 = new Cliente("Oscar", "Tinjacá", "987654");
        Tipo tipo1 = new Tipo("Retirar.");
        Tipo tipo2 = new Tipo("Consignar.");
        Cuenta cuenta1 = new Cuenta(12345, "25/04/2017", cliente1, 100000);
        Cuenta cuenta2 = new Cuenta(98765, "26/04/2017", cliente2, 80000);
        Movimiento mov1 = new Movimiento("26/04/2017", tipo1, cuenta1.getSaldoActual(), 50000);
        Movimiento mov2 = new Movimiento("27/04/2017", tipo2, cuenta1.getSaldoActual()-50000, 50000);
        Movimiento mov3 = new Movimiento("28/04/2017", tipo1, cuenta1.getSaldoActual(), 50000);
        Movimiento mov4 = new Movimiento("29/04/2017", tipo2, cuenta1.getSaldoActual()-50000, 50000);
        cuenta1.agregarMovimiento(mov1);
        cuenta1.agregarMovimiento(mov2);
        cuenta2.agregarMovimiento(mov3);
        cuenta2.agregarMovimiento(mov4);
        Banco banco = new Banco("BBVA");
        banco.agregarTipo(tipo1);
        banco.agregarTipo(tipo2);
        banco.agregarCuenta(cuenta1);
        banco.agregarCuenta(cuenta2);
        banco.infoCuenta();
    }
}
