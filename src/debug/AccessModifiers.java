/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debug;

import static util.Print.print;

/**
 *
 * @author Strzelcu
 */
public class AccessModifiers {
    public int a = 3;
    protected int b = 4;
    private int c = 5;
    
    public void changeAll() {
        print("Zmienna a = " + a);
        print("Zmienna b = " + b);
        print("Zmienna c = " + c);
        a += 1;
        b += 1;
        c += 1;
        print("Zmienna a po dodaniu 1 = " + a);
        print("Zmienna b po dodaniu 1 = " + b);
        print("Zmienna c po dodaniu 1 = " + c);
    }
    
    void changeA() {
        print("Zmienna a = " + a);
        a += 1;
        print("Zmienna a po dodaniu 1 = " + a);
    }
    
    protected void changeB() {
        print("Zmienna b = " + b);
        b += 1;
        print("Zmienna b po dodaniu 1 = " + b);
    }
    
    private void changeC() {
        print("Zmienna c = " + c);
        c += 1;
        print("Zmienna c po dodaniu 1 = " + c);
    }
    
    
    
    
}
