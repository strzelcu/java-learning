/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial9;

/**
 *
 * @author Strzelcu
 */
public class BandPass extends Filter {
    private double lowCutoff, highCutoff;
    BandPass(double lowCut, double highCut) {
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    @Override
    public Waveform process(Waveform input) { return input; }
}
