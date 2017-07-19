package rozdzial9.excercise11;

import static util.Print.print;

public class Apply {
    public static void process(Processor p, Object s){
        print("Używam procesora " + p.name());
        print(p.process(s));
    }
}
