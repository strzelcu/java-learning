/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial9;

/**
 *
 * @author Strzelcu
 */

abstract class Printer {    
    
    public Printer() {
        print(5);
    }
    
    abstract void print(int pages);
}

class XeroxPrinter extends Printer {
    
    int numberOfPages = 10;

    @Override
    void print(int pages) {
        this.numberOfPages = pages;
        System.out.println("Pages: " + this.numberOfPages);
    }
    
}

public class Test3 {
    public static void main(String[] args) {
        XeroxPrinter printer = new XeroxPrinter();
        printer.print(15);
    }
}
