/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial6;

import website.strzelecki.excercises.thinkinginjava.debug.AccessModifiers;

/**
 *
 * @author Strzelcu
 */
public class Test5 extends AccessModifiers {
    public static void main(String[] args) {
        AccessModifiers am = new AccessModifiers();
        am.changeAll(); // WORKING PUBLIC
        //am.changeA(); NOT WORKING
        //am.changeB(); NOT WORKING
        //am.changeC(); NOT WORKING
    }
}
