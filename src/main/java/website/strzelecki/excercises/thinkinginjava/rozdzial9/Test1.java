/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial9;

import static website.strzelecki.excercises.thinkinginjava.util.Print.print;

/**
 *
 * @author Strzelcu
 */
class Counter {
    private static int refCount = 0;
    public Counter() {
        addRef();
    }
    public void addRef() {
        refCount++;
        print("Ilość referencji: " + refCount);}
}

class Hamster implements Rodent {
    
    Counter c = new Counter();
    
    public Hamster() {
        print("Hamster konstruktor");
    }
    
    @Override
    public void eat() { print("Hamster.eat()"); }
    @Override
    public void sleep() { print("Hamster.sleep()"); }
    @Override
    public void kill() { print("Hamster.kill()"); }
}

class GuineaPig implements Rodent {
    
    Counter c = new Counter();
        
    public GuineaPig() {
        print("GuineaPig konstruktor");
    }
    
    @Override
    public void eat() { print("GuineaPig.eat()"); }
    @Override
    public void kill() { print("GuineaPig.kill()"); }
    @Override
    public void sleep() { print("GuineaPig.sleep()"); }
}

class Squirrel implements Rodent {
    
    Counter c = new Counter();
        
    public Squirrel() {
        print("Squirrel Konstruktor");
    }
    
    @Override
    public void sleep() { print("Squirrel.sleep()"); }
    @Override
    public void kill() { print("Squirrel.kill()"); }
    @Override
    public void eat() { print("Squirrel.eat()"); }
}

public class Test1 {
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
