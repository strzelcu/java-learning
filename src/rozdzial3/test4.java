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
public class test4 {
    public static void main(String[] args) {
        int v;
        int range = 1000; // meters
        int time = 120; // seconds
        
        v = range/time; // meters per second
        
        System.out.println("Prędkość wynosi: " + v + " m/s");
        
        v*=3.6;
        
        System.out.println("Predkość wynosi: " + v + " km/h");
    }
}
