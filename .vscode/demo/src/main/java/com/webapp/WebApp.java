package com.webapp;
import java.util.Scanner;
import java.util.Arrays; // Add this line to import the Arrays class

public class WebApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            UserPrompt userPrompt = new UserPrompt();

            System.out.println("Are you male? (true/false)");
            userPrompt.setIsMale(scanner.nextBoolean());

            System.out.println("Are you employed? (true/false)");
            userPrompt.setIsEmployed(scanner.nextBoolean());

            System.out.println("Are you younger than 40? (true/false)");
            userPrompt.setIsYoungerThan40(scanner.nextBoolean());

            System.out.println("Do you like coding? (true/false)");
            userPrompt.setLikesCoding(scanner.nextBoolean());

            boolean[] responses = userPrompt.getUserResponses();
            String result = Arrays.toString(responses);

            System.out.println(result);
        }
    }
}
