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

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = 
            printInit("static Insect.x1 zainicjalizowana");
    static int printInit(String s) {
        print(s);
        return 47;
    }
}

class Beetle extends Insect {
    private int k = printInit("Beetle.k zainicjalizowana");
    public Beetle() {
        print("k = " + k);
        print("j = " + j);
        print("Konstruktor klasy Beetle");
    }
    private static int x2 =
            printInit("static Beetle.x2 zainicjalizowana");
}

class DungBeetle extends Beetle {
    private int k = printInit("DungBeetle.k zainicjalizowana");
    public DungBeetle() {
        print("konstruktor klasy DungBeetle");
        print("DungBeetle: " + k + " " + j);
    }
    
    private static int x3 =
            printInit("static DungBeetle.x3 zainicjalizowana");
    
}

public class Test23 {
    public static void main(String[] args) {
        DungBeetle b = new DungBeetle();
        b = new DungBeetle(); // Ładowanie klas ma miejsce tylko raz ponieważ klasy statyczne ponownie się nie załadowały.
    }
}
