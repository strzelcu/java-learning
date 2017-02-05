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

class First {
    First() {
        print("Konstruktor klasy First");
    }
}

class Second extends First{
    Second() {
        super();
        print("Domyślny konstruktor klasy Second");
    }
    
    Second(int parameter) {
        super();
        print("Niedomyślny konstruktor klasy Second");
    }
}

public class Test8 {
    public static void main(String[] args) {
        Second s = new Second();
        s = new Second(11);
    }
}
