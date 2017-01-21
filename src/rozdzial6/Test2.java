/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial6;


/**
 *
 * @author Strzelcu
 * Dopiero w tej chwili zrozumiałem, że nie piszę nazw klas według konwencji.
 */
class Print {

}


public class Test2 {
    
    public static void main(String[] args) {
        util.Print.print("Sprawdzamy czy działa");
    }
    
    public static void print(Object obj) {
        System.out.println(obj);
    }
}
