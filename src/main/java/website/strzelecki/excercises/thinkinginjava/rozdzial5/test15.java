/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial5;

/**
 *
 * @author Strzelcu
 */

class Motorcycle {
    String name;
    int weight;
    {
        weight = 320;
        name = "Honda";
        System.out.println("Motocykl " + name +" waży " + weight + " kg");
    }    
    
}

public class test15 {
    public static void main(String[] args) {
        Motorcycle honda = new Motorcycle();
    }
}
