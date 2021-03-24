/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial2;

import java.util.ArrayList;

/**
 *
 * @author Strzelcu
 */
public class WszystkieKoloryTeczy {
    int liczbaCalkowitaKolorow;
    ArrayList koloryTeczy;
    
    public WszystkieKoloryTeczy(int liczba) {
        this.liczbaCalkowitaKolorow = liczba;
        this.koloryTeczy = new ArrayList(liczba);
    }
    
    void zmienOdcienKoloru(int staryOdcien, int nowyOdcien) {
        koloryTeczy.set(koloryTeczy.indexOf(staryOdcien), nowyOdcien);
    }
    
    void dodajOdcienKoloru(int nowyOdcien) {
        koloryTeczy.add(nowyOdcien);
    }
    
    void wyswietlWszystkieOdcienie() {
        for(int i = 0; i < koloryTeczy.size(); i++) {
            System.out.println("Odcien koloru nr " + (i+1) + " wynosi " + koloryTeczy.get(i));
        }
    }
}
