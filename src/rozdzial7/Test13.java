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

class Machine {
    
    public void start() {
        print("Machine has started");
    }
    
    public void start(int delay) {
        print("Machine has started with " + delay + " minutes delay");
    }
    
    public void start(float weight) {
        print("Machine has started with " + weight + " kilograms underweight");
    }
}

class ElectricMachine extends Machine {
    
    public void start(boolean condition) {
        print("Machine has started and condition is " + condition);
    }
}

public class Test13 {
    public static void main(String[] args) {
        ElectricMachine em = new ElectricMachine();
        em.start();
        em.start(20);
        em.start(20.20f);
        em.start(true);
    }
}
