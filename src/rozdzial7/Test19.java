/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial7;

import static util.Print.print;

/**
 *
 * @author Strzelcu
 */
public class Test19 {
    
    public final int MAKE_ME;
    
    public Test19() {
        MAKE_ME = 1;
        print(MAKE_ME);
    }
    
    public Test19(int parameter) {
        MAKE_ME = parameter;
        print(MAKE_ME);
    }
    
    public static void main(String[] args) {
        Test19 test = new Test19();
        // test.MAKE_ME = 2; Nie da rady
        Test19 test2 = new Test19(5);
    }
}
