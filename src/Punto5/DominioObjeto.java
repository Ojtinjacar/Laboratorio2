package Punto5;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dario Arango
 */
public class DominioObjeto {
 private String Id;
 private ArrayList<Producto> Productos;
 private ArrayList<Categoria> Categorias;
 private ArrayList<Item> Items;
 private ArrayList<Costumer> Costumers;

 
 public DominioObjeto(String Id){
 this.Id=Id;
 }   

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the Producto
     */
    public ArrayList getProducto() {
        return this.Productos;
    }

   
    public void addProducto(Producto P1) {
        this.Productos.add(P1);
    }

    
    public ArrayList getCategoria() {
        return this.Categorias;
    }

    
    public void addCategoria(Categoria C1) {
        this.Categorias.add(C1);;
    }

    /**
     * @return the Item
     */
    public ArrayList getItem() {
        return Items;
    }

  
    public void addetItem(Item I1) {
        this.Items.add(I1);
    }

    /**
     * @return the Costumer
     */
    public ArrayList getCostumer() {
        return Costumers;
    }

    /**
     * @param Costumer the Costumer to set
     */
    public void addCostumer(Costumer Cos1) {
        this.Costumers.add(Cos1);
    }
 
public static void main(String[] args){

    // Creación de catoegoria de productos de grano
    Categoria Granos=new Categoria("Granos", "Por libra");
    Granos.addProducto("Arroz", "Roa", "500 gr", 1300);
    Granos.addProducto("Lenteja", "Doña pepa", "1000 gr", 5100);
    Granos.addProducto("Frijol", "Bola Roja", "500 gr", 4100);
    Granos.addProducto("Arveja", "Verdolaga", "1000 gr", 3100);
    
    Granos.VerProductos();
    
    Granos.addItem2Producto("Arroz","Roa","1000 gr", 2500);
    System.out.println("*******NUEVA LISTA****");
    Granos.VerProductos();
} 
}

