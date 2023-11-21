/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tworeferencesdemo;

/**
 *
 * @author oracle
 */
public class TwoReferencesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        Shirt yourShirt = new Shirt();
        
        myShirt = yourShirt;
        myShirt.colorCode = 'R';
        yourShirt.displayColor();
        yourShirt.colorCode = 'G';
        
        myShirt.displayColor();
        
    }
    
}
