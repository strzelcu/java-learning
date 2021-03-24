/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Strzelcu
 */

class Tank {
    
    boolean filled = false;
    
    public Tank(boolean filled) {
        this.filled = filled;
    }
    
    public void fill() {
        filled = true;
        System.out.println("Zbiornik został napełniony");
    }
    
    public void empty() {
        filled = false;
        System.out.println("Zbiornik został opróźniony");
    }
    
    @Override
    protected void finalize() {
        if(filled) {
            System.out.println("Błąd: zbiornik musi zostać opróżniony przed usunięciem");
        } else {
            try {
                super.finalize();
                System.out.println("Obiekt TANK usunięty.");
            } catch (Throwable ex) {
                Logger.getLogger(Tank.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

public class test12 {
    public static void main(String[] args) {
        Tank t1 = new Tank(true);
        t1.fill();
        System.gc();
        t1.empty();
        System.gc();
        t1.finalize();
        System.gc();
        new Tank(true);
        System.gc();
        new Tank(false);
        System.gc();
    }
}
