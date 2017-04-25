package Punto5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Producto {
    
private String nombre;
private String Descripcion;
private Categoria categoria;
private ArrayList<Item> itemp=new ArrayList<Item>();


public Producto(String nombre, String Descripcion){
this.nombre=nombre;
this.Descripcion=Descripcion;

}

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the items
     */
    public ArrayList getItem() {
        return itemp;
    }

    int conta=0;
    public void addItems(String NameIt, double UnicostIt) {
        Item I=new Item(NameIt, UnicostIt);
        I.setProducto(this);
        this.itemp.add(I);
   
        
    }


    
}
