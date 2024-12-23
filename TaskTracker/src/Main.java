
import java.io.IOException;
import java.nio.file.Path;
import java.io.FileReader;
import java.util.Scanner;

import static java.nio.file.Files.*;

public class Main {

    public static void main(String[] args) throws IOException {


        System.out.print("Welcome to the to-do list \n");


        // Add new Json

        Scanner sc = new Scanner(System.in);
        String y = sc.nextLine();

//        System.out.println(y);

        ControllerTask.AddTask(y);


        //read files
        Path path = Path.of("src/tasks.json");
        FileReader fileReader =     new FileReader(String.valueOf(path));
        int i ;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char)i);
        }

        //Parsing




    }
}