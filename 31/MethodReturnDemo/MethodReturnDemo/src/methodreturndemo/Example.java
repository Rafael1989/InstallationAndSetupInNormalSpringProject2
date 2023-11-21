/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodreturndemo;

/**
 *
 * @author oracle
 */
public class Example {
    public void helloWorld() {
        System.out.println("Hello, World!");
    }
    
    public String returnHelloWorld() {
        return "Hello, World!";
    }
    
    public String returnHello(String recipient) {
        return "Hello, " + recipient + "!";
    }
    
    public int sum(int x, int y) {
        return x + y;
    }
    
    public boolean isGreater(int x, int y) {
        return x > y;
    }
}
