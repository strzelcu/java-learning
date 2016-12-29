/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial3;

/**
 *
 * @author Strzelcu
 */
public class test13 {
    public static void main(String[] args) {
        char ch;
        ch = 'A';
        System.out.println("Ch = " + ch);
        System.out.println("Ch(binary) = " + Integer.toBinaryString(ch));
        for(int i = 0; i < 60; i++) {
            ch += 1;
            System.out.println("Ch = " + ch);
            System.out.println("Ch(binary) = " + Integer.toBinaryString(ch));
        }
    }
}
