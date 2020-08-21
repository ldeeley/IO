import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAFileOnDiskv2 {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStreamReader = new FileInputStream("/Users/leste/IdeaProjects/IO/data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/leste/IdeaProjects/IO/copyofdata.txt");

        byte[] buffer = new byte[1000];
        while (inputStreamReader.available() > 0){
            int x = inputStreamReader.read(buffer);
            fileOutputStream.write(buffer,0,x);
        }

        inputStreamReader.close();
        fileOutputStream.close();

    }

}
