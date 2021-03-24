/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial2;

/**
 *
 * @author Strzelcu
 * <ol>
 * <li> Argument pierwszy to 5 </li>
 * <li> Argument drugi to 10 </li>
 * <li> Argument trzeci to 15 </li>
 * </ol>
 */
public class Test10 {
    public static void main(String[] args) {
        showArguments("5", "10", "15");
    }
    
    public static void showArguments(String one, String two, String three) {
        /**
         * Dodajemy listę html:
         * <li> Argument pierwszy to 5 </li>
         * <li> Argument drugi to 10 </li>
         * <li> Argument trzeci to 15 </li>
        */
        System.out.println("Argument pierwszy to: " + one);
        System.out.println("Argument drugi to: " + two);
        System.out.println("Argument trzeci to: " + three);
    }
}
