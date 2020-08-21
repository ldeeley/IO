import java.io.*;

public class CopyAFileOnDisk {



    public static void main(String[] args) throws IOException {
        FileInputStream inputStreamReader = new FileInputStream("/Users/leste/IdeaProjects/IO/data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/leste/IdeaProjects/IO/copyofdata.txt");

        while (inputStreamReader.available() > 0){
            int x = inputStreamReader.read();
            fileOutputStream.write(x);
        }

        inputStreamReader.close();
        fileOutputStream.close();

    }

}
