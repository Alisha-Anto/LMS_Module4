package com.ust.module4.ass1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListApp {

	private static List<String> taskList = new ArrayList<>();
	private static int taskCount = 0;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int choice;

		do {
			System.out.println("\n--- To-Do List Menu ---");
			System.out.println("1. Add a Task");
			System.out.println("2. View Tasks");
			System.out.println("3. Remove a Task");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter task Name: ");
				String task = scanner.nextLine();
				addTask(task);
				break;
			case 2:
				viewTasks();
				break;
			case 3:
				removeTask();
				break;
			case 4:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice, try again.");
			}
		} while (choice != 4);

		scanner.close();
	}

	public static String addTask(String task) {

		
		if (taskList.contains(task)) {
			System.err.println("Task already exists... Sorry");
		} else {
			taskList.add(task);
			taskCount++;
			System.out.println("Task added successfully.");
		}
		return "Task added successfully.";
	}

	public static List<String> viewTasks() {
		if (taskCount == 0) {
			System.out.println("No tasks in the list.");
			return null;
		}

		System.out.println("\n--- Your Tasks ---");
		for (String task : taskList) {
			System.out.println(task);

		}
		return taskList;
	}

	public static String removeTask() {
		if (taskCount == 0) {
			System.out.println("No tasks to remove.");
			return null;
		}
		System.out.print("Enter task name to remove: ");
		String removeTask = scanner.nextLine();
		if (taskList.contains(removeTask)) {
			taskList.remove(removeTask);
			System.out.println("Task removed successfully.");
			taskCount--;
		} else {
			System.err.println("Task not Valid");
		}
		return "Task removed successfully.";

	}
}
