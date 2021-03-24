package website.strzelecki.excercises.thinkinginjava.rozdzial9;

interface Man {
    void walk();
    void sleep();
}

interface Soldier {
    void canFight();
    void useWeapon();
}

interface Medic {
    void heal();
    void makeBandage();
}

interface Major extends Man, Soldier, Medic {
    void giveOrders();
}

abstract class StandardMan {

    abstract void drink();

    void eat() {
        System.out.println("eat()");
    }
}

class ManOfWar extends StandardMan implements Major {

    @Override
    public void walk() {
        System.out.println("walk()");
    }

    @Override
    public void sleep() {
        System.out.println("sleep()");
    }

    @Override
    public void canFight() {
        System.out.println("fight()");
    }

    @Override
    public void useWeapon() {
        System.out.println("shot()");
    }

    @Override
    public void heal() {
        System.out.println("heal()");
    }

    @Override
    public void makeBandage() {
        System.out.println("makeBandage()");
    }

    @Override
    public void giveOrders() {
        System.out.println("giveOrders()");
    }

    @Override
    void drink() {
        System.out.println("drink()");
    }
}

public class Excercise14 {

    static void doWhatManHaveToDo(Man man) {
        man.sleep();
        man.walk();
    }

    static void doWhatSoldierHaveToDo(Soldier soldier){
        soldier.canFight();
        soldier.useWeapon();
    }

    static void doWhatMedicHaveToDo(Medic medic) {
        medic.heal();
        medic.makeBandage();
    }

    static void doWhatMajorHaveToDo(Major major){
        major.giveOrders();
    }

    public static void main(String[] args) {
        ManOfWar manOfWar = new ManOfWar();
        doWhatManHaveToDo(manOfWar);
        doWhatSoldierHaveToDo(manOfWar);
        doWhatMedicHaveToDo(manOfWar);
        doWhatMajorHaveToDo(manOfWar);
        StandardMan man = manOfWar;
        man.drink();
    }

}
