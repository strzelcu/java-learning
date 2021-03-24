/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.util;

/**
 *
 * @author Strzelcu
 */
public class Range {
    
    public static int[] range(int n) {
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }
    
    public static int[] range(int start, int end) {
        int sz = end - start;
        int[] result = new int[sz];
        for(int i = 0; i < sz; i++) {
            result[i] = start + i;
        }
        return result;
    }
    
    public static int[] range(int start, int end, int step) {
        int sz = (end - start) / step;
        int[] result = new int[sz];
        for(int i = 0; i < sz; i++) {
            result[i] = start + (i * step);
        }
        return result;
    }
}
