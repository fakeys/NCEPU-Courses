import java.util.Arrays;

public class MultiChoice extends Question {
    private char[] answer;

    public MultiChoice() {
    }

    public MultiChoice(String text, String[] options, char[] answer) {
        super(text, options);
        this.answer = answer;
        //setOptions(options);
        //setText(text);
    }

    public void setAnswer(char[] answer) {
        this.answer = answer;
    }

    @Override
    public boolean check(String answers) {
        if (answers.length() != this.answer.length)
            return false;
        else {
            char[] response = answers.toCharArray();
            Arrays.sort(response);
            String reS = String.valueOf(response);
            return reS.equalsIgnoreCase(String.valueOf(this.answer));
        }
    }
}