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

class Cleanser {
    public String s = "Cleanser";
    
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    @Override
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        print(x);
    }
    
}

class Detergent extends Cleanser {
    
    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }
    
    public void foam() { append(" foam()"); }
    
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Test klasy bazowej");
        Cleanser.main(args);
    }
}

class DetergentDelegation {
    
    Cleanser c;
    
    public DetergentDelegation() {
        c = new Cleanser();
    }
    
    public void dilute() {
        c.dilute();
    }
    
    public void apply() {
        c.apply();
    }
    
    public void scrub() {
        c.scrub();
    }
    
    public void foam() { c.append(" foam()"); }
    
    public void append(String s) {
        c.append(s);
    }
    
    public String getString() {
        return c.toString();
    }
    
}

class ExpensiveDetergent extends DetergentDelegation {
    
    public void scrub() {
        append(" ExpensiveDetergent.scrub()");
    }
    
    public void sterilize() {
        append(" sterilize()");
    }
}

public class Test2 {
    public static void main(String[] args) {
        ExpensiveDetergent d = new ExpensiveDetergent();
        d.dilute(); d.apply(); d.scrub(); d.foam(); d.sterilize();
        print(d.getString());
    }
}
