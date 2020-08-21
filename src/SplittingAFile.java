import java.io.*;

public class SplittingAFile {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFile = "C:/Users/leste/IdeaProjects/IO/data.txt";
        String splitFile1 = reader.readLine();
        String splitFile2 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(sourceFile);
        FileOutputStream fileOutputStream2 = new FileOutputStream(splitFile1);
        FileOutputStream fileOutputStream3 = new FileOutputStream(splitFile2);

        int sourceFileSize = fileInputStream.available();
        int splitFile2Size = sourceFileSize/2;
        int splitFile1Size = sourceFileSize-splitFile2Size;

        int ch;

        for (int i = 1; i<=splitFile1Size; i=i+1){
            ch = fileInputStream.read();
            fileOutputStream2.write(ch);
        }
        while (fileInputStream.available()>0){
            ch = fileInputStream.read();
            fileOutputStream3.write(ch);
        }

        fileInputStream.close();
        fileOutputStream2.close();
        fileOutputStream3.close();



    }

}
