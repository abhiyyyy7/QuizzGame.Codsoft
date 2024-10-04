package com.Codesoft;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizApp {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        
        
        questions.add(new Question("What is the capital of France?", Arrays.asList("Berlin", "Madrid", "Paris", "Rome"), 2));
        questions.add(new Question("What is 2 + 2?", Arrays.asList("3", "4", "5", "6"), 1));
        questions.add(new Question("Which planet is known as the Red Planet?", Arrays.asList("Earth", "Mars", "Jupiter", "Venus"), 1));
        questions.add(new Question("Who wrote 'Hamlet'?", Arrays.asList("Charles Dickens", "Jane Austen", "William Shakespeare", "Mark Twain"), 2));
        questions.add(new Question("What is the largest ocean on Earth?", Arrays.asList("Indian Ocean", "Atlantic Ocean", "Arctic Ocean", "Pacific Ocean"), 3));
        questions.add(new Question("What is the powerhouse of the cell?", Arrays.asList("Nucleus", "Mitochondria", "Ribosome", "Chloroplast"), 1));
        questions.add(new Question("What is the freezing point of water?", Arrays.asList("0°C", "32°C", "100°C", "212°C"), 0));
        questions.add(new Question("Which country gifted the Statue of Liberty to the USA?", Arrays.asList("Canada", "France", "Germany", "Italy"), 1));
        questions.add(new Question("What is the chemical symbol for gold?", Arrays.asList("Ag", "Au", "Pb", "Fe"), 1));
        questions.add(new Question("How many continents are there?", Arrays.asList("5", "6", "7", "8"), 2));

        QuizManager quizManager = new QuizManager(questions);
        quizManager.startQuiz();
    }
}


