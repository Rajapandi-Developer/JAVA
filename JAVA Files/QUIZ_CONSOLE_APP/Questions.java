package QUIZ_CONSOLE_APP;

public class Questions {

    private int id;
    private String Question;
    private String Opt1;
    private String Opt2;
    private String Opt3;
    private String Opt4;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getOpt1() {
        return Opt1;
    }

    public void setOpt1(String opt1) {
        Opt1 = opt1;
    }

    public String getOpt2() {
        return Opt2;
    }

    public void setOpt2(String opt2) {
        Opt2 = opt2;
    }

    public String getOpt3() {
        return Opt3;
    }

    public void setOpt3(String opt3) {
        Opt3 = opt3;
    }

    public String getOpt4() {
        return Opt4;
    }

    public void setOpt4(String opt4) {
        Opt4 = opt4;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    private String Answer;
    public Questions(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
        this.id = id;
        Question = question;
        Opt1 = opt1;
        Opt2 = opt2;
        Opt3 = opt3;
        Opt4 = opt4;
        Answer = answer;
    }
    
    
    
    
}