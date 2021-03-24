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

class WithFinals {
    private final void f() { print("WithFinals.f()");}
    private void g() { print("WithFinals.g()");}
}

class OverridingPrivate extends WithFinals {
    void f() {
        print("OverridingPrivate.f()");
    }
    void g() {
        print("OverridingPrivate.g()");
    }
    
    final void Unoverrided() {
        print("U cannot override me!");
    }
    
}

class OverridingPrivate2 extends OverridingPrivate {
    @Override
    public void f() {
        print("OverridingPrivate2.f()");
    }
    @Override
    public void g() {
        print("OverridingPrivate2.g()");
    }
    
    /*@Override // Nie można przesłonić metody finalnej
    public void Unoverrided() {
        
    }*/
}

public class Test20 {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;
        op.f();
        op.g();
    }
}
