package com.Codesoft;
import java.util.List;

public class Question {
    String questionText;
    List<String> options;
    int correctOptionIndex;

    public Question(String questionText, List<String> options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public boolean isCorrectAnswer(int userAnswer) {
        return userAnswer == correctOptionIndex;
    }
}

