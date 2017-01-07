/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial5;

/**
 *
 * @author Strzelcu
 */

class Dishwasher {
    
    int dishes;
    
    public Dishwasher() {
        this(30);
    }
    
    public Dishwasher(int dishes) {
        this.dishes = dishes;
        wash();
    }
    
    public void wash() {
        System.out.println("Zmywarka zaczyna zmywać naczynia. Ilość naczyń: " + dishes);
    }
    
}

public class test9 {
    public static void main(String[] args) {
        Dishwasher d1 = new Dishwasher();
        Dishwasher d2 = new Dishwasher(15);
    }
}