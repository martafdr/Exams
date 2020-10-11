import by.gomel.testTask.models.ControlEvent;
import by.gomel.testTask.operations.ReadFile;

import java.util.*;

public class Runner {
    static ArrayList collection = new ArrayList();

    public static void main(String[] args) {
        final String TXT = ".txt";
        final String FILE_NAME = args[0] + TXT;
        ReadFile rf = new ReadFile(FILE_NAME);
        collection = rf.getAllControlEvents();
        System.out.println("Hello! You create a collection of control events from file: " + FILE_NAME);
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("Please, enter: \n" +
                "1 - to print the collection; \n" +
                "2 - to redefine the collection (according to whether the control event is passed or not); \n" +
                "3 - to exit from application.");
        Scanner scanner = new Scanner(System.in);
        try {
            switch (scanner.nextInt()) {
                case 1:
                    for (Object temp : collection) {
                        System.out.println(temp);
                    }
                    System.out.println();
                    mainMenu();
                case 2:
                    collection.sort(Comparator.comparing(ControlEvent::getResult).reversed());
                    System.out.println("Collection of control events is redefined! \n");
                    mainMenu();
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Choose one of three variants! \n");
                    mainMenu();
            }
        } catch (InputMismatchException | NullPointerException ex) {
            System.out.println("Incorrect data entry! Please try again! \n");
            mainMenu();
        }
    }
}

