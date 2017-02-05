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

class Component1 {
    public Component1(int parameter) {
        print("Konstruktor Component1 " + parameter);
    }
    
    void dispose() {
        print("Usuwanie obiektu Component1");
    }
}

class Component2 {
    public Component2(int parameter) {
        print("Konstruktor Component2 " + parameter);
    }
    void dispose() {
        print("Usuwanie obiektu Component2");
    }
}

class Component3 {
    public Component3(int parameter) {
        print("Konstruktor Component3 " + parameter);
    }
    void dispose() {
        print("Usuwanie obiektu Component3");
    }
}

class Root {
    Component1 c1;
    Component2 c2;
    Component3 c3;
    
    public Root(int parameter) {
        c1 = new Component1(parameter);
        c2 = new Component2(parameter);
        c3 = new Component3(parameter);
        print("Konstruktor Root " + parameter);
    }
    
    void dispose() {
        print("Usuwanie obiektu Root");
        c3.dispose();
        c2.dispose();
        c1.dispose();
    }
}

class Stem extends Root {
    
    Component1 sc1;
    Component2 sc2;
    Component3 sc3;
    
    public Stem(int parameter) {
        super(parameter);
        sc1 = new Component1(parameter);
        sc2 = new Component2(parameter);
        sc3 = new Component3(parameter);
        print("Konstruktor Stem " + parameter);
    }
    
    @Override
    void dispose() {
        print("Usuwanie obiektu Stem");
        sc3.dispose();
        sc2.dispose();
        sc1.dispose();
        super.dispose();
    }
}

public class Test9 {
    public static void main(String[] args) {
        Stem s = new Stem(666);
        s.dispose();
    }
}
