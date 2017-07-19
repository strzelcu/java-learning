package rozdzial9.excercise11;

public class SwapCharacters extends StringProcessor {

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public String process(Object input) {

        StringBuffer result = new StringBuffer((String) input);
        char[] buffer = result.toString().toCharArray();
        result.delete(0, result.length());
        for(int i = 0; i < buffer.length / 2; i++){
            result.append(buffer[i+1]);
            result.append(buffer[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "dorota";
        Apply.process(new SwapCharacters(), s);
    }
}
