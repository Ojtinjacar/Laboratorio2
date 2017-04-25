/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author Estudiante
 */
public class Carro {

    private Motor motor;
    private Ruedas[] rueda;
    private Chassis chassis;
    private String marca;
    private String placa;
    private int numRueda;

    public Carro(String marca, String placa, int serial) {
        this.rueda = new Ruedas[4];
        this.marca = marca;
        this.placa = placa;
        this.chassis = new Chassis(serial);
    }

    public void adicionarRueda(Ruedas rueda) {
        if (numRueda < 4) {
            this.rueda[numRueda] = rueda;
            numRueda++;
        }
    }

    public void adicionarMotor(Motor motor) {
        this.motor = motor;
    }
    
    public void carroInfo(){
        System.out.println("Numero de ruedas: " + numRueda +  "\nSerial Chasis: " + chassis.getSerial() + "\nSerial Motor: " + motor.getSerial());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
