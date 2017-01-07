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

class Movie {
    boolean inUse = false;
    
    Movie(boolean inUse) {
        this.inUse = inUse;
    }
    
    void watch() {
        inUse = true;
    }
    
    protected void finalize() {
        if(inUse) {
            System.out.println("Błąd: Film w trakcie oglądania.");
        } 
    }
    
}

public class test10 {
    public static void main(String[] args) {
        Movie PI = new Movie(true);
        PI.watch();
        new Movie(true);
        System.gc();
    }
}
