/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial4;

/**
 *
 * @author Strzelcu
 */
public class test7 {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            if(i == 99) break;
            System.out.println("Wynik: " + (i+1));
        }
        
        for(int i = 0; i < 100; i++) {
            if(i == 99) return;
            System.out.println("Wynik: " + (i+1));
        }
    }
}