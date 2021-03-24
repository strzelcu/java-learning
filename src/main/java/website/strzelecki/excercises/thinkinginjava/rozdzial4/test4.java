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
public class test4 {
    public static void main(String[] args) {
        
        int range = 100;
        boolean condition;
        
        for(int i = 1; i < range + 1; i++) {
            
            condition = true;
            
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    condition = false;
                }
            }
            
            if(condition) {
                System.out.println(i + " jest liczbą pierwszą");
            }
        }
    }
}
