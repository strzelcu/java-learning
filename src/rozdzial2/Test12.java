/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial2;
import java.util.*;

/** Pierwszy program przykładowy z "Thinking in Java"
 * Wyświetla ciąg i dzisiejsza datę
 * @author Tomasz Strzelecki
 * @author http://tomaszstrzelecki.com.pl
 * @version 1.0
 */
public class Test12 {
    /** Punkt wejścia do klasy i aplikacji
     * @param args tablica ciągów argumentów wywołania
     * @throws exceptions nie zgłasza wyjątków
     */
    public static void main(String[] args) {
        System.out.println("Witaj. Dzisiaj jest: ");
        System.out.println(new Date());
    }
    
}
/* Output: (55% match)
Witaj, disiaj jest:
Mon Dec 12 21:56:42 CET 2016
*/
