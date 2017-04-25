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
public class Costumer{
    
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Calle1;
    private String Calle2;
    private String Ciudad;
    private String Estado;
    private String Zipcode;
    private String Pais;
    
    public Costumer(String nombre, String apellido, String Telefono, String Calle1,
            String Calle2, String Ciudad,String Estado, String Zipcode, String Pais){
    this.Nombre=nombre;
    this.Apellido=apellido;
    this.Telefono=Telefono;
    this.Calle1=Calle1;
    this.Calle2=Calle2;
    this.Ciudad=Ciudad;
    this.Estado=Estado;
    this.Zipcode=Zipcode;
    this.Pais=Pais;
    
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the Calle1
     */
    public String getCalle1() {
        return Calle1;
    }

    /**
     * @param Calle1 the Calle1 to set
     */
    public void setCalle1(String Calle1) {
        this.Calle1 = Calle1;
    }

    /**
     * @return the Calle2
     */
    public String getCalle2() {
        return Calle2;
    }

    /**
     * @param Calle2 the Calle2 to set
     */
    public void setCalle2(String Calle2) {
        this.Calle2 = Calle2;
    }

    /**
     * @return the Ciudad
     */
    public String getCiudad() {
        return Ciudad;
    }

    /**
     * @param Ciudad the Ciudad to set
     */
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the Zipcode
     */
    public String getZipcode() {
        return Zipcode;
    }

    /**
     * @param Zipcode the Zipcode to set
     */
    public void setZipcode(String Zipcode) {
        this.Zipcode = Zipcode;
    }

    /**
     * @return the Pais
     */
    public String getPais() {
        return Pais;
    }

    /**
     * @param Pais the Pais to set
     */
    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    
    
}
