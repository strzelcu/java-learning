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
public class Test11 {
    public static void main(String[] args) {
        WszystkieKoloryTeczy kolory = new WszystkieKoloryTeczy(5);
        kolory.dodajOdcienKoloru(123);
        kolory.dodajOdcienKoloru(456);
        kolory.dodajOdcienKoloru(789);
        kolory.dodajOdcienKoloru(101);
        kolory.dodajOdcienKoloru(111);
        
        kolory.wyswietlWszystkieOdcienie();
        
        kolory.zmienOdcienKoloru(123, 666);
        
        kolory.wyswietlWszystkieOdcienie();
    
    }
}
