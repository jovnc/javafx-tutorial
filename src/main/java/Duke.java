import javafx.application.Application;

public class Duke {

    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }

    public String getResponse(String input) {
        return "Duke head: " + input;
    }
}
