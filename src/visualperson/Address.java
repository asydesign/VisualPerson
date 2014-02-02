/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualperson;

/**
 *
 * @author fmi
 */
public class Address {
    private String city;
    private int code;
    private double popDen;

    public Address (String city, int code, double popDen){
        this.city = city;
        this.code = code;
        this.popDen = popDen;
    }
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPopDen() {
        return popDen;
    }

    public void setPopDen(double popDen) {
        this.popDen = popDen;
    }
    
    
    public String getCity(){
        return city;
    }
    
    public void setCity(String c){
        this.city = c;
    }
    
    
}

