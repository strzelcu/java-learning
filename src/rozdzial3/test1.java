/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial3;

import java.util.Date;
import static sun.misc.Version.print;

/**
 *
 * @author Strzelcu
 */
public class test1 {
    public static void main(String[] args) {
        print("Witaj, dzisiaj jest: ");
        print("" + new Date());
        
    }

    private static void print(String tekst) {
        System.out.println(tekst);
    }
}
