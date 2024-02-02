# To-Do List Application in Java

## Introduction
This application is a simple to-do list manager. It allows users to add tasks, remove tasks, and view their to-do list in a console-based interface.

## Features
- Add tasks to the to-do list.
- Remove tasks from the list.
- View all tasks in the list.
- Simple and intuitive user interface.

## How to Compile and Run
1. Compile the Java files:
2. Run the to-do list application:
3. Use the provided options to manage your to-do list.

## Example Usage
- Choose an option: `1` (to add a task)
- Enter a task: `Buy groceries`
- Choose an option: `3` (to view tasks)
- To-do List:
1. Buy groceries


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoList {
    private final List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.remove(taskIndex);
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("To-do list is empty.");
        } else {
            System.out.println("To-do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}

import java.util.Scanner;

public class TodoListManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            System.out.println("Choose an option: (1) Add Task (2) Remove Task (3) Show Tasks (4) Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a task to add: ");
                    String taskToAdd = scanner.nextLine();
                    todoList.addTask(taskToAdd);
                    break;
                case 2:
                    System.out.print("Enter the task number to remove: ");
                    int taskIndex = scanner.nextInt() - 1;
                    todoList.removeTask(taskIndex);
                    break;
                case 3:
                    todoList.displayTasks();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
