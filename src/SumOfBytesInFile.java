import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SumOfBytesInFile {

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("C:/Users/leste/IdeaProjects/IO/data.txt");

        long sum = 0;

        while (inputStream.available() > 0) {  // as long as there are still unread bytes in the inputstream...
        int data = inputStream.read();
        System.out.print((char)data);
        sum += data;
        }
        inputStream.close();

        System.out.println(sum);
    }

}
