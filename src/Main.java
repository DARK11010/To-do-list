
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int choice,taskr;

        ArrayList<String> tasks = new ArrayList<String>();
do {
    System.out.println("To-Do List:\n" +
            "1. Add Task\n" +
            "2. View Tasks\n" +
            "3. Remove Task\n" +
            "4. Clear All Tasks\n" +
            "5. Exit\n");

    choice = read.nextInt();
    read.nextLine();
    switch (choice) {
        case 1:
            System.out.println("Enter the task: ");
            tasks.add(read.nextLine());
            break;
        case 2:
            System.out.println("Your Tasks:");
            for (int i = 0; i < tasks.size(); i++)
                System.out.println(i+1 + ". " + tasks.get(i));

            System.out.println("");

            break;
        case 3:
            System.out.print("Enter the task number to remove: ");
            taskr = read.nextInt();
            tasks.remove(taskr-1);
            System.out.println("Task removed!");
            break;
        case 4:
            tasks.clear();
            System.out.println("All tasks cleared!");
            break;
        case 5:
            System.out.println("Goodbye!");
            break;
        default:
            System.out.println("wrong input");
    }

}while (choice != 5);



    }




}