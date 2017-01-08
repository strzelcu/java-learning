/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial5;

/**
 *
 * @author Strzelcu
 */

public class test22 {
    public static void main(String[] args) {
        Banknote 
                
                ten = new Banknote(Nominal.DZIESIEC_ZLOTYCH),
                twenty = new Banknote(Nominal.DWADZIESCIA_ZLOTYCH),
                fifty = new Banknote(Nominal.PIECDZIESIAT_ZLOTYCH),
                hundred = new Banknote(Nominal.STO_ZLOTYCH),
                twoHundred = new Banknote(Nominal.DWIESCIE_ZLOTYCH),
                fiveHundred = new Banknote(Nominal.PIECSET_ZLOTYCH);
        
        ten.Describe();
        twenty.Describe();
        fifty.Describe();
        hundred.Describe();
        twoHundred.Describe();
        fiveHundred.Describe();
        
    }
}
