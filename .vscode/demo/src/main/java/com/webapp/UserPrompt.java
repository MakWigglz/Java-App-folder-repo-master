package com.webapp;
public class UserPrompt {
    private boolean isMale;
    private boolean isEmployed;
    private boolean isYoungerThan40;
    private boolean likesCoding;

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public void setIsEmployed(boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    public void setIsYoungerThan40(boolean isYoungerThan40) {
        this.isYoungerThan40 = isYoungerThan40;
    }

    public void setLikesCoding(boolean likesCoding) {
        this.likesCoding = likesCoding;
    }
    public boolean[] getUserResponses() {
        return new boolean[]{isMale, isEmployed, isYoungerThan40, likesCoding};
    }
    public String[] generateUserMessage() {
        StringBuilder message = new StringBuilder("User Status: ");
    
        if (isEmployed) {
            message.append("Employed, ");
        } else {
            message.append("Unemployed, ");
        }
    
        if (isYoungerThan40) {
            message.append("under 40, ");
        } else {
            message.append("40 or older, ");
        }
    
        if (likesCoding) {
            message.append("likes coding.");
        } else {
            message.append("does not like coding.");
        }
        if (isMale) {
            message.append("is The MAN.");
        } else {
            message.append("SheMan or Female?");
        }
        return new String[]{message.toString()};
    }
}
