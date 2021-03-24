package website.strzelecki.excercises.thinkinginjava.rozdzial9.excercise11;

public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString() { return "Waveform " + id; }
}
