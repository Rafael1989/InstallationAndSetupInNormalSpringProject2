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
public class AddingMachine {
    public int add(int x, int y) {
        return x + y;
    }
    
    public double add(double x, double y) {
        return x + y;
    }
    
    public String add(String x, String y) {
        return x + " " + y;
    }
    
}
