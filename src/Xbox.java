import javax.swing.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Xbox {
    public static void main(String[] args) {
        System.out.println("Check if console that you are looking for is in the list?");
        Scanner scanner = new Scanner(System.in);
        String console = scanner.nextLine();
        String console2 = console.toLowerCase();
        int console3 = 0;
        LinkedList<String> consoleConsole = new LinkedList<>();
        consoleConsole.add("xbox");
        consoleConsole.add("xbox");
        consoleConsole.add("ps5");
        consoleConsole.add("ps2");
        consoleConsole.add("xbox");
        consoleConsole.add("nintendo");
        consoleConsole.add("pegazus");
        consoleConsole.add("ps2");
        consoleConsole.add("ps1");
        //  System.out.println("Result of searching: " + consoleConsole.contains(console));
        if (consoleConsole.contains(console2) == false) {
            System.out.println("Sorry but don't have that products on the List :(");
        } else if (consoleConsole.contains(console2) == true) {

            for (String game:consoleConsole) {
                if (game.equals(console)) {
                    console3++;
                }
            }
            System.out.println("Number of articles that we found for you: " + console3);
        }
    }
}



















