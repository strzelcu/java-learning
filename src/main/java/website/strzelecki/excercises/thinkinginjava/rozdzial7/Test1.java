/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial7;

import static website.strzelecki.excercises.thinkinginjava.util.Print.print;

/**
 *
 * @author Strzelcu
 */

class Tomato {
    String colour;
    
    public Tomato() {
        print("Utworzono.");
    }
    
}

public class Test1 {
    public static void main(String[] args) {
        Tomato pomidor = new Tomato();
    }
}
