/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial2;

/**
 *
 * @author Strzelcu
 */
public class Test9 {
    
    public static void main(String[] args) {
        
        boolean bool = true;
        char znak = 'A';
        byte bajt = 0x8;
        short krotki = 16;
        int i = 10;
        long l = 32000;
        float f = 1.5f;
        double d = 123.2512;
        
        Boolean torf = bool;
        Character ch = znak;
        Byte b = bajt;
        Short s = krotki;
        Integer integer = i;
        Long lon = l;
        Float flo = f;
        Double doub = d;
        
        System.out.println(torf.booleanValue());
        System.out.println(ch.charValue());
        System.out.println(b.byteValue());
        System.out.println(s.shortValue());
        System.out.println(integer.intValue());
        System.out.println(lon.longValue());
        System.out.println(flo.floatValue());
        System.out.println(doub.doubleValue());
        
    }
}
