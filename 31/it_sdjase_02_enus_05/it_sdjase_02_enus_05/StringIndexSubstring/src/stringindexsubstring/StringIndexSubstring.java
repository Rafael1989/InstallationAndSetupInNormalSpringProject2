/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringindexsubstring;

/**
 *
 * @author oracle
 */
public class StringIndexSubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ipAddress = "122.72.1.45";
        System.out.println("IP Address: " + ipAddress);
        
        int index1 = ipAddress.indexOf('.');
        System.out.println("The index of '.': " + index1);
        
        int index2 = ipAddress.indexOf('.', index1 + 1);
        System.out.println("The second index of '.': " + index2);
        
        String secondByte = ipAddress.substring(index1 + 1, index2);
        System.out.println("Second byte of the ip Address is: " + secondByte);
    }
    
}
