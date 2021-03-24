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
public class Test2 {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    
    public static void main(String[] args) {
        Shape[] s = new Shape[12];
        
        for(int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        
        for(Shape shp : s) {
            shp.draw();
        }
        
        print("");
        
        for(Shape shp : s) {
            shp.erase();
        }
        
        print("");
        
        for(Shape shp : s) {
            shp.hide();
        }
    }
}
