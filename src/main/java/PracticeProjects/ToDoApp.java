package PracticeProjects;

import java.util.Scanner;

//Task class to store task details
class Task {
 String taskName;
 String taskDate;
 String taskDuration;

 // Constructor to initialize a task
 public Task(String taskName, String taskDate, String taskDuration) {
     this.taskName = taskName;
     this.taskDate = taskDate;
     this.taskDuration = taskDuration;
 }

 // Method to display task details
 public void displayTask() {
     System.out.println("Task Name: " + taskName);
     System.out.println("Task Date: " + taskDate);
     System.out.println("Task Duration: " + taskDuration);
     System.out.println("---------------------------");
 }
}

//ToDoList class to manage tasks
class ToDoList {
 private Task[] tasks;
 private int taskCount;

 // Constructor to initialize the ToDoList
 public ToDoList(int size) {
     tasks = new Task[size];
     taskCount = 0;
 }

 // Method to add a task to the list
 public void addTask(String taskName, String taskDate, String taskDuration) {
     if (taskCount < tasks.length) {
         tasks[taskCount] = new Task(taskName, taskDate, taskDuration);
         taskCount++;
         System.out.println("Task added successfully.");
     } else {
         System.out.println("Task list is full. Cannot add more tasks.");
     }
 }

 // Method to remove a task by task name
 public void removeTask(String taskName) {
     boolean found = false;
     for (int i = 0; i < taskCount; i++) {
         if (tasks[i].taskName.equalsIgnoreCase(taskName)) {
             // Shift tasks to the left after removal
             for (int j = i; j < taskCount - 1; j++) {
                 tasks[j] = tasks[j + 1];
             }
             tasks[taskCount - 1] = null;  // Clear the last task
             taskCount--;
             found = true;
             System.out.println("Task removed successfully.");
             break;
         }
     }
     if (!found) {
         System.out.println("Task not found.");
     }
 }

 // Method to display all tasks
 public void displayTasks() {
     if (taskCount == 0) {
         System.out.println("No tasks to display.");
     } else {
         System.out.println("Tasks in your To-Do List:");
         for (int i = 0; i < taskCount; i++) {
             tasks[i].displayTask();
         }
     }
 }
}

//Main class to run the ToDoList application
public class ToDoApp {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     ToDoList toDoList = new ToDoList(10);  // Initializing with a size of 10 tasks

     while (true) {
         System.out.println("To-Do List Menu:");
         System.out.println("1. Add Task");
         System.out.println("2. Remove Task");
         System.out.println("3. Display Tasks");
         System.out.println("4. Exit");
         System.out.print("Choose an option: ");
         int option = scanner.nextInt();
         scanner.nextLine();  // Consume newline

         switch (option) {
             case 1:
                 System.out.print("Enter task name: ");
                 String taskName = scanner.nextLine();
                 System.out.print("Enter task date (YYYY-MM-DD): ");
                 String taskDate = scanner.nextLine();
                 System.out.print("Enter task duration (e.g., 2 hours): ");
                 String taskDuration = scanner.nextLine();
                 toDoList.addTask(taskName, taskDate, taskDuration);
                 break;
             case 2:
                 System.out.print("Enter task name to remove: ");
                 String removeTaskName = scanner.nextLine();
                 toDoList.removeTask(removeTaskName);
                 break;
             case 3:
                 toDoList.displayTasks();
                 break;
             case 4:
                 System.out.println("Exiting the To-Do List application.");
                 scanner.close();
                 return;
             default:
                 System.out.println("Invalid option. Please try again.");
         }
     }
 }
}

