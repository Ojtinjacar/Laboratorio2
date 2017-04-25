/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

/**
 *
 * @author oscar
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Programación CineCol = new Programación();

        Sala SalaA = new Sala("N1");
        Sala SalaB = new Sala("N2");
        Semana semana1 = new Semana(1);
        Semana semana2 = new Semana(2);
        Dia[] Diahabiles = new Dia[5];
        Diahabiles[0] = new Dia("24/04/17", "Lunes");
        Diahabiles[1] = new Dia("25/04/17", "Martes");
        Diahabiles[2] = new Dia("26/04/17", "Miercoles");
        Diahabiles[3] = new Dia("27/04/17", "Jueves");
        Diahabiles[4] = new Dia("28/04/17", "Viernes");
        Dia[] Diahabiles1 = new Dia[5];
        Diahabiles1[0] = new Dia("01/04/17", "Lunes");
        Diahabiles1[1] = new Dia("02/05/17", "Martes");
        Diahabiles1[2] = new Dia("03/05/17", "Miercoles");
        Diahabiles1[3] = new Dia("04/05/17", "Jueves");
        Diahabiles1[4] = new Dia("05/05/17", "Viernes");
        Pelicula Pitufos = new Pelicula("pitufos", 120, "13:00", "15:00");
        Pelicula RapidoFurioso = new Pelicula("rapidofurioso", 200, "16:00", "19:20");
        Pelicula RapidoFurioso1 = new Pelicula("rapidofurioso1", 190, "10:00", "13:10");
        Pelicula Conjuro = new Pelicula("Conjuro", 130, "11:00", "13:10");
        Pelicula Conjuro2 = new Pelicula("Conjuro2", 110, "11:00", "12:50");
        Pelicula Vengadores = new Pelicula("Vengadores", 180, "19:00", "22:00");
        Pelicula iron_Man = new Pelicula("Iron Man", 170, "21:00", "23:50");
        Pelicula CapitanAmerica = new Pelicula("Capitan America", 210, "15:00", "18:10");

        CineCol.AdicionarSalas(SalaA);
        CineCol.AdicionarSalas(SalaB);

        
        SalaA.adicionarsemana(semana1);
        SalaA.adicionarsemana(semana2);
        SalaB.adicionarsemana(semana2);
        SalaB.adicionarsemana(semana1);
        semana1.Añadirdía(Diahabiles[0]);
        semana1.Añadirdía(Diahabiles[1]);
        semana2.Añadirdía(Diahabiles1[0]);
        semana2.Añadirdía(Diahabiles1[1]);

        Diahabiles[0].AñadirPelicula(Pitufos);
        Diahabiles[0].AñadirPelicula(RapidoFurioso);
        Diahabiles[1].AñadirPelicula(Conjuro);
        Diahabiles[1].AñadirPelicula(RapidoFurioso1);
        Diahabiles1[0].AñadirPelicula(CapitanAmerica);
        Diahabiles1[0].AñadirPelicula(Conjuro2);
        Diahabiles1[1].AñadirPelicula(Vengadores);
        Diahabiles1[1].AñadirPelicula(iron_Man);
        
        
        
      
    }

}
