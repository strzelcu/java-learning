/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial8;

import java.util.logging.Level;
import java.util.logging.Logger;
import static util.Print.print;

/**
 *
 * @author Strzelcu
 */

class Shared {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        print("Tworzenie " + this);
    }
    public void addRef() { refCount++; }
    protected void dispose() {
            finalize();
    }
    @Override
    public void finalize() {
        if (--refCount == 0) {
            try {
                super.finalize();
                print("Usuwanie " + this);
            } catch (Throwable ex) {
                Logger.getLogger(Shared.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    @Override
    public String toString() { return "Shared " + id; }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        print("Tworzenie " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        try {
            finalize();
            shared.dispose();
        } catch (Throwable ex) {
            Logger.getLogger(Composing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void finalize() throws Throwable {
        super.finalize();
        print("Usuwanie " + this);
    }
    @Override
    public String toString() { return "Composing " + id; }
}

public class Test13 {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared)
        };
        for(Composing c : composing) {
            c.dispose();
        }
    }
}
