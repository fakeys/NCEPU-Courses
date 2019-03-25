public class Question {
    private String text;
    private String[] options;

    public Question() {}
    public Question(String text, String[] options) {
        this.text = text;
        this.options = options;
    }

    public String[] getOptions() {
        return options;
    }

    public String getText() {
        return text;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean check(String answers) {
        return true;
    }

    public void print() {
        System.out.println(text);
        for (String op: this.options)
            System.out.print(op+"\t");
        System.out.print("\nPlease choose:");
    }
}
