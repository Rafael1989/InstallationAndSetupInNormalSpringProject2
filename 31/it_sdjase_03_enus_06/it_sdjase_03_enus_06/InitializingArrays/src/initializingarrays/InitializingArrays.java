/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializingarrays;

/**
 *
 * @author oracle
 */
public class InitializingArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] ages = new int[3];
        ages[0] = 39;
        ages[1] = 42;
        ages[2] = 97;   //problem?
        
        String[] names = new String[3];
        names[0] = "Mary";
        names[1] = "Bob";
        names[2] = "Carlos";
        
        int[] scores = { 99, 65, 78, 56, 84 };
        
        String[] items = { "Shirt", "Trousers", "Scarf" };
    }
    
}
