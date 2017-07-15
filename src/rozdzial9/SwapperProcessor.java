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
public class SwapperProcessor implements Processor {
    
    private Swapper s;
    
    SwapperProcessor(Swapper s) {
        this.s = s;
    }

    @Override
    public String name() {
        return s.getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return s.swapCharacters((String) input);
    }
    
}
