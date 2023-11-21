/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodreturndemo;

/**
 *
 * @author oracle
 */
public class MethodReturnDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Example example = new Example();
        
        example.helloWorld();
        
        String message = example.returnHelloWorld();
        System.out.println(message);

        System.out.println(example.returnHello("Earth"));
        
        int sum = example.sum(2,2);
        System.out.println(sum);
        
        boolean result = example.isGreater(1,2);
        System.out.println(result);
        
    }
    
}
