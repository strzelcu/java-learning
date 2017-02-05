/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial7;

import static util.Print.print;

/**
 *
 * @author Strzelcu
 */

class Art {
    Art() { print("Konstruktor klasy Art"); }
}

class Drawing extends Art {
    Drawing() { print("Konstruktor klasy Drawing"); }
}

class Cartoon extends Drawing {
    public Cartoon() { print("Konstruktor klasy Cartoon"); }
}

public class Test3 {
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}