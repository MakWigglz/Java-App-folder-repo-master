package com.github.MakWigglz.madlibgame;

import java.util.Arrays;
import java.util.Scanner;


public class MadLibGame {
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);

        MadLibStory story = new MadLibStory(
            "The {} {} {} {} through the forest, looking for adventure.", Arrays.asList("adjective", "noun", "verb(past tense)", "adverb")
    );
        System.out.println("Welcome to MadLib Game");
        System.out.println("Please enter the following:");

        while (!story.isComplete()) {
            System.out.print(story.getNextWordType() + ": ");
            String input = scanner.nextLine();
            story.addUserInput(input);
        }
        System.out.println("\nHere's your MadLib story:");
        System.out.println(story.getCompletedStory());

        scanner.close();
    }
    public static void main(String[] args) {
        playGame();
    }
}
