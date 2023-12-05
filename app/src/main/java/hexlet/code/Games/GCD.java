package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void divide() {
        Engine.comunication();
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
        int result = 0;

        for (var i = 0; i < 3; i++) {
            Random random = new Random();
            int indexOperators = random.nextInt(2);
            int value1 = random.nextInt(200);
            int value2 = random.nextInt(200);
            String term = "" + value1 + " " + value2;
            System.out.println("Question: " + term);

            System.out.print("Your answer: ");
            Scanner scanner1 = new Scanner(System.in);
            String answer1 = scanner1.next();


            for (int y = 1; y <= value1 && y <= value2; y++) {
                if (value1 % y == 0 && value2 % y == 0) {
                    result = y;
                }
            }

            if (result == Integer.parseInt(answer1)) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer1 + Engine.wrongAnswer + result);
                System.out.println(Engine.wrongAnswer2srting + userName);
                break;
            }

        }
        System.out.println("Congratulations, " + userName + "!");
    }
}