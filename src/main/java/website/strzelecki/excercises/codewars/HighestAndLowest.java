package website.strzelecki.excercises.codewars;

/**
 * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 *
 * Example:
 *
 * highAndLow("1 2 3 4 5")  // return "5 1"
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 *
 * Notes:
 *
 *     All numbers are valid Int32, no need to validate them.
 *     There will always be at least one number in the input string.
 *     Output string must be two numbers separated by a single space, and highest number is first.
 *
 * Simplest solution:
 *
 *         int min = Arrays.stream(numbers.split(" "))
 *                         .mapToInt(i -> Integer.parseInt(i))
 *                         .min()
 *                         .getAsInt();
 *
 *         int max = Arrays.stream(numbers.split(" "))
 *                         .mapToInt(i -> Integer.parseInt(i))
 *                         .max()
 *                         .getAsInt();
 *
 *         return String.format("%d %d", max, min);
 *
 */
public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        String[] numbersStrings = numbers.split(" ");
        for (String number : numbersStrings) {
            int numberValue = Integer.parseInt(number);
            if (numberValue > highest)
                highest = numberValue;
            if (numberValue < lowest)
                lowest = numberValue;
        }
        return String.format("%s %s", highest, lowest);
    }

}
