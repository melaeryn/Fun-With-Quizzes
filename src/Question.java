public abstract class Question {
    protected String question;

    public Question(String newQuestion) {
        this.question = newQuestion;
    }

    public abstract boolean checkAnswer(String answer);

    public abstract String getCorrectAnswer();

    public abstract void printChoices();

    public String getQuestion(){
        return question;
    }
}
