/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial9;

import rozdzial8.Note;
import static util.Print.print;

abstract class Instrument {
    int Value = 5;
    abstract void adjust();
}

interface Playable {
    void play(Note n);
}

class Wind extends Instrument implements Playable {
    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    @Override
    public String toString() { return "Wind"; }
    @Override
    public void adjust() { print(this + ".adjust()"); }
}

class Percussion extends Instrument implements Playable{
    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    @Override
    public String toString() { return "Percussion"; }
    @Override
    public void adjust() { print(this + ".adjust()"); }
}

class Stringed extends Instrument implements Playable{
    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    @Override
    public String toString() { return "Stringed"; }

    @Override
    public void adjust() { print(this + ".adjust()"); }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public String toString() { return "Woodwind"; }
}

public class Test9 {
    static void tune(Playable i) {
        i.play(Note.B_FLAT);
    }
    static void tuneAll(Playable[] e) {
        for(Playable i : e) tune(i);
    }
    
    public static void main(String[] args) {
        Playable[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
        };
        tuneAll(orchestra);
    }
}