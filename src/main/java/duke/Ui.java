package duke;

/**
 * This class manages the UI for Duke
 */
public class Ui {
    /**
     * Print the Input guidelines for the reader such that Duke understands the
     * Input
     */
    public void printInstructions() {
        System.out.println("LIST OF ALL COMMANDS:");
        System.out.println("todo + \"task name\" to add a task");
        System.out.println("deadline + \"task name\" + /by \"task deadline\" to add a task with a deadline");
        System.out.println(
                "event + \"event name\" + /from \"event start time\" + /to \"event finish time\" to add an event with a stant and finish time");
        System.out.println("list to list all events and tasks available");
        System.out.println("mark + \"task number\" to mark an item");
        System.out.println("unmark + \"task number\" to unmark an item");
        System.out.println("delete + \"task number\" to remove an item");
        System.out.println("clear to clear all data in the hard drive");
        System.out.println("find + \"phrase\" to find an item containing the phrase");
    }

    /**
     * Print the Horizontal Line that seperates between different user Inputs
     */
    public void printHorizontalLine() {
        for (int i = 0; i <= 30; i++) {
            System.out.print("_");
        }
        System.out.println();
    }

    /**
     * Print the message for user to signal that Duke cannot understand the input
     */
    public void printfalseInput() {
        System.out.println("Sorry Duke could not understand your input :> please follow the instructions");
        printInstructions();
    }

    /**
     * Print the Greeting when Duke is started
     */
    public void printGreeting() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you ?");
        printHorizontalLine();
        printInstructions();
        printHorizontalLine();
    }

    /**
     * Print the Goodbye message when user exits Duke
     */
    public void printGoodbye() {
        System.out.println("Thanks for using Duke! See ya!");
        System.out.println(" /\\_/\\  ");
        System.out.println("( o.o ) ");
        System.out.println(" > ^ <  ");
    }

}
