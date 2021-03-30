package website.strzelecki.excercises.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * The new "Avengers" movie has just been released!
 *
 * There are a lot of people at the cinema box office standing in a huge line.
 * Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket
 * costs 25 dollars.
 *
 * Vasya is currently working as a clerk. He wants to sell a ticket to every
 * single person in this line.
 *
 * Can Vasya sell a ticket to every person and give change if he initially
 * has no money and sells the tickets strictly in the order people queue?
 *
 * Return YES, if Vasya can sell a ticket to every person and give change
 * with the bills he has at hand at that moment. Otherwise return NO.
 *
 * Examples:
 *
 * Line.Tickets(new int[] {25, 25, 50}) //
 *      => YES
 * Line.Tickets(new int[] {25, 100}) //
 *      => NO. Vasya will not have enough money to give change to 100 dollars
 * Line.Tickets(new int[] {25, 25, 50, 50, 100}) //
 *      => NO. Vasya will not have the right bills to give 75 dollars of
 *         change (you can't make two bills of 25 from one of 50)
 *
 */
public class Line {

    private static final int BILL_PRICE = 25;

    public static String Tickets(int[] peopleInLine) {

        List<Integer> cashRegister = new ArrayList<>();
        try {
            for (int personCash : peopleInLine) {
                sellTicket(personCash, cashRegister);
            }
        } catch (IllegalStateException e) {
            return "NO";
        }
        return "YES";
    }

    public static void sellTicket(Integer personCash, List<Integer> cashRegister) throws IllegalStateException {
        int change = personCash - BILL_PRICE;
        while (change != 0) {
            if (change / 100 > 0 && cashRegister.stream().anyMatch(integer -> integer == 100)) {
                change -= 100;
                cashRegister.stream().filter(integer -> integer == 100).findFirst().map(cashRegister::remove).orElseThrow(IllegalStateException::new);
                continue;
            }
            if (change / 50 > 0 && cashRegister.contains(50)) {
                change -= 50;
                cashRegister.stream().filter(integer -> integer == 50).findFirst().map(cashRegister::remove).orElseThrow(IllegalStateException::new);
                continue;
            }
            if (change / 25 > 0 && cashRegister.contains(25)) {
                change -= 25;
                cashRegister.stream().filter(integer -> integer == 25).findFirst().map(cashRegister::remove).orElseThrow(IllegalStateException::new);
                continue;
            }
            throw new IllegalStateException();
        }
        cashRegister.add(personCash);
    }

}
