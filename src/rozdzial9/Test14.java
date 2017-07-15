/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial9;

import static rozdzial9.makeBreakfast.a;
import static rozdzial9.makeBreakfast.b;
import static rozdzial9.makeBreakfast.c;
import static rozdzial9.makeBreakfast.d;

/**
 *
 * @author Strzelcu
 */

interface CanCutOut {
    void cutFast();
    void cutSlow();
}

interface CanFry {
    void fry();
    void fry(int temp);
}

interface CanBake {
    void bake();
    void bake(int temp);
}

abstract class Cook implements CanCutOut, CanFry, CanBake {
    abstract void makeDish();
}

class Breakfast extends Cook {

    @Override
    public void makeDish() { }

    @Override
    public void cutFast() { }

    @Override
    public void cutSlow() { }

    @Override
    public void fry() { }

    @Override
    public void fry(int temp) { }

    @Override
    public void bake() { }

    @Override
    public void bake(int temp) { }
    
}

class makeBreakfast {
    public static void a(CanCutOut x) { x.cutFast(); }
    public static void b(CanFry x) { x.fry(); }
    public static void c(CanBake x) { x.bake(); }
    static void d(Cook x) { x.makeDish(); }
}

public class Test14 {
    public static void main(String[] args) {
        Breakfast b = new Breakfast();
        a(b);
        b(b);
        c(b);
        d(b);
    }
}
