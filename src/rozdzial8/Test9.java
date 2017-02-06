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

class Rodent {
    void eat() { print("Rodent.eat()"); }
    void sleep() { print("Rodent.sleep()"); }
    void kill() { print("Rodent.kill()"); }
}

class Hamster extends Rodent {
    @Override
    void eat() { print("Hamster.eat()"); }
    @Override
    void sleep() { print("Hamster.sleep()"); }
}

class GuineaPig extends Rodent {
    @Override
    void eat() { print("GuineaPig.eat()"); }
    @Override
    void kill() { print("GuineaPig.kill()"); }
}

class Squirrel extends Rodent {
    @Override
    void sleep() { print("Squirrel.sleep()"); }
    @Override
    void kill() { print("Squirrel.kill()"); }
}

public class Test9 {
    public static void main(String[] args) {
        Rodent[] rodents = {
            new Hamster(),
            new GuineaPig(),
            new Squirrel()
        };
        
        for(Rodent r : rodents) {
            r.kill();
            r.eat();
            r.sleep();
        }
    }
}
