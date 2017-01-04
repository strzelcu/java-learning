/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial4;

/**
 *
 * @author Strzelcu
 */
public class test5 {
    public static void main(String[] args) {
        int one = 0X55;
        int two = 0XAA;
        System.out.println("One = " + printBinary(one));
        System.out.println("Two = " + printBinary(two));
        System.out.println("Two & one = " + printBinary(two&one));
        System.out.println("Two | one = " + printBinary(two|one));
        System.out.println("Two ^ one = " + printBinary(two^one));
        System.out.println("One ^ two = " + printBinary(one^two));
        System.out.println("~One = " + printBinary(~one));
        System.out.println("~Two = " + printBinary(~two));
    }
    
    public static String printBinary(int binary) {
        StringBuilder sb = new StringBuilder();
        
        if(binary == 0) return "0";
        else {
            int nlz = Integer.numberOfLeadingZeros(binary);
            binary <<= nlz;
            for(int i = 0; i < 32 - nlz; i++) {
                int n = (Integer.numberOfLeadingZeros(binary) == 0) ? 1 : 0;
                sb.append(n);
                binary <<= 1;
            }
        }
        return sb.toString();
    }
}
