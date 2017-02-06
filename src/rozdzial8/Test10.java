/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial8;

import static util.Print.print;

/**
 *
 * @author Strzelcu
 */

class BaseClass {
    void one() { this.two(); }
    void two() { print("BaseClass.two()"); }
}

class DerivedClass extends BaseClass {
    @Override
    void two() {
        print("DerivedClass.two()");
    }
}

public class Test10 {
    public static void main(String[] args) {
        BaseClass bc = new DerivedClass();
        bc.one();
    }
}
