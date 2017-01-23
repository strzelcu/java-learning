/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial6;

import access.local.PackagedClass;

/**
 *
 * @author Strzelcu
 */
public class Test9 {
    public static void main(String[] args) {
        PackagedClass pc = new PackagedClass();
    }
}
/**
 * Klasa PackagedClass jest domyślnie z pakietowym modyfikatorem dostępu.
 * Jest zatem dostępna tylko w obrębie pakietu w którym się znajduje.
 * Aby z niej skorzystać należy dodać import w postaci:
 * import access.local.PackagedClass;
 */
