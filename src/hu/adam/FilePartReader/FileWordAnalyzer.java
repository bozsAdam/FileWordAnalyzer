package hu.adam.FilePartReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FileWordAnalyzer {
    private FilePartReader fpr;

    public FileWordAnalyzer(FilePartReader fpr) {
        this.fpr = fpr;
    }

    public List<String> getWordsOrderedAlphabetically() throws Exception{
        String content = fpr.readLines();
        List<String> splittedWords = new ArrayList<>(Arrays.asList(content.split("\\W")));
        Collections.sort(splittedWords);
        return splittedWords;
    }

    public List<String> getWordsContainingSubstring(String subString) throws Exception{
        String content = fpr.readLines();
        List<String> splittedWords = new ArrayList<>(Arrays.asList(content.split("\\W")));
        splittedWords = splittedWords.stream()
                                     .filter(word -> word.contains(subString))
                                     .collect(Collectors.toList());
        return splittedWords;
    }

    public List<String> getStringsWhichPalindromes() throws Exception{
        String content = fpr.readLines();
        List<String> splittedWords = new ArrayList<>(Arrays.asList(content.split("\\W")));
        List<String> result = new ArrayList<>();
        for (String splittedWord : splittedWords) {
            List<String> test = new ArrayList<>(Arrays.asList(splittedWord.split("")));
            Collections.reverse(test);
            StringBuilder builder = new StringBuilder();
            test.forEach(builder::append);
            if(builder.toString().equals(splittedWord)){
                result.add(builder.toString());
            }
        }

        return result;
    }
}
