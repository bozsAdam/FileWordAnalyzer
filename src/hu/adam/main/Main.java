package hu.adam.main;
import hu.adam.FilePartReader.FilePartReader;
import hu.adam.FilePartReader.FileWordAnalyzer;

public class Main {

    public static void main(String[] args) {
        FilePartReader fpr = new FilePartReader();
        fpr.setup("/home/adam/Desktop/asd.txt",1,3);
        FileWordAnalyzer fwa = new FileWordAnalyzer(fpr);
        try {
            System.out.println(fwa.getStringsWhichPalindromes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
