/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial2;

/**
 *
 * @author Strzelcu
 */
public class Test8 {
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        
        StaticFun.incr();
        
        System.out.println("ST1 = " + st1.i + " A ST2 = " + st2.i);
        
        StaticTest.i++;
        
        System.out.println("ST1 = " + st1.i + " A ST2 = " + st2.i);
    }
}
