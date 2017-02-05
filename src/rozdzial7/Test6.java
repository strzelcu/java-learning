/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial7;

import static util.Print.print;

/**
 *
 * @author Strzelcu
 */

class Game {
    Game(int i) {
        print("Konstruktor klasy Game");
    }
}

class BoardGame extends Game {
    BoardGame(int i ) {
        super(i);
        print("Konstruktor klasy Board Game");
    }
}

class Chess extends BoardGame {
    Chess() {
        super(11);
        print("Konstruktor klasy Chess");
    }
}

public class Test6 {
    public static void main(String[] args) {
        Chess c = new Chess();
    }
}
