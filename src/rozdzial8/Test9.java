/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial8;

import static util.Print.print;
import static util.Print.printnb;

/**
 *
 * @author Strzelcu
 */

class Counter {
    private static int refCount = 0;
    public Counter(int count) {
        printnb(count + " ");
        addRef();
    }
    public void addRef() {
        refCount++;
        print("Ilość referencji: " + refCount);}
}



class Rodent {
    
    Counter c = new Counter(1);
    
    public Rodent() {
        print("Rodent konstruktor");
    }
    
    void eat() { print("Rodent.eat()"); }
    void sleep() { print("Rodent.sleep()"); }
    void kill() { print("Rodent.kill()"); }
}

class Hamster extends Rodent {
        
    Counter c = new Counter(2);
    
    public Hamster() {
        print("Hamster konstruktor");
    }
    
    @Override
    void eat() { print("Hamster.eat()"); }
    @Override
    void sleep() { print("Hamster.sleep()"); }
}

class GuineaPig extends Hamster {
        
    Counter c = new Counter(3);
    
    public GuineaPig() {
        print("GuineaPig konstruktor");
    }
    
    @Override
    void eat() { print("GuineaPig.eat()"); }
    @Override
    void kill() { print("GuineaPig.kill()"); }
}

class Squirrel extends GuineaPig {
        
    Counter c = new Counter(4);
    
    public Squirrel() {
        print("Konstruktor Squirrel");
    }
    
    @Override
    void sleep() { print("Squirrel.sleep()"); }
    @Override
    void kill() { print("Squirrel.kill()"); }
}

public class Test9 {
    public static void main(String[] args) {
        Rodent[] rodents = {
            new Squirrel()
        };
        
        for(Rodent r : rodents) {
            r.kill();
            r.eat();
            r.sleep();
            
        }
    }
}
