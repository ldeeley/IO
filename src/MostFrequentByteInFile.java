import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentByteInFile {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:/Users/leste/IdeaProjects/IO/data.txt");

        Map<Integer,Integer> charCount = new HashMap<>();

        while (fileInputStream.available() > 0){
            int ch = fileInputStream.read();
            if (charCount.containsKey(ch)){
                charCount.put(ch,charCount.get(ch)+1);
            } else charCount.put(ch,1);
        }

        int maxFreqencyByte = 0;
        int maxFrequencyChar = 0;
        for (Map.Entry<Integer,Integer> byteKey : charCount.entrySet()){
            if (byteKey.getValue()>maxFreqencyByte) {
                maxFreqencyByte = byteKey.getValue();
                maxFrequencyChar = byteKey.getKey();
            }
        }
        char x = (char) maxFrequencyChar;
        System.out.println("Most frequent character is : "+x+": occuring "+ maxFreqencyByte + " times");
    }

}
