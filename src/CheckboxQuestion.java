import java.util.ArrayList;

public class CheckboxQuestion extends Question {
    private ArrayList<String> choices = new ArrayList<>();


    /**
        "a. "hello" "
        "b. "hi" "
        "c. "hey" "
        "d. "no" "
        "e. "dog" "
     **/

    private ArrayList<String> correctAnswer = new ArrayList<>();

    /**
        "a"
        "b"
        "c"
     **/

    public CheckboxQuestion(String question, String correct){
        super(question);
        String[] answerArray = correct.split(",");
        for(String addMe : answerArray){
            this.correctAnswer.add(addMe);
        }
    }

    public boolean checkAnswer(String Answer){
        //make a char array of
        String[] answerArray = Answer.split(",");
        int numberCorrect = 0;
        for(String correct : answerArray){
            if(correctAnswer.contains(correct)){
                numberCorrect++;
            }
        }
        if(numberCorrect != correctAnswer.size()){
            return false;
        }

        return true;
    }

    public void addChoice(String addMe){
        this.choices.add(addMe);
    }

    public String getCorrectAnswer(){
        return this.correctAnswer.toString();
    }

    public void printChoices() {
        for (String choice : this.choices) {
            System.out.println(choice);
        }
    }
}
