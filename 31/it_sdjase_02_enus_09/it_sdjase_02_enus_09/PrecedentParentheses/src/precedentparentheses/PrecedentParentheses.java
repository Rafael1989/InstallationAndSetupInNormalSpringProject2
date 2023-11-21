/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package precedentparentheses;

/**
 *
 * @author oracle
 */
public class PrecedentParentheses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j = 4;
        System.out.println("j: " + j);
        
        j++; //j = j + 1
        System.out.println("j: " + j);
        
        j--; //j = j - 1
        System.out.println("j: " + j);
        
        int c = ((25 - j) * 4) / (2 - 10 + 4);
        
        System.out.println("c: " + c);
       
    }
    
}
