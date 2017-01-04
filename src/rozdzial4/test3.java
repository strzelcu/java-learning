/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial4;

import java.util.Random;
import sun.misc.Signal;
import sun.misc.SignalHandler;

/**
 *
 * @author Strzelcu
 */
public class test3 {
            
    boolean bool = false;
    
    public static void main(String[] args) {

        Random generator = new Random();
     
        while(true) {
            int a;
            a = generator.nextInt();
            int b;
            b = generator.nextInt();
            System.out.print("A = " + a + " B = " + b + " ");
            if(a>b) {
                System.out.println("Wynik = 1");
            } else if(a==b) {
                System.out.println("Wynik = 0");
            } else if(a<b) {
                System.out.println("Wynik = -1");
            }
        }
    }
}
