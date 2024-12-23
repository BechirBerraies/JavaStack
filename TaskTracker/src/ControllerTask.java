import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.Files;

public abstract class ControllerTask {

    static Path path = Path.of("src/tasks.json");



    public static final String AddTask(String task) throws IOException {



        FileReader fileReader =     new FileReader(String.valueOf(path));
        String text= fileReader.toString();
        text.replaceAll("]","");
        int i ;
        String newtext= "";
        while ((i = fileReader.read()) != -1) {
            newtext+= (char)i;
            System.out.print((char)i);
        }
//        System.out.println("new text \n"+newtext);
        newtext.replaceAll("]", " ");
        System.out.println("this is new Text"+ newtext);




        String Netmask = ",{\n"+


                "\"id\":"+createID()+",\n"+

                " \"description\": "    +  String.format(task) + ",\n"

                +"\"status\":" + "todo" + "\n"

                + "\n}"

                + "]"
                ;
        try {
            Files.write(path , Netmask.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return task;
    }


    private static int idCounter = 0;/**/

    public static synchronized int createID()
    {
        return  idCounter++;
    }

}
