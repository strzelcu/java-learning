/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial4;

/**
 *
 * @author Strzelcu
 */
public class test6 {
    
    static int test(int testval, int target, int begin, int end) {
        if(testval >= begin && testval <= end) {
            if(testval > target) return +1;
            if(testval < target) return -1;
            else return 0;
        } else {
            System.out.print("Zła wartość dla zakresu od " + begin + " do " + end + " to: ");
            return testval;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(test(5,10,0,6));
        System.out.println(test(5,10,30,40));
        System.out.println(test(10,5,8,40));
        System.out.println(test(5,5,10,40));
    }
}
