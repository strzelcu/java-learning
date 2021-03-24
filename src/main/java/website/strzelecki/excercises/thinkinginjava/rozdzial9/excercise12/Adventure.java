package website.strzelecki.excercises.thinkinginjava.rozdzial9.excercise12;

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}

interface Soldier extends CanClimb, CanSwim, CanFight {
    void walk();
}

class ActionCharacter {
    public void fight() {
        System.out.println("fight()");
    }
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim, Soldier {

    @Override
    public void swim() {
        System.out.println("swim()");
    }

    @Override
    public void fly() {
        System.out.println("fly()");
    }

    @Override
    public void climb() {
        System.out.println("climb()");
    }

    @Override
    public void walk() {
        System.out.println("walk()");
    }
}

public class Adventure {
    public static void t(CanFight x) { x.fight(); }
    public static void u(CanSwim x) { x.swim(); }
    public static void v(CanFly x) { x.fly(); }
    public static void w(ActionCharacter x) { x.fight(); }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}
