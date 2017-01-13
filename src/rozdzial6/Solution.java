/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial6;

/**
 *
 * @author Strzelcu
 */
public class Solution {
    public int solution(int[] A) {
        
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
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {1,3,5,7,9};
        s.solution(a);
        int[] b = {-1,1,3,3,3,2,1,0};
        s.solution(b);
        int[] c = {7,7,7,7,7,7,7};
        s.solution(c);
    }
}

