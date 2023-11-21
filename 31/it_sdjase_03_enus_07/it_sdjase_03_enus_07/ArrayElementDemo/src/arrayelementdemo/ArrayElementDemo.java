/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayelementdemo;

/**
 *
 * @author oracle
 */
public class ArrayElementDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] ages = { 39, 27, 97 };
        int myAge = ages[0];
        int yourAge = ages[1];
        
        System.out.println("My age is: " + myAge);
        System.out.println("Your age is: " + yourAge);
        System.out.println("My friend's age is: " + ages[2]);
        //System.out.println("What about ages[3]: " + ages[3]);
        
        String[] names = { "Steve", "Mary", "William" };
        
        names[2] = "Bill";
        
        System.out.println("names[2]: " + names[2]);
    }
    
}
