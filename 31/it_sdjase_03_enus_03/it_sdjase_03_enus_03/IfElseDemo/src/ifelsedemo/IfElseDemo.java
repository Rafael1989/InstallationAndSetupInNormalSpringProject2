/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelsedemo;

/**
 *
 * @author oracle
 */
public class IfElseDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hours = 0;
        
        String suffix;
        
        if(hours == 1) {
            suffix = "";        
        } else {
            suffix = "s";
        }
        
        System.out.println(hours + " hour" + suffix);
        
        boolean timesUp;
        
        timesUp = (hours == 0);
        
        System.out.println("Times up? " + timesUp);
    }
    
}
