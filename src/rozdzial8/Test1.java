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

class Cycle {
    public void ride() {
        print("Cycle.ride()");
    }
    
    public int wheels(int wheels) {
        return wheels;
    }
}

class Unicycle extends Cycle {
    @Override
    public void ride() {
        print("Unicycle.ride() " + this.wheels(1));
    }
    public void balance() {
        print("Unicycle.balance()");
    }
}

class Bicycle extends Cycle {
    @Override
    public void ride() {
        print("Bicycle.ride() " + this.wheels(2));
    }
    public void balance() {
        print("Bicycle.balance()");
    }
}

class Tricycle extends Cycle {
    @Override
    public void ride() {
        print("Tricycle.ride() " + this.wheels(3));
    }
}

public class Test1 {
    
    public static void getBike(Cycle cycle) {
        cycle.ride();
    }
    
    public static void main(String[] args) {
        getBike(new Unicycle());
        getBike(new Bicycle());
        getBike(new Tricycle());
        
        Unicycle uc = new Unicycle();
        Bicycle bc = new Bicycle();
        Tricycle tc = new Tricycle();
        
        Cycle[] cycles = {
            uc, bc, tc
        };
        
        cycles[0].ride();
        cycles[0].wheels(1);
        // cycles[0].balance();
        cycles[1].ride();
        cycles[1].wheels(2);
        // cycles[1].balance();
        cycles[2].ride();
        cycles[2].wheels(3);
        // cycles[2].balance();
        
        Unicycle[] unicycles = {
            uc
                //, bc
                //, tc
        };
        
        unicycles[0].balance();
        
        
    }
    
}
