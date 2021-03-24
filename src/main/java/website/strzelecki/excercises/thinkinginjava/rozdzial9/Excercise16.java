package website.strzelecki.excercises.thinkinginjava.rozdzial9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class RandomChar {
    private Random random = new Random();

    public char nextChar() {
        return (char) (random.nextInt(26) + 96);
    }

    public static void main(String[] args) {
        RandomChar randomChar = new RandomChar();
        for(int i = 0; i < 20; i++) System.out.print(randomChar.nextChar() + " ");
    }
}

class AdaptedRandomChar extends RandomChar implements Readable {

    private int count;

    public AdaptedRandomChar(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {

        if(count-- == 0)
            return -1;
        String result = Character.toString(nextChar()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomChar(20));
        while (s.hasNext()) {
            System.out.print(s.next() + " ");
        }
    }
}

public class Excercise16 {

}
