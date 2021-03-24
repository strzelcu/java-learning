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

class A {
    A(int parameter) {
        print("Konstruktor A");
    }
}

class B {
    B(int parameter) {
        print("Konstruktor B");
    }
}

class C extends A {
    C() {
        super(11);
        B b = new B(11);
        print("Konstruktor C");
    }
}

public class Test5 {
    public static void main(String[] args) {
        C c = new C();
    }
}
