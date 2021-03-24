/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial9;

import static website.strzelecki.excercises.thinkinginjava.rozdzial9.Adventure.t;
import static website.strzelecki.excercises.thinkinginjava.rozdzial9.Adventure.u;
import static website.strzelecki.excercises.thinkinginjava.rozdzial9.Adventure.v;
import static website.strzelecki.excercises.thinkinginjava.rozdzial9.Adventure.w;
import static website.strzelecki.excercises.thinkinginjava.rozdzial9.Adventure.y;

/**
 *
 * @author Strzelcu
 */

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}

class ActionCharacter {
    void fight() {}
}

class Hero extends ActionCharacter
        implements CanFight, CanSwim, CanFly, CanClimb {
    @Override
    public void swim() { }
    @Override
    public void fly() { }
    @Override
    public void climb() { }

    @Override
    public void fight() {

    }
}

class Adventure {
    public static void t(CanFight x) { x.fight(); }
    static void u(CanSwim x) { x.swim(); }
    static void v(CanFly x) { x.fly(); }
    public static void w(ActionCharacter x) { x.fight(); }
    static void y(CanClimb x) { x.climb(); }
}

public class Test12 {
    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
        y(h);
    }
}
