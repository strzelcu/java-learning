/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial3;

import java.util.Random;

/**
 *
 * @author Strzelcu
 */
public class test7 {
    public static void main(String[] args) {
        Random rand = new Random();
        Boolean bool = rand.nextBoolean();
        
        if(bool == true) {
            System.out.println("Przy rzucie monetą wypadła reszka ");
        } else {
            System.out.println("Przy rzucie monetą wypadł orzeł ");
        }
        
    }
}
