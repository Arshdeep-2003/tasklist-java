package assignment1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View Tasks");
            System.out.println("5. View Statistics");
            System.out.println("6. Sort Tasks by Completion Status");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskList.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task index to remove: ");
                    int indexToRemove = scanner.nextInt();
                    taskList.removeTask(indexToRemove);
                    break;
                case 3:
                    System.out.print("Enter task index to mark as completed: ");
                    int indexToMark = scanner.nextInt();
                    taskList.markTaskAsCompleted(indexToMark);
                    break;
                case 4:
                    taskList.viewTasks();
                    break;
                case 5:
                    taskList.viewStatistics();
                    break;
                case 6:
                    taskList.sortTasksByCompletionStatus();
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}


