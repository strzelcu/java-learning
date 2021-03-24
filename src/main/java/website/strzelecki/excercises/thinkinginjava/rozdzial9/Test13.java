/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial9;

/**
 *
 * @author Strzelcu
 */

interface Ranger {
    void requestMegazord();
}

interface PowerRanger extends Ranger {
    void transformation();
}

interface BlueRanger extends PowerRanger {
    
}

interface GreenRanger extends Ranger {
    
}

public class Test13 {
    
}
