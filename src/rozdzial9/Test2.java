/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial9;

import static util.Print.print;

/**
 *
 * @author Strzelcu
 */

abstract class Abstract {
    abstract void abstractOne();
}

public class Test2 {
    public static void main(String[] args) {
        Abstract a = new Abstract() {
            @Override
            void abstractOne() {
                print("Należy zaimplementować metody abstrakcyjne przy tworzeniu obiektów.");
            }
        };
        a.abstractOne();
    }
}
