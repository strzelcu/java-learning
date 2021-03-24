/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial4;

import java.util.Scanner;

/**
 *
 * @author Strzelcu
 */
public class test9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wpisz długość ciągu Fibonacciego jaką chcesz zobaczyć: ");
        int choice = Integer.parseInt(input.nextLine());
        System.out.print("1, ");
        for(int i = 0, a = 1, b = 1, c = 1; i < choice-1; i++) {
            System.out.print( c + ", ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
