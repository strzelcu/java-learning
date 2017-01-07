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

class TestFour {
    
    TestFour() {
        System.out.println("Konstruktor wypisuje komunikat");
    }
    
    TestFour(String s) {
        System.out.println("Konstruktor wypisuje komunikat: " + s);
    }
    
}

public class test4 {
    public static void main(String[] args) {
        TestFour t1 = new TestFour();
        TestFour t2 = new TestFour("Komunikat próbny");
    }
}
