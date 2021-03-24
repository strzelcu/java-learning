/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial8;

import java.util.Random;
import static website.strzelecki.excercises.thinkinginjava.util.Print.print;

/**
 *
 * @author Strzelcu
 */

class Instrument {
    void play(Note n) { print("Instrument.play() " + n); }
    String what() { return "Instrument"; }
    void adjust() { print("Strojenie obiektu Instrument"); }
    @Override
    public String toString() {
        return what();
    }
}

class Wind extends Instrument {
    @Override
    void play(Note n) { print("Wind.play() " + n); }
    @Override
    String what() { return "Wind"; }
    @Override
    void adjust() { print("Strojenie obiektu Wind"); }
}

class Percussion extends Instrument {
    @Override
    void play(Note n) { print("Percussion.play() " + n); }
    @Override
    String what() { return "Percussion"; }
    @Override
    void adjust() { print("Strojenie obiektu Wind"); }
}

class Stringed extends Instrument {
    @Override
    void play(Note n) { print("Stringed.play() " + n); }
    @Override
    String what() { return "Stringed"; }
    @Override
    void adjust() { print("Strojenie obiektru Stringed"); }
}

class Brass extends Wind {
    @Override
    void play(Note n) { print("Brass.play() " + n); }
    @Override
    void adjust() { print("Strojenie obiektu Brass"); }
}

class Woodwind extends Wind {
    @Override
    void play(Note n) { print("Woodwind.play() " + n); }
    @Override
    String what() { return "Woodwind"; }
}

class Guitar extends Stringed {
    @Override
    void play(Note n) { print("Guitar.play() " + n); }
    @Override
    String what() { return "Guitar"; }
    @Override
    void adjust() { print("Strojenie obiektu Guitar"); }
}

class RandomInstrumentGenerator {
    private Random rand = new Random(47);
    
    public Instrument next() {
        switch(rand.nextInt(6)) {
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Brass();
            case 3: return new Woodwind();
            case 4: return new Guitar();
            case 5: return new Stringed();
            default: return new Instrument();
        }
    }
}


public class Test6 {
    
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e) {
            tune(i);
        }
    }
    
    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[5];
        RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
        
        for(int i = 0; i < orchestra.length; i++) {
            orchestra[i] = gen.next();
        }
        
        tuneAll(orchestra);
        
        for(Instrument i : orchestra) {
            System.out.println(i);
        }
    }
}
