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
class Test1 {
    String s;
}

public class test1 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.s);
    }
}
/** Nie można wyświetlić niezainicjalizowanej zmiennej w klasie.
 * Można utworzyć obiekt, który posiada zmienną i następnie 
 * wyświetlić tą zmienną poprzez odwołanie do obiektu.
 **/
