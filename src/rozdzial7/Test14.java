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

class Engine {
    public void start() {}
    public void stop() {}
    public void rev() {}
    public void service() {}
}

class Wheel {
    public void inflate(int psi) {}
}

class Window {
    public void rollup() {}
    public void rolldown() {}
}

class Door {
    public Window window = new Window();
    public void open() {};
    public void close() {};
}

class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
            left = new Door(),
            right = new Door();
    public Car() {
        for(int i = 0; i < 4; i++) {
            wheel[i] = new Wheel();
        }
    }
}

public class Test14 {
    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[2].inflate(75);
        car.engine.service();
    }
}
