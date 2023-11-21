/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringconcatenation;

/**
 *
 * @author oracle
 */
public class StringConcatenation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String greeting1 = "Hello";
        String greeting2 = "Hi";

        String recipient1 = "World";
        String recipient2 = "Steve";

        String message = greeting1 + ", " + recipient1 + "!";

        System.out.println(message);
        System.out.println(greeting2 + ", " + recipient2 + "?");
        
    }
    
}
