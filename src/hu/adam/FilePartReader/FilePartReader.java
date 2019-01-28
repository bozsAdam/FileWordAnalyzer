package hu.adam.FilePartReader;

import java.io.FileInputStream;

public class FilePartReader {
    private String filePath;
    private Integer fromLine;
    private Integer toLine;

    public void setup(String filePath,Integer fromLine, Integer toLine){
        if(toLine<fromLine || fromLine<1){
            throw new IllegalArgumentException();
        } else{
            this.filePath = filePath;
            this.fromLine = fromLine;
            this.toLine = toLine;
        }
    }

    public String read() throws Exception{
        FileInputStream fis = new FileInputStream(filePath);
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while((i=fis.read()) != -1){
            builder.append((char) i);
        }

        return builder.toString();
    }

    public String readLines() throws Exception{
        String content = read();
        String[] splittedContent = content.split("\n");
        StringBuilder builder = new StringBuilder();
        for (int i = this.fromLine-1; i < this.toLine; i++) {
            builder.append(splittedContent[i]);
            builder.append("\n");
        }
        return builder.toString();
    }

}
