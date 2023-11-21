/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodparametersdemo;

/**
 *
 * @author oracle
 */
public class MethodParametersDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        calc.doNothing();
        
        calc.addSelf(2);
        
        calc.subtract2(50, 5.0);
        
        calc.add3(1, 2.0, 3);
    }
    
}
