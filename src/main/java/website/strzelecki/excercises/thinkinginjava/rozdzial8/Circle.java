/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial8;

import static website.strzelecki.excercises.thinkinginjava.util.Print.print;

/**
 *
 * @author Strzelcu
 */
public class Circle extends Shape{
    @Override
    public void draw() { print("Circle.draw()"); }
    
    public void erase() { print("Circle.erase()"); }
}
