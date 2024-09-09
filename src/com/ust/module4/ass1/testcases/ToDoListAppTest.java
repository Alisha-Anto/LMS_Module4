package com.ust.module4.ass1.testcases;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ust.module4.ass1.ToDoListApp;

class ToDoListAppTest {
    
    @BeforeEach
    void setUp() {
        // Reset the task array before each test
        ToDoListApp.addTask("Task 1");  // Add a sample task to start
        ToDoListApp.addTask("Task 2");  // Add another task
    }

    @Test
    void testAddTask() {
        String result = ToDoListApp.addTask("Task 3");
        assertEquals("Task added successfully.", result);

       List<String> tasks = ToDoListApp.viewTasks();
        assertEquals(3, tasks.size());
       
    }

    @Test
    void testViewTasks() {
    	List<String> tasks = ToDoListApp.viewTasks();
        assertEquals(2, tasks.size());
        assertEquals("Task 1", tasks.get(0));
        assertEquals("Task 2", tasks.get(1));
    }

	/*
	 * @Test void testRemoveTask() { String result = ToDoListApp.removeTask(); //
	 * Remove the first task assertEquals("Task removed successfully.", result);
	 * 
	 * List<String> tasks = ToDoListApp.viewTasks(); assertEquals(1, tasks.size());
	 * assertEquals("Task 2", tasks.get(1)); // Task 2 should now be in position 1 }
	 */

   
}


