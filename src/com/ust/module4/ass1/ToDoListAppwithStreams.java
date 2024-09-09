package com.ust.module4.ass1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListAppwithStreams {

	private static List<String> taskList = new ArrayList<>();
	private static int taskCount = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
				addTask(scanner);
				break;
			case 2:
				viewTasks();
				break;
			case 3:
				removeTask(scanner);
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

	private static void addTask(Scanner scanner) {

		System.out.print("Enter task Name: ");
		String task = scanner.nextLine();
		if (taskList.contains(task)) {
			System.err.println("Task already exists... Sorry");
		} else {
			taskList.add(task);
			taskCount++;
			System.out.println("Task added successfully.");
		}
	}

	private static void viewTasks() {
		if (taskCount == 0) {
			System.out.println("No tasks in the list.");
			return;
		}

		System.out.println("\n--- Your Tasks ---");
		taskList.stream().forEach(System.out::println);
	}

	private static void removeTask(Scanner scanner) {
		if (taskCount == 0) {
			System.out.println("No tasks to remove.");
			return;
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

	}
}
