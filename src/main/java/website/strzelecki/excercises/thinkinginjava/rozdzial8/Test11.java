/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial8;

import static website.strzelecki.excercises.thinkinginjava.util.Print.print;

/**
 *
 * @author Strzelcu
 */

interface FastFood {
    void order();
}

class Meal {
    Meal() {
        print("Meal()");
    }
}

class Bread {
    Bread() {
        print("Bread()");
    }
}

class Cheese {
    Cheese() {
        print("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        print("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        print("Lunch()");
    }
}

class Pickle {
    Pickle() {
        print("Pickle()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        print("PortableLunch()");
    }
}

class Sandwich extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();
    public Sandwich() {
        print("Sandwich()");
    }
    
    @Override
    public void order() {
        print("Sandwich.order()");
    }
}

public class Test11 {
    public static void main(String[] args) {
        new Sandwich().order();
    }
}
