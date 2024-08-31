import java.util.Scanner;

public class WebApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            UserPrompt userPrompt = new UserPrompt();
            ResponseEvaluator evaluator = new ResponseEvaluator();

            System.out.println("Are you male? (true/false)");
            userPrompt.setIsMale(scanner.nextBoolean());

            System.out.println("Are you employed? (true/false)");
            userPrompt.setIsEmployed(scanner.nextBoolean());

            System.out.println("Are you younger than 40? (true/false)");
            userPrompt.setIsYoungerThan40(scanner.nextBoolean());

            System.out.println("Do you like coding? (true/false)");
            userPrompt.setLikesCoding(scanner.nextBoolean());

            boolean[] responses = userPrompt.getUserResponses();
            String result = evaluator.evaluateResponses(responses);

            System.out.println(result);
        }
    }
}
