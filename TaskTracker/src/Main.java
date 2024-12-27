
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        System.out.print("Welcome to the to-do list \n  1.  add\n  2. update\n  3. mark-in-progress\n  4. mark done\n  5. delete\n  6. list all\n  Type your request:\n  ");



        Scanner sc = new Scanner(System.in);
        String Textinput = sc.nextLine();

        switch(Textinput) {
            case "add":
                System.out.println("you have chosen a good path ");
                break;

            case "update":
                System.out.println("you have chosen a great path ");
                break;
            case "mark-in-progress":
                System.out.println("you have chosen a greeat path ");
                break;
            case "mark-done":
                System.out.println("you have chosen az great path ");
                break;
            case "delete":
                System.out.println("you have chosen ar great path ");
                break;

                default:
                System.out.println("Unvalid command");
                break;
        }









    }
}