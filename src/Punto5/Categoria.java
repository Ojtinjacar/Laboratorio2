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

public class Categoria {
 private String nombre;
 private String Descripcion;
 private ArrayList<Producto> Productos=new ArrayList<Producto>();
 
 
 public Categoria(String nombre, String Descripcion){
this.nombre=nombre;
this.Descripcion=Descripcion;
 }

 public void addProducto(String nombre, String Descripcion, String Itname1, double Itunicos1 ){
     
   Producto p = new Producto(nombre, Descripcion);
   p.addItems(Itname1, Itunicos1);
   p.setCategoria(this);
   this.Productos.add(p);
 
 } 
 /** 
  Permite agregar Item al Producto indicado**/
 
 public void addItem2Producto(String Productname, String Description,String Itname, double Itunicost){
 
 int size=this.Productos.size();
 for(int k=0;k<size;k++){
 if(Productname==Productos.get(k).getNombre()){
 if(Description==Productos.get(k).getDescripcion()){    
 // Toma el producto al que se le agregarán  Item
 Producto pnuevo=Productos.get(k);
 // Se le agrega Item
 pnuevo.addItems(Itname,Itunicost);
 // Se elimina producto viejo
 Productos.remove(k);
 // Se agrega el nuevo
 Productos.add(pnuevo);
 k=size;
 }
 }
 }
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
     * @return the Productos
     */
    public ArrayList<Producto> getProductos() {
        return Productos;
    }

    /**
     * @param Productos the Productos to set
     */
    public void setProductos(ArrayList<Producto> Productos) {
        this.Productos = Productos;
    }
 
   public void VerProductos(){
   int size=this.Productos.size();
      
   for(int k=0;k<=size-1;k++){
   Producto p=Productos.get(k);
   
   System.out.println("Nombre: "+ p.getNombre()+" "+p.getDescripcion());
   ArrayList<Item> Ip=p.getItem();
   int sizeItem=Ip.size();
   for(int j=0;j<sizeItem;j++)
 
   System.out.println("   Item #"+j+1+"  "+ Ip.get(j).getName()+", Costo Unitario "+Ip.get(j).getUnicost()+"$");
   }
   
}
}