/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.PrintStream;

/**
 *
 * @author Strzelcu
 */
public class Print {
    
    public static void print(Object obj) {
        System.out.println(obj);
    }
    
    public static void print() {
        System.out.println();
    }
    
    public static void printnb(Object obj) {
        System.out.print(obj);
    }
    
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
