/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial9;

import access.Interfejs;
import static util.Print.print;

/**
 *
 * @author Strzelcu
 */

class Methods implements Interfejs {

    @Override
    public void methodOne() {
        print("Methods.methodOne()");
    }

    @Override
    public void methodTwo(int clasifier) {
        print("Methods.methodTwo() (clasifier = " + clasifier + ")");
    }

    @Override
    public void methodThree(String message) {
        print("Methods.methodThree(" + message + ")");
    }
    
}

public class Test5 {
    public static void main(String[] args) {
        Methods m = new Methods();
        m.methodOne();
        m.methodTwo(10);
        m.methodThree("First Message");
    }
}
