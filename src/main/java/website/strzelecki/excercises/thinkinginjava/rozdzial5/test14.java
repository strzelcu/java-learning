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

class Foto {
    static String fotografia1 = "Fotografia Ślubna";
    static String fotografia2;
    
    static {
        fotografia2 = "Fotografia rodzinna";
    }
    
    public static void print() {
        System.out.println("Fotografia1 = " + fotografia1);
        System.out.println("Fotografia2 = " + fotografia2);
    }
    
}

public class test14 {
    public static void main(String[] args) {
        Foto.print();
    }
}
