/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial3;

/**
 *
 * @author Strzelcu
 */
public class test11 {
    public static void main(String[] args) {
        int one = 0X55;
        System.out.println("One = " + Integer.toBinaryString(one));
        for(int i = 0; i < 7; i++) {
            one >>= 1;
            System.out.println("One >>= " + Integer.toBinaryString(one));
        }
    }
}
