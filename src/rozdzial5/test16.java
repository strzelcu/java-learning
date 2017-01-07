/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial5;

/**
 *
 * @author Strzelcu
 */
public class test16 {
    public static void main(String[] args) {
        String[] s = new String[20];
        
        for(int i = 0; i < s.length; i++) {
            s[i] = "Tekst numer " + (i+1);
        }
        
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
