package hu.adam.FilePartReader;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileWordAnalyzerTest {

    @Test
    void getWordsOrderedAlphabetically() {
        FilePartReader fpr = new FilePartReader();
        fpr.setup("/home/adam/Desktop/Codecool/OOP/V.SI/FilePartReader/testTxtFiles/alphabetOrder.txt",
                    1,10);
        FileWordAnalyzer fwa = new FileWordAnalyzer(fpr);
        List<String> alphabetStrings = new ArrayList<>(Arrays.asList(
                "Candace",
                "Gayla",
                "Gerri",
                "Gricelda",
                "Isidro",
                "Meagan",
                "Raye",
                "Tianna",
                "Vincenzo",
                "Wilson"));
        try {
            assertEquals(alphabetStrings,fwa.getWordsOrderedAlphabetically());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getWordsContainingSubstring() {
        FilePartReader fpr = new FilePartReader();
        fpr.setup("/home/adam/Desktop/Codecool/OOP/V.SI/FilePartReader/testTxtFiles/wordsContainingSubstring.txt",
                1,5);
        FileWordAnalyzer fwa = new FileWordAnalyzer(fpr);
        List<String> containingStrings = new ArrayList<>(Arrays.asList(
                "substring",
                "substring",
                "substring",
                "substring",
                "subs",
                "subscribe",
                "submarine",
                "submachine",
                "subbullet"
        ));
        try {
            assertEquals(containingStrings,fwa.getWordsContainingSubstring("sub"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getStringsWhichPalindromes() {
        FilePartReader fpr = new FilePartReader();
        fpr.setup("/home/adam/Desktop/Codecool/OOP/V.SI/FilePartReader/testTxtFiles/Palindromes.txt",
                1,11);
        FileWordAnalyzer fwa = new FileWordAnalyzer(fpr);
        List<String> palindromes = new ArrayList<>(Arrays.asList(
                "radar",
                "redder",
                "refer",
                "repaper",
                "rotator" ,
                "rotor" ,
                "sagas" ,
                "solos",
                "stats" ,
                "tenet" ,
                "wow"));
        try {
            assertEquals(palindromes,fwa.getStringsWhichPalindromes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}