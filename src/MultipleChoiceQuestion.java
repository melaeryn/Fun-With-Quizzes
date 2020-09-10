import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question {

    private ArrayList<String> choices = new ArrayList<>();


    /** "a. 1"
        "b. 2"
        "c. 3"
        "d. 4"
        "e. 5"
     **/
    private String correctAnswer;
    /** "a"
     **/
    public MultipleChoiceQuestion(String question, String correctAnswer){
        super(question);
        this.correctAnswer = correctAnswer;

    }

    public boolean checkAnswer(String Answer){
        if(this.correctAnswer.toLowerCase().equals(Answer.toLowerCase())) {
            return true;
        }
        return false;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void addChoice(String choice) {
        this.choices.add(choice);
    }

    public void printChoices(){
        for(String choice : this.choices){
            System.out.println(choice);
        }
    }
}
