package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameData;
import java.util.Scanner;

public class Even {

    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static String createQuestion(int number) {
        return "Question: " + number;
    }

    private static String createCorrectAnswer(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }

    private static GameData createGameData() {
        String[] questions = new String[Engine.COUNT_ROUNDS];
        String[] correctAnswers = new String[Engine.COUNT_ROUNDS];

        int number;
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            number = (int) (Math.random() * 100 + 1);
            questions[i] = createQuestion(number);
            correctAnswers[i] = createCorrectAnswer(number);
        }

        return new GameData(RULES, questions, correctAnswers);
    }

    public static void play(String userName, Scanner scanner) {
        GameData gameData = createGameData();
        Engine.startGame(userName, gameData, scanner);
    }

}
