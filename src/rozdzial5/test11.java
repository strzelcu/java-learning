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

class Movie2 {
    boolean inUse = false;
    
    Movie2(boolean inUse) {
        this.inUse = inUse;
    }
    
    void watch() {
        inUse = true;
    }
    
    void unwatch() {
        inUse = false;
    }
    
    protected void finalize() {
        if(inUse) {
            System.out.println("Błąd: Film w trakcie oglądania.");
        } else {
            System.out.println("Obiekt Movie usunięty z pamięci");
        }
    }
    
}

public class test11 {
    public static void main(String[] args) {
        Movie2 PI = new Movie2(true);
        PI.watch();
        new Movie(true);
        System.out.println("Próba pierwsza:");
        System.runFinalization();
        System.out.println("Próba druga:");
        Runtime.getRuntime().runFinalization();
        System.out.println("Próba trzecia:");
        System.gc();
        System.out.println("Próba czwarta:");
        System.runFinalizersOnExit(true);
    }
}
