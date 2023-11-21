/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathematicaloperators;

/**
 *
 * @author oracle
 */
public class MathematicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 10, num2 = 5, num3 = 3;
        System.out.println("num1: " + num1 + ", num2: " + num2 + ", num3: " + num3);
        
        int result = num1 + num2;
        System.out.println("num1 + num2: " + result);
        
        result = num2 - num1;
        System.out.println("num2 - num1: " + result);
        
        result = num2 * num3;
        System.out.println("num2 * num3: " + result);
        
        //result = num1 / 0;
        result = num1 / num2;
        System.out.println("num1 / num2: " + result);
        
        result = num1 / num3;
        System.out.println("num1 / num3: " + result);
        
    }
    
}
