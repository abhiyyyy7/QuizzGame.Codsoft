package com.Codesoft;
import java.util.List;
import java.util.Scanner;

public class QuizManager {
    private List<Question> questions;
    private int score;
    private Scanner scanner;

    public QuizManager(List<Question> questions) {
        this.questions = questions;
        this.scanner = new Scanner(System.in);
        this.score = 0;
    }

    public void startQuiz() {
        TimerManager timerManager = new TimerManager(() -> System.out.println("\nTime is up! Moving to the next question."));

        for (Question question : questions) {
            System.out.println("\n" + question.questionText);
            for (int i = 0; i < question.options.size(); i++) {
                System.out.println((i + 1) + ": " + question.options.get(i));
            }

            timerManager.startTimer(10);  // Set a 10-second timer

            System.out.print("Enter your answer (1-" + question.options.size() + "): ");
            int userAnswer = -1;

            try {
                userAnswer = scanner.nextInt() - 1;  // Convert to zero-based index
            } catch (Exception e) {
                scanner.next(); // Consume the invalid input to avoid an infinite loop
            }

            timerManager.stopTimer();

            if (userAnswer >= 0 && userAnswer < question.options.size() && question.isCorrectAnswer(userAnswer)) {
                score++;
            }
        }

        displayResults();
    }

    private void displayResults() {
        System.out.println("\nQuiz Finished!");
        System.out.println("Your final score: " + score + "/" + questions.size());
    }
}
