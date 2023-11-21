/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakcontinuedemo;

/**
 *
 * @author oracle
 */
public class BreakContinueDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] scores = { 55, 96, 35, 0, 87, 22, 101, 79 };
        
        for(int score : scores) {
            if(score == 0) {
                System.out.println("Ignoring score of 0.");
                continue;
            }
            if(score > 100) {
                System.out.println("Invalid score: " + score);
                break;
            }
            System.out.println("Score is " + score);
        }
        
    }
    
}
