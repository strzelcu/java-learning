/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial2;

/**
 *
 * @author Strzelcu
 */
public class Test10 {
    public static void main(String[] args) {
        showArguments("5", "10", "15");
    }
    
    public static void showArguments(String one, String two, String three) {
        System.out.println("Argument pierwszy to: " + one);
        System.out.println("Argument drugi to: " + two);
        System.out.println("Argument trzeci to: " + three);
    }
}
