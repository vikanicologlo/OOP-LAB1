package oop.practice;

public class TextData {
    private String fileName;
    private String text;
    private int numberOfVowels;
    private int numberOfConsonants;
    private int numberOfLetters;
    private int numberOfSentences;
    private String longestWord;


    public TextData(String fileName, String text) {
        this.fileName = fileName;
        this.text = text;
        this.numberOfVowels = countCharacters("[aeiouyAEIOUY]");
        this.numberOfConsonants = countCharacters("[bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ]");
        this.numberOfLetters = countLetters();
        this.numberOfSentences = countSentences();
        this.longestWord = findLongestWord();
    }

    public String getFileName() {
        return fileName;
    }

    public String getText() {
        return text;
    }

    public int getNumberOfVowels() {
        return numberOfVowels;
    }

    public int getNumberOfConsonants() {
        return numberOfConsonants;
    }

    public int getNumberOfLetters() {
        return numberOfLetters;
    }

    public int getNumberOfSentences() {
        return numberOfSentences;
    }

    public String getLongestWord() {
        return longestWord;
    }

    private int countCharacters(String regex) {
        return text.replaceAll("[^" + regex + "]", "").length();
    }

    private int countLetters() {
        return text.replaceAll("[^a-zA-Z]", "").length();
    }

    private int countSentences() {
        if (!text.matches(".*[.!?].*")) {
            return 0; // 0 if no punctuation is found
        }
        String[] sentences = text.split("[.!?]+");
        return sentences.length;
    }

    private String findLongestWord() {
        //splitting text by whitespace
        String[] words = text.split("[\\s]+");
        String longestWord = "";

        for (String word : words) {
            // all characters thar aren't words or -
            word = word.replaceAll("^[^a-zA-Z-]+|[^a-zA-Z-]+$", "");

            //if the word is valid
            if (!word.isEmpty() && word.matches("[a-zA-Z-]+")) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        //to not have null
        return longestWord.isEmpty() ? "" : longestWord;
    }
}
