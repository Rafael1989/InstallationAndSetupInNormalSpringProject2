/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingvariables;

/**
 *
 * @author oracle
 */


public class UsingVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Steve";
        int quantity = 2;
        double price = 9.99;
        boolean outOfStock = false;
        
        String anotherName = name;
        double amount = price * quantity;
    
        System.out.println(name);
        System.out.println(quantity);
        System.out.println(price);
        System.out.println(outOfStock);  
        
        System.out.println(anotherName);
        System.out.println(amount);
    }
    
}
