import java.io.File;

public class FileAndDirectoryNames {

    public static void main(String[] args) {
        File file = new File("C:/Users/leste/IdeaProjects");
        String[] fileList = file.list();
        if (fileList != null) {
            for (String name : fileList) {
                System.out.println(name);
            }
        }
    }
}

