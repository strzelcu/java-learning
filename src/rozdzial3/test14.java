/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial3;

/**
 *
 * @author Strzelcu
 */
public class test14 {
    
    boolean f(boolean bl){
        return bl;
    }
    
    public static void main(String[] args) {
        
        test14 test = new test14();
        test.StringCompare("Ania", "Magda");
        test.StringCompare("Magda", "Ania");
        test.StringCompare("Aleksandra", "Aleksandra");
        test.StringCompare("Magda", "Magdalena");
        test.StringCompare("Magdalena", "Magda");

    }
    
    public void StringCompare(String x, String y) {
        //!System.out.println("x > y = " + f(x>y));
        //!System.out.println("x >= y = " + f(x>=y));
        //!System.out.println("x < y = " + f(x<y));
        //!System.out.println("x =< y = " + f(x<=y));
        System.out.println("x == y = " + f(x==y));
        System.out.println("x != y = " + f(x!=y));
        System.out.println("x == y = " + f(x.equals(y)));
        System.out.println("x != y = " + f(!x.equals(y)));
        //!System.out.println("!x = " + f(!x));
        //!System.out.println("x && y = " + f(x&&y));
        //!System.out.println("x || y = " + f(x||y));
    }
}
