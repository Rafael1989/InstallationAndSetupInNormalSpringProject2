/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloadingdemo;

/**
 *
 * @author oracle
 */
public class MethodOverloadingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AddingMachine adder = new AddingMachine();
        
        System.out.println(adder.add(2, 2));
        System.out.println(adder.add(3.0, 3.0));
        System.out.println(adder.add("Good", "Luck"));
    }
    
}
