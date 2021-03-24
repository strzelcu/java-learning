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

class Television extends Cartoon {
    public Television() {
        print("Konstruktor klasy Television");
    }
}

public class Test4 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Television TV = new Television();
        }
    }
}
