/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial5;

/**
 *
 * @author Strzelcu
 */

class Castle2 {
    
    Castle2(String s) {
        System.out.println(s);
    }
    
}

public class test18 {
    public static void main(String[] args) {
        Castle2[] castles = new Castle2[20];
        
        for(int i = 0; i < castles.length; i++) {
            castles[i] = new Castle2("Tekst numer " + (i+1));
        }
    }
}