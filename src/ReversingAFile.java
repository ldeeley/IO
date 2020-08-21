import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReversingAFile {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:/Users/leste/IdeaProjects/IO/data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/leste/IdeaProjects/IO/lgdgrr.txt");

        int bufferSize = fileInputStream.available();
        int[] buffer = new int[bufferSize];
        while (fileInputStream.available()>0){
            bufferSize = bufferSize-1;
            int ch = fileInputStream.read();
            buffer[bufferSize] = ch;
        }
        for (int value : buffer) {
            fileOutputStream.write(value);
        }
        fileInputStream.close();
        fileOutputStream.close();

    }

}
