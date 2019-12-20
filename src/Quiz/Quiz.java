package Quiz;

public abstract class Quiz implements Translatable {


    public static void main(String[] args) {
        Sporgsmaal question = new Sporgsmaal();
        Sporgsmaal answer[];

        question.setQuestionText("Hvordan fungere en programmerings test prøve?");

        System.out.println(question.getQuestionText());

        //question.setAnswer(answer["Tyve elever der sidder i et lokale med deres computere?","Tyve elever der sidder i et lokale med deres computere?"];
        //question.getAnswer();
    }


    public String translate() {
        return "Oversættelse ikke mulig, mangler implementation og viden";
    }

}
