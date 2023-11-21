/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadedmethodsexercise;

/**
 *
 * @author oracle
 */
public class Shirt {
    public char colorCode;
    
    public void setColor(String theColor) {
        System.out.println("Setting color with String: " + theColor);
        if(theColor.length() > 0) {
            colorCode = theColor.charAt(0);
        }
    }
    
    public void setColor(char theColor) {
        System.out.println("Setting color with char: " + theColor);
        colorCode = theColor;
    }
    
    public char getColor() {
        return colorCode;
    }    
}
