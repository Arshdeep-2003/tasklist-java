package assignment1;
import java.util.ArrayList;
public class TaskList {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        tasks.add(new Task(description));
        System.out.println("Task added.");
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void viewTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }

    public void viewStatistics() {
        int totalTasks = tasks.size();
        int completedTasks = (int) tasks.stream().filter(Task::isCompleted).count();
        double completionPercentage = totalTasks > 0 ? (completedTasks / (double) totalTasks) * 100 : 0;

        System.out.println("Total tasks: " + totalTasks);
        System.out.println("Completed tasks: " + completedTasks);
        System.out.println("Completion percentage: " + completionPercentage + "%");
    }

    public void sortTasksByCompletionStatus() {
        tasks.sort((t1, t2) -> Boolean.compare(t2.isCompleted(), t1.isCompleted()));
        System.out.println("Tasks sorted by completion status.");
    }
}
