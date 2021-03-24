package website.strzelecki.excercises.thinkinginjava.rozdzial9.excercise11;

public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input) {
        return input;
    }
}
