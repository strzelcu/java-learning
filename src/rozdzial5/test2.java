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

class TestTwo {
    
    String s1;
    String s2;
    String s3 = "Test3";
    String s4;
    
    public TestTwo() {
        s4 = "Test4";
    }
}

public class test2 {
    public static void main(String[] args) {
        TestTwo t1 = new TestTwo();
        System.out.println("T1 = " + t1.s1);
        System.out.println("T2 = " + t1.s2);
        System.out.println("T3 = " + t1.s3);
        System.out.println("T4 = " + t1.s4);
    }
}