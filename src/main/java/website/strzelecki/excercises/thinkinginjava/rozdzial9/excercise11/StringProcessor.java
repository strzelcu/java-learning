package website.strzelecki.excercises.thinkinginjava.rozdzial9.excercise11;

import java.util.Arrays;

public abstract class StringProcessor implements Processor {

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract String process(Object input);

    public static String s =
            "Jeśli ona waży tyle, co kaczka, to znaczy że jest z drewna";

    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
    }
}

class Upcase extends StringProcessor {
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class Downcase extends StringProcessor {
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends StringProcessor {
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
