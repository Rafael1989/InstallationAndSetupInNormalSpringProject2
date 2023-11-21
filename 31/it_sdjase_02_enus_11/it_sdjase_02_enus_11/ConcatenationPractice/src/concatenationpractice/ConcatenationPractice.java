/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenationpractice;

/**
 *
 * @author oracle
 */
public class ConcatenationPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String message;
        String name = "Steve";
        String unit = "km";
        int hours = 1;
        int minutes = 20;
        int seconds = 2;
        double distance = 21.1;
        
        message = name + " ran "  + distance + unit + " in " 
            + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.";
        System.out.println(message);
    }
    
}
