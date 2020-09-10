public class TrueFalseQuestion extends Question{

    private String correctAnswer;

    public TrueFalseQuestion(String question, String correct){
        super(question);
        this.correctAnswer = correct;
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

    public void printChoices(){
            System.out.println(true);
            System.out.println(false);
    }
}
