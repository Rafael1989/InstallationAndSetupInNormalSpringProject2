/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringvariables;

/**
 *
 * @author oracle
 */
public class StringVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String address = "123 Oak St";
        String customer;
        String city;
        String zip = "12345", country = "USA";
        
        customer = "Steve";
        city = "Waterville";
        
        String region = city;
        //String uncommon = new String("Don't do this");
        
        System.out.println(address);
        System.out.println(customer);
        System.out.println(city);
        System.out.println(zip);
        System.out.println(country);
        System.out.println(region);
                
    }
    
}
