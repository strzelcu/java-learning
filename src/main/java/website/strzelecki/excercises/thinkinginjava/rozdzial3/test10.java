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
public class test10 {
    public static void main(String[] args) {
        int one = 0X55;
        int two = 0XAA;
        System.out.println("One = " + Integer.toBinaryString(one));
        System.out.println("Two = " + Integer.toBinaryString(two));
        System.out.println("Two & one = " + Integer.toBinaryString(two&one));
        System.out.println("Two | one = " + Integer.toBinaryString(two|one));
        System.out.println("Two ^ one = " + Integer.toBinaryString(two^one));
        System.out.println("One ^ two = " + Integer.toBinaryString(one^two));
        System.out.println("~One = " + Integer.toBinaryString(~one));
        System.out.println("~Two = " + Integer.toBinaryString(~two));
    }
}
