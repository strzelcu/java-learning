/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial7;

import static website.strzelecki.excercises.thinkinginjava.util.Print.print;
import static website.strzelecki.excercises.thinkinginjava.util.Print.printnb;

/**
 *
 * @author Strzelcu
 */

class Amphibian {
    
    public void Chortle() {
        print("Amphibian chortling");
    }
    
    static void walkAndChortle(Amphibian amp) {
        printnb(amp.toString() + " ");
        amp.Chortle();
    }
}

class Frog extends Amphibian{
    
    @Override
    public void Chortle() {
        print("CHORTLING!");
    }
    
    public void walkAndChortle(Frog frog) {
        print("Walking and CHORTLING!");
    }
    
}

public class Test16 {
    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian.walkAndChortle(frog);
        frog.Chortle();
        frog.walkAndChortle(frog);
    }
}
