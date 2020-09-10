import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> quizQuestions = new ArrayList<>();

    public Quiz (){

    }

    public void addQuestion(Question question){
        this.quizQuestions.add(question);
    }

    public void removeQuestion(Question question){
        this.quizQuestions.remove(question);
    }

    public double runQuiz(){
        double correctAnswers = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Marli's Pokemon Quiz!\n");

        for(Question question : quizQuestions){
            System.out.println(question.getQuestion());
            question.printChoices();
            String answer = input.nextLine();

            if(question.checkAnswer(answer)){
                correctAnswers++;
                System.out.println("Correct! Good Job!");
            }
            else{
                System.out.println("Incorrect! The correct answer(s):" + question.getCorrectAnswer());
            }
        }
        return correctAnswers;
    }

    public double grade(double correctAnswers){
        return 100*(correctAnswers / this.quizQuestions.size());
    }
}
