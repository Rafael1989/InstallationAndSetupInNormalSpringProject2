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
public class Calculator {
    public void doNothing() {
        System.out.println("Nothing to do.");
    }
    
    public void addSelf(int x) {
        System.out.println(x + x);
    }
    
    public void subtract2(int x, double y) {
        System.out.println(x-y);
    }
    
    public void add3(int x, double y, int z) {
        System.out.println(x+y+z);
    }
}
