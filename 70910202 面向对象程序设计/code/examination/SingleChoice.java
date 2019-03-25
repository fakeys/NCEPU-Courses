public class SingleChoice extends Question {
    private char answer;

    public SingleChoice() {}
    public SingleChoice(String text, String[] options, char answer) {
        super(text, options);
        this.answer = answer;
        //setOptions(options);
        //setText(text);
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }

    @Override
    public boolean check(String answers) {
        return ((answers.length() == 1) && (answers.toUpperCase().charAt(0) == this.answer));
    }
}
