/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debug;

/**
 *
 * @author Strzelcu
 */
public class Solution {
    protected int solution(int[] A) {
        
        int counter = 0;
        
        for(int n = 0; n < A.length - 2; n++) {
            for (int i = n; i < A.length - 2; i++) {
                if((A[i+1] - A[i]) == (A[i+2] - A[i+1])) {
                    counter++;
                } else {
                    break;
                }
            }
        }
        System.out.println("Tablica ma długość " + A.length + " elementów.");
        System.out.println("Liczba zwrócona to: " + counter);
        System.out.println();
        return counter;
    }
}

