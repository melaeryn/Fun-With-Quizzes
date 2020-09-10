public class QuizRunner {
    public static void main(String[] args){
        Quiz newQuiz = new Quiz();

        MultipleChoiceQuestion question = new MultipleChoiceQuestion("What is Charizard's Pokedex Number?", "c");
        question.addChoice("a. 002");
        question.addChoice("b. 004");
        question.addChoice("c. 006");
        question.addChoice("d. 008");
        question.addChoice("e. 010");

        newQuiz.addQuestion(question);

        CheckboxQuestion checkQ = new CheckboxQuestion("\nWhich of the following pokemon are fairy type? \nMore than one Answer may be right. " +
                "Please separate your answers with a comma.", "b,d");
        checkQ.addChoice("a. Houndoom");
        checkQ.addChoice("b. Clefairy");
        checkQ.addChoice("c. Whismur");
        checkQ.addChoice("d. Whimsicott");
        checkQ.addChoice("e. Glameow");

        newQuiz.addQuestion(checkQ);

        TrueFalseQuestion booleanQ = new TrueFalseQuestion("\nTrue or false: Zweilious is not a dragon type.", "false");

        newQuiz.addQuestion(booleanQ);

        question = new MultipleChoiceQuestion("\nIn Pokemon Sword & Shield, what move can Squirtle NOT learn?", "a");
        question.addChoice("a. Payback");
        question.addChoice("b. Endure");
        question.addChoice("c. Brick Break");
        question.addChoice("d. Mirror Coat");
        question.addChoice("e. Aqua Jet");

        newQuiz.addQuestion(question);

       checkQ = new CheckboxQuestion("\nWhich of the following pokemon can you find on route 3 of Pokemon Sword? \nMore than one Answer may be right." +
                "Please separate your answers with a comma.", "b,c,d");
        checkQ.addChoice("a. Growlithe");
        checkQ.addChoice("b. Stunky");
        checkQ.addChoice("c. Rookidee");
        checkQ.addChoice("d. Skwovet");
        checkQ.addChoice("e. Cubchoo");

        newQuiz.addQuestion(checkQ);


        double correct = newQuiz.runQuiz();
        System.out.println("Your grade is: " + newQuiz.grade(correct));
    }
}
