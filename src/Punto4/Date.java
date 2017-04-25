/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

/**
 *
 * @author Dario Arango
 */
public class Date {
private int Day;
private int Month;
private int year;
private String NamesDay;
private String NameMonths;

/*
 Constructor.
 */
public Date(int Dia, int mes, int año,String DiaNombre, String MesNombre){
this.Day=Dia;
this.Month=mes;
this.year=año;
this.NamesDay=DiaNombre;
this.NameMonths=MesNombre;
                      
}
    /**
     * @return the Day
     */
    public int getDay() {
        return Day;
    }

    /**
     * @param Day the Day to set
     */
    public void setDay(int Day) {
        this.Day = Day;
    }

    /**
     * @return the Month
     */
    public int getMonth() {
        return Month;
    }

    /**
     * @param Month the Month to set
     */
    public void setMonth(int Month) {
        this.Month = Month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the NamesDay
     */
    public String getNamesDay() {
        return NamesDay;
    }

    /**
     * @param NamesDay the NamesDay to set
     */
    public void setNamesDay(String NamesDay) {
        this.NamesDay = NamesDay;
    }

    /**
     * @return the NameMonths
     */
    public String getNameMonths() {
        return NameMonths;
    }

    /**
     * @param NameMonths the NameMonths to set
     */
    public void setNameMonths(String NameMonths) {
        this.NameMonths = NameMonths;
    }
    public Boolean IsLeapYear(int year){
    int b=year%4;
    if(b==0){
    return true;
    }
    else{
    return false;
    }
    }
    
    /**
     * @param args the command line arguments
     */
   
}
