package com.ust.module4.ass1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ToDoListAppArray {

	private static String[] taskArray = new String[10];
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
		
		for (int i = 0; i < taskArray.length; i++) {
			if (taskArray[i] == null) {
				taskArray[i] = task;
				break;
			}
		}
		
		taskCount++;
		System.out.println("Task added successfully.");
	}

	private static void viewTasks() {
		if (taskCount == 0) {
			System.out.println("No tasks in the list.");
			return;
		}
		
		System.out.println("\n--- Your Tasks ---");
		for (String task : taskArray) {
			if(task!= null)
			System.out.println(task);
			
		}

	}

	private static void removeTask(Scanner scanner) {
		if (taskCount == 0) {
			System.out.println("No tasks to remove.");
			return;
		}
		System.out.print("Enter task name to remove: ");
		String removeTask = scanner.nextLine();
		for (int i = 0; i < taskArray.length; i++) {
			if(removeTask.equals(taskArray[i])) {
				taskArray[i]=null;
				System.out.println(removeTask+" Removed Successfully");
			}
		}

	}
}
