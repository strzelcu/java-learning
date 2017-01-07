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

class Dog {
    
    public void bark() {
        System.out.println("Szczek!");
    }
    
    public void bark(String statement) {
        System.out.println("Auuuuuu! " + statement);
    }
    
    public void bark(int count) {
        for(int i = 1; i < count + 1; i++) {
            System.out.println("Hau hau! Szczek nr " + i);
        }
    }
    
    public void bark(char c) {
        System.out.println("Wof wof! " + c + c + c);
    }
    
    public void bark(float f) {
        System.out.println("Wrrrrr! " + f + " Robodog");
    }
    
}

public class test5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.bark("Wilki bójcie się!");
        d.bark('a');
        d.bark(1.123f);
        d.bark(5);
    }
}