/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablescopedemo;

/**
 *
 * @author oracle
 */
public class Shirt {
    public String description;
    public char colorCode;
    public double price;
    
    public void setColor(String theColor) {
        if(theColor.length() > 0) {
            colorCode = theColor.charAt(0);
        }
    }
    
    public char getColor() {
        return colorCode;
    }
}
