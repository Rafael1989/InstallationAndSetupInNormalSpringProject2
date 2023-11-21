/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forarraydemo;

/**
 *
 * @author oracle
 */
public class ForArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = { "Steve", "Mary", "William" };
        
        for(String name : names) {
            System.out.println("Name is " + name);
        }
        
        System.out.println();
        
        int[] ages = { 39, 27, 97 };
        
        for(int age : ages) {
            System.out.println("Age is " + age);            
        }
    }
    
}
