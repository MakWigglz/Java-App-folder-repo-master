public class ResponseEvaluator {
    public String evaluateResponses(boolean[] responses) {
        String statement = "";
        String link = "";

        if (responses[0] && responses[1] && responses[2] && responses[3]) {
            statement = "You are a young, employed male who likes coding.";
            link = "https://en.wikipedia.org/wiki/Young_male_employed_coder";
        } else if (responses[0] && responses[1] && responses[2] && !responses[3]) {
            statement = "You are a young, employed male who does not like coding.";
            link = "https://en.wikipedia.org/wiki/Young_male_employed_non_coder";
        }
        // Add more conditions for other combinations...

        return statement + " Learn more: " + link;
    }
}
