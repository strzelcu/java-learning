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

class Car {
    
    boolean washed;
    
    public void wash(){
        System.out.println("Rozpoczynam czyszczenie pojazdu...");
        useBrush();
        this.useBrush();
        System.out.println("Pojazd wyczyszczony.");
        this.washed = true;
    }
    
    public void useBrush() {
        System.out.println("Czyszczę szczotką");
    }
    
}

public class test8 {
    public static void main(String[] args) {
        Car car = new Car();
        car.wash();
    }
}
