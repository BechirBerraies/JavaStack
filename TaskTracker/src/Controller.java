import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;


public class Controller {



    Path path = Path.of("src/tasks.json");

    public static String  reader(Path e) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(e)));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
// delete the last new line separator
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();

        String content = stringBuilder.toString();
        return content;

    }




    public static void lex() throws IOException {
        Path path = Path.of("src/tasks.json");
        String content = reader(path);



    }

     String AddTask(String name , String desciption){
    return
    }



}
