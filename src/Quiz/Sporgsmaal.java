package Quiz;

public class Sporgsmaal {
    private String questionText;
    private int point;
    private String answer[];
    private int rightAnswers;


    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getRightAnswers() {
        return rightAnswers;
    }

    public void setRightAnswers(int rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public void getAnswer() {

        for (int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }
    }

    public void setAnswer(String[] answer) {
        this.answer = answer;
    }



}
