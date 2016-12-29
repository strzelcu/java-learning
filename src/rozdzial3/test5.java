/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial3;

/**
 *
 * @author Strzelcu
 */
class Dog {
    String name;
    String voice;
    
    public Dog(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }
    
    public void says() {
        System.out.println(voice);
    }
}

public class test5 {
    public static void main(String[] args) {
        Dog reksio = new Dog("Reksio", "Hau! Hau!");
        Dog doberman = new Dog("Rzeźnik", "WrrrrRRR!");
        Dog burek = reksio;
        
        System.out.println(reksio.name);
        reksio.says();
        System.out.println(doberman.name);
        doberman.says();
        
        System.out.println(reksio == doberman);
        System.out.println(reksio != doberman);
        
        System.out.println(reksio == burek);
        System.out.println(reksio != burek);
        
        System.out.println(burek == doberman);
        System.out.println(burek != doberman);
        
        System.out.println(reksio.equals(doberman));
        System.out.println(reksio.equals(burek));
        
        System.out.println(burek.equals(reksio));
        System.out.println(burek.equals(doberman));
        
        System.out.println(doberman.equals(reksio));
        System.out.println(doberman.equals(burek));
        
    }
}
