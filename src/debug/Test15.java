/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debug;

import rozdzial7.MuscleCar;

/**
 *
 * @author Strzelcu
 */

class HotRod extends MuscleCar {
    
    public void superShowOff() {
        super.showOff();
    }
}

public class Test15 {
    public static void main(String[] args) {
        HotRod yenko = new HotRod();
        yenko.superShowOff();
    }
}
