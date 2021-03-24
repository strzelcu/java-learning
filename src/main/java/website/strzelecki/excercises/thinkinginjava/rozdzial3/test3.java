/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial3;

/**
 *
 * @author Strzelcu
 */

class Shop {
    float price;
}

public class test3 {
    static void changePrice(Shop price) {
        price.price = 100;
    }
    
    public static void main(String[] args) {
        Shop sklep = new Shop();
        
        sklep.price = 50;
        
        System.out.println("1: sklep.price = " + sklep.price);
        
        changePrice(sklep);
        
        System.out.println("2: sklep.price = " + sklep.price);
    }
}
