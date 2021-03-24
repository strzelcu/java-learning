/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial5;

/**
 *
 * @author Strzelcu
 */
public class test19 {
    
    public static void main(String[] args) {
        PrintString("Jeden", "Dwa", "Trzy");
        PrintString();
        PrintString(new String[] {"Jeden", "Dwa", "Trzy"});
    }
    
    public static void PrintString(String... args) {
        if(args.length == 0) {
            System.out.println();
        } else {
            for(String s : args) {
                System.out.println(s);
            }
        }
    }
    
}
