/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectreferencesdemo;

/**
 *
 * @author oracle
 */
public class ObjectReferencesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Camera remote1 = new Camera();
        remote1.menu();
        
        TV remote2 = new TV();
        remote2.menu();
        
        Shirt myShirt = new Shirt();
        myShirt.display();
        
        Trousers myTrousers = new Trousers();
        myTrousers.display();
    }
    
}
