/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intanddoubleexample;

/**
 *
 * @author oracle
 */
public class IntAndDoubleExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lowest = -2_147_483_648;   //-2,147,483,648
        int highest = 2_147_483_647;   //2,147,483,647
        
        double bigDecimalValue = 374374393485673.92348773838234;
        double scientificValue = 2.345123E22;
        
        System.out.println("Lowest: " + lowest);
        System.out.println("Highest: " + highest);
        
        System.out.println("Big Decimal Value: " + bigDecimalValue);
        System.out.println("Scientific Value: " + scientificValue);
        
        int quantity1 = 10;
        //int quantity2 = 5.5;
        
        double price1 = 29.99;
        double price2 = 10;     //interpret as 10.0
        
        double result = quantity1 * price1;
        
        System.out.println(result);
    }
    
}
