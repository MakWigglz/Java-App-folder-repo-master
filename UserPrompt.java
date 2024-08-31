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
}
