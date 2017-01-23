/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial6;

import static util.Print.print;

/**
 *
 * @author Strzelcu
 */

class PrivateFields {
    
    protected int a = 0;
    private int b = 0;
    public int c = 0;
    int d = 0;
}

class ModifyPrivateFields {
    
    PrivateFields pf = new PrivateFields();
       
    public void changeA() {
        pf.a += 1;
    }
    
    /* Nie da się zmienić zmiennej.
    public void changeB() {
        pf.b += 1;
    }*/
    
    public void changeC() {
        pf.c += 1;
    }
    
    public void changeD() {
        pf.d += 1;
    }
    
}


public class Test6 {
    public static void main(String[] args) {
        ModifyPrivateFields mpf = new ModifyPrivateFields();
        
        print("" + mpf.pf.a + " " + mpf.pf.c + " " + mpf.pf.d);
        mpf.changeA();
        mpf.changeC();
        mpf.changeD();
        print("" + mpf.pf.a + " " + mpf.pf.c + " " + mpf.pf.d);
    }
}
