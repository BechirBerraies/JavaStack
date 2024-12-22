import java.time.LocalDate;
public class Task {
    private int id;
    private String description;

    private enum status {
        todo,
        in_progress,
        done,
    }
}
