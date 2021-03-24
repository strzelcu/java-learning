/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.strzelecki.excercises.thinkinginjava.rozdzial9;

import static website.strzelecki.excercises.thinkinginjava.util.Print.print;

/**
 *
 * @author Strzelcu
 */

abstract class Reward {
    
    static {
        int i = 0;
        int i2 = 2;
    }
    
    abstract void projection(Reward r);
} 

class Oscar extends Reward {
    
    public void receiveReward(String name) {
        print("Nagrodę otrzymuje: " + name);
    }

    @Override
    void projection(Reward r) {
        receiveReward("Nagrodę otrzymuje: " + r.toString());
    }
}

public class Test4 {
    
    public static void main(String[] args) {
        Reward award = new Oscar();
        award.projection(award);
    }
    
}
