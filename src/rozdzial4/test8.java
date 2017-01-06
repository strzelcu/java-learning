/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial4;

import java.util.Scanner;

/**
 *
 * @author Strzelcu
 */
public class test8 {
    public static void main(String[] args) {
        System.out.println("Wpisz dużą literę aby sprawdzić czy jest samogłoską (0 kończy program): ");
        Scanner input = new Scanner(System.in);
        for(;;) {
            int c = 0;
            c = (int) input.nextLine().charAt(0);
            if (c == '0') return;
            if (c >= 'a' && c<= 'z') {
            System.out.print((char) c + ", " + c + ", ");
                switch(c) {
                    case 'a' :
                    case 'b' :
                    case 'i' :
                    case 'o' :
                    case 'u' : System.out.println("samogłoska;"); break;
                    case 'y' :
                    case 'w' : System.out.println("czasem samogłoska"); break;
                    default : System.out.println("spółgłoska");
                }
            }
        }
    }
}
