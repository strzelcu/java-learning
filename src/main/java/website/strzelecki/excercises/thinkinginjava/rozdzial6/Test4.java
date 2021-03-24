/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial6;

import website.strzelecki.excercises.thinkinginjava.debug.Solution;

/**
 *
 * @author Strzelcu
 */

public class Test4 {
    public static void main(String[] args) {
        Solution s = new Solution();
        ProtectedSolution ps = new ProtectedSolution();
        int[] a = {1,3,5,7,9};
        //s.solution(a);
        ps.getResult(a);
        int[] b = {-1,1,3,3,3,2,1,0};
        //s.solution(b);
        ps.getResult(b);
        int[] c = {7,7,7,7,7,7,7};
        //s.solution(c);
        ps.getResult(c);
    }
}
