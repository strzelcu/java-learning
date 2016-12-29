/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial3;

/**
 *
 * @author Strzelcu
 */

class Bottle {
    float capacity;
}

public class test2 {
    public static void main(String[] args) {
        Bottle butelka1 = new Bottle();
        Bottle butelka2 = new Bottle();
        
        butelka1.capacity = 0.7f;
        butelka2.capacity = 1.0f;
        
        System.out.println("Butelka1 ma pojemność: " + butelka1.capacity + " Butelka2 ma pojemność: " + butelka2.capacity);
        
        butelka1 = butelka2;
        
        System.out.println("Butelka1 ma pojemność: " + butelka1.capacity + " Butelka2 ma pojemność: " + butelka2.capacity);
        
    }
}
