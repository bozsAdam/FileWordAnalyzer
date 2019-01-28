package hu.adam.FilePartReader;

import static org.junit.jupiter.api.Assertions.*;

class FilePartReaderTest {

    @org.junit.jupiter.api.Test
    void testSmallerToLine() {
        FilePartReader fpr = new FilePartReader();
        assertThrows(IllegalArgumentException.class, ()->{
            fpr.setup("/home/adam/Desktop/test.txt",2,1);
        });
    }

    @org.junit.jupiter.api.Test
    void testFromLineSmallerThanOne() {
        FilePartReader fpr = new FilePartReader();
        assertThrows(IllegalArgumentException.class, ()->{
            fpr.setup("/home/adam/Desktop/test.txt",-1,1);
        });
    }

    @org.junit.jupiter.api.Test
    void read() {
        FilePartReader fpr = new FilePartReader();
        fpr.setup("/home/adam/Desktop/Codecool/OOP/V.SI/FilePartReader/testTxtFiles/Read.txt",
                        1,4);
        try {
            assertEquals("this file contains\n" +
                    "for rows of text\n" +
                    "and i ensure that\n" +
                    "the reader will read all of its content\n",fpr.read());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @org.junit.jupiter.api.Test
    void readLines() {
        FilePartReader fpr = new FilePartReader();
        fpr.setup("/home/adam/Desktop/Codecool/OOP/V.SI/FilePartReader/testTxtFiles/ReadLines.txt",
                3,5);
        try {
            assertEquals("only this rows of the file\n" +
                    "and this as well\n" +
                    "and this\n",fpr.readLines());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}