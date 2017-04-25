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
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Yeison", "Serna");
        
        Carro carro1 = new Carro("Mercedez", "FCB-961", 12345);
        
        Ruedas rueda1 = new Ruedas("Michelin1");
        Ruedas rueda2 = new Ruedas("Michelin2");
        Ruedas rueda3 = new Ruedas("Michelin3");
        Ruedas rueda4 = new Ruedas("Michelin4");
        
        Motor motor = new Motor(1234);
        
        carro1.adicionarMotor(motor);
        carro1.adicionarRueda(rueda1);
        carro1.adicionarRueda(rueda2);
        carro1.adicionarRueda(rueda3);
        carro1.adicionarRueda(rueda4);
        
        persona1.adicionarCarro(carro1);
        
        Carro carro2 = new Carro("Ford", "RMD-261", 1345);
        
        Motor motor1 = new Motor(12374);
        
        carro2.adicionarMotor(motor1);
        carro2.adicionarRueda(rueda1);
        carro2.adicionarRueda(rueda2);
        carro2.adicionarRueda(rueda3);
        carro2.adicionarRueda(rueda4);
        
        persona1.adicionarCarro(carro2);
        
        persona1.listarCarros();
    }
}
