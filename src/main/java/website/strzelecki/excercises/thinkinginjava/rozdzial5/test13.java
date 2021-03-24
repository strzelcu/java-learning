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

class Cup {
	Cup(int marker) {
		System.out.println("Cup(" + marker + ")");
	}
	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups() {
		System.out.println("Cups()");
	}
}

public class test13 {
	public static void main(String[] args) {
		System.out.println("Inside main()");
		Cups.cup1.f(99); // (1)		
	}
	static Cups cups1 = new Cups(); // (2)
	static Cups cups2 = new Cups(); // (2)
        
}