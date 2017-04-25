package Punto5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Item {

    private String Name;
    private double Unicost;
    private Producto Producto;
    
    

    public Item(String Name, double Unicost){
    this.Name=Name;
    this.Unicost=Unicost;
    
    }
    

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Unicost
     */
    public double getUnicost() {
        return Unicost;
    }

    /**
     * @param Unicost the Unicost to set
     */
    public void setUnicost(double Unicost) {
        this.Unicost = Unicost;
    }

    /**
     * @return the Producto
     */
    public Producto getProducto() {
        return Producto;
    }

    /**
     * @param Producto the Producto to set
     */
    public void setProducto(Producto Producto) {
        this.Producto = Producto;
    }
    
     
}
