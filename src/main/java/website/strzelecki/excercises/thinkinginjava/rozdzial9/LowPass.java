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
public class LowPass extends Filter {
    private double cutoff;
    LowPass(double cutoff) { this.cutoff = cutoff; }
    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
