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
public class test12 {
    public static void main(String[] args) {
        int one = 0XFF;
        System.out.println("One = " + Integer.toBinaryString(one));
        one <<= 1;
        System.out.println("One <<= " + Integer.toBinaryString(one));
        for(int i = 0; i < 9; i++) {
            one >>>= 1;
            System.out.println("One >>>= " + Integer.toBinaryString(one));
        }
    }
}
