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
public class HighPass extends Filter {
    HighPass(double cutoff) { }
    @Override
    public Waveform process(Waveform input) { return input; }
}
