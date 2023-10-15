package com.example.abc;



public class Question {
    private int questionId;
    private boolean trueAnswer;

    public Question(int questionId, boolean answer) {
        this.questionId = questionId;
        this.trueAnswer = answer;
    }

    public boolean isTrueAnswer() {

        return trueAnswer;
    }

    public int getQuestionId() {
        return questionId;
    }
}
