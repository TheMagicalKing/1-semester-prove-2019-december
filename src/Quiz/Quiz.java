package Quiz;

import java.util.Scanner;

public abstract class Quiz implements Translatable {


    public static void main(String[] args) {
        Sporgsmaal question = new Sporgsmaal();
        Sporgsmaal sporgsmaal[];
        Scanner input = new Scanner(System.in);

        question.setQuestionText("Hvordan fungere en programmerings test prøve?");
        question.setCorrectAnswer(1);

        System.out.println(question.getQuestionText());
        question.setAnswer(new String[]{"1. Tyve elever der sidder bag skærmen på deres computere","2. Tyve elever der har computer problemer","3. Tyve elever der hopper ude foran skolen","4. der er ingen der kommer"});

        for (int i = 0; i< question.getAnswer().length; i++){
            String[] spoorgsmal = question.getAnswer();
            System.out.println(spoorgsmal[i]);
        }

        System.out.println("Hvad er det rigtige svar?");

        if (input.nextInt() == question.getCorrectAnswer()){
            System.out.println("Correct!");
            question.setPoint(1);
        }else{
            System.out.println("Wrong answer thanks for playing!");
        }

        System.out.println("Så mange point har du: "+question.getPoint());

        question.setRightAnswers(2);
        System.out.println("Rigtige svar: " + question.getRightAnswers());


    }


    public String translate() {
        return "Oversættelse ikke mulig, mangler implementation og viden";
    }

}
