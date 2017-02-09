/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial8;

import static util.Print.print;

/**
 *
 * @author Strzelcu
 */

class Glyph {
    void draw() { print("Glyph.draw()"); }
    Glyph() {
        print("Glyph() przed draw()");
        draw();
        print("Glyph() po draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph().radius = " + radius);
    }
    @Override
    void draw() {
        print("RoundGlyph.draw().radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int radius = 30;
    RectangularGlyph(int r) {
        radius = r;
        print("RectangularGlyph().radius = " + radius);
    }
    @Override
    void draw() {
        print("RectangularGlyph().radius = " + radius);
    }
}

public class Test15 {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(35);
    }
}
