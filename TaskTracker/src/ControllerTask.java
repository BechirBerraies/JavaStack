import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Date;
import java.nio.file.Files;

public abstract class ControllerTask {

    public static final String AddTask(String task){
        Path path = Path.of("src/tasks.json");
        String Netmask = "{\n"+
                task


                + "\n}";
        try {
            Files.write(path , Netmask.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return task.toString();
    }
    private static int idCounter = 0;/**/

    public static synchronized int createID()
    {
        return  idCounter++;
    }

}
