package QUIZ_CONSOLE_APP;

import java.util.Scanner;

public class QuestionService {
    Questions[] ques=new Questions[3];
    String selection[]=new String[3];
    String ActualAnswer[]=new String[3];
    public QuestionService()
    {
        ques[0]=new Questions(1, "Size of int ", "4", "2", "3", "1", "4");
        ques[1]=new Questions(2, "Size of bool ", "4", "2", "3", "1", "1");
        ques[2]=new Questions(3, "Size of long ", "4", "2", "8", "1", "8");
    }

    public void displayQuestions()
    {
        int i=0;
        Scanner sr=new Scanner(System.in);
        for (Questions questions : ques) {
            System.out.println("Question no "+questions.getId());
            System.out.println("Question : "+questions.getQuestion());
            System.out.println("Option 1) "+questions.getOpt1());
            System.out.println("Option 2) "+questions.getOpt2());
            System.out.println("Option 3) "+questions.getOpt3());
            System.out.println("Option 4) "+questions.getOpt4());
            ActualAnswer[i]=questions.getAnswer();
            System.out.print("Your choice is ");
            selection[i]=sr.nextLine();
            i++;
        }
        sr.close();
    }

    public void score()
    {
        int score =0;
        for (int i=0;i<ques.length;i++) {
            
            String UserAnswer=selection[i];
            System.out.println("Your answer is : "+UserAnswer);
            String Answer=ActualAnswer[i];
            System.out.println("Actual answer is : "+ActualAnswer);
            if(Answer.equals(UserAnswer))
                score++;
        }

        System.out.println("Your total score : "+score);
    }
}
