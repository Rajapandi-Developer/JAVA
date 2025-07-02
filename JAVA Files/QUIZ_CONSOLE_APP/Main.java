package QUIZ_CONSOLE_APP;

public class Main {
    
    public static void main(String[] args) {
        QuestionService qs=new QuestionService();
        qs.displayQuestions();
        qs.score();
    }
}
