/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Strzelcu
 */
public class test10 {
    public static void main(String[] args) {
        int [] digits = {0,0,0,0};
        
        for(int i = 1001; i < 9999; i++){
            if(i % 100 == 0) continue;
            digits[0] = i / 1000;
            digits[1] = (i % 1000) / 100;
            digits[2] = (i % 100) / 10;
            digits[3] = i%10;
            
            loop:
            for(int d0 = 0; d0<4; d0++) {
                for(int d1 = 0; d1<4; d1++) {
                    for(int d2 = 0; d2<4; d2++) {
                        for(int d3 = 0; d3<4; d3++) {
                            if(d0 != d1 && d2 != d3 && d0 != d2 && d0 != d3 && d1 != d2 && d1 != d3 ) {
                                if(( (digits[d0]*10+digits[d1]) * (digits[d2]*10+digits[d3])) == i) {
                                    System.out.println(i + " = " + (digits[d0]*10+digits[d1]) + " * " +
                                            (digits[d2]*10+digits[d3]));
                                    break loop;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
