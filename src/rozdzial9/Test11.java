/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial9;

import com.sun.xml.internal.fastinfoset.util.CharArray;
import java.util.Arrays;
import static rozdzial9.Apply.process;
import static rozdzial9.StringProcessor.s;
import static util.Print.print;
import static util.Print.print;

/**
 *
 * @author Strzelcu
 */

interface Processor {
    String name();
    Object process(Object input);
}

abstract class StringProcessor implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }
    @Override
    public abstract String process(Object input);
    public static String s = 
            "Jeśli ona waży tyle, co kaczka, to znaczy, że jest z drewna";
    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
    }
}

class Upcase extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}

class Swapper {
    String swapCharacters(String s) {
        char[] bufor = s.toCharArray();
        StringBuilder out = new StringBuilder();
        for(int i = 0; i < s.length() - 1; i += 2) {
            char b = bufor[i];
            bufor[i] = bufor[i+1];
            bufor[i+1] = b;
        }
        for(int i = 0; i < s.length(); i++) {
            out.append(bufor[i]);
        }
        return out.toString();
    }
    
    private static String test = "Alalalalalal";
    
    public static void main(String[] args) {
        Swapper s = new Swapper();
        print(s.swapCharacters(test));
    }
}

class Apply {
    static void process(Processor p, Object s) {
        print("Używam procesora " + p.name());
        print(p.process(s));
    }
    
    public static String s = "Idzie Grześ przez wieś, worek piasku niesie";
    
    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}

public class Test11 {
    public static void main(String[] args) {
        process(new SwapperProcessor(new Swapper()), s);
    }
}
