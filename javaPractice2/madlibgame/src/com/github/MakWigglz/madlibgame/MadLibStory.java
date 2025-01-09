package com.github.MakWigglz.madlibgame;

import java.util.ArrayList;
import java.util.List;

public class MadLibStory {
    private String storyTemplate;
    private List<String> wordTypes;
    private List<String> userInputs;

    public MadLibStory(String storyTemplate, List<String> wordTypes) {
        this.storyTemplate = storyTemplate;
        this.wordTypes = wordTypes;
        this.userInputs = new ArrayList<>();
    }

    public void addUserInput(String input) {
        userInputs.add(input);
    }

    public String getNextWordType() {
        return wordTypes.get(userInputs.size());
    }

    public boolean isComplete() {
        return userInputs.size() == wordTypes.size();
    }

    public String getCompletedStory() {
        String story = storyTemplate;
        for (int i = 0; i < userInputs.size(); i++) {
            story = story.replaceFirst("\\{\\}", userInputs.get(i));
        }
        return story;
    }
}
