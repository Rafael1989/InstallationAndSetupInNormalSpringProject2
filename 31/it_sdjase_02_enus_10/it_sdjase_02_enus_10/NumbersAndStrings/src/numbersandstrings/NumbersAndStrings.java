/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersandstrings;

/**
 *
 * @author oracle
 */
public class NumbersAndStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Steve";
        String items = "cables";
        String message;
        int quantity = 5;
        double price = 3.99;
        
        message = name + " ordered " + quantity + " " + items + " at $" + price + ".";
        System.out.println(message);
        System.out.printf("The total was: %.2f\n", quantity * price);
        
        //careful!
        message = "One more: " + (quantity + 1);
        
        System.out.println(message);
    }
    
}
