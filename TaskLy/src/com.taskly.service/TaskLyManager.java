package com.taskly.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.taskly.model.Priority;
import com.taskly.model.Tasks;

public class TaskLyManager {
    public static void main(String[] args) {
        
        TasksManager tasksManager = new TasksManager(); 
        Scanner sc = new Scanner(System.in); 
       
        while (true) {
            System.out.print("\n-------------------WELCOME TO APP TASKLY MANAGER------------------\n");

            System.out.println("## OPTIONS ##");

            System.out.println("Option 1: Add task");
            System.out.println("Option 2: List task");
            System.out.println("Option 3: Edit task");
            System.out.println("Option 4: Remove task");
            System.out.println("Option 5: Mark task");
            System.out.println("Option 6: Filter by date");
            System.out.println("Option 7: Filter by priority");
            System.out.println("Option 8: Exit");

            int option = 0; 

            switch (option) {
                case 1:
                    System.out.print("Enter task id: ");
                    int id = sc.nextInt(); 

                    System.out.print("Enter the task title: ");
                    String title = sc.nextLine(); 

                    System.out.print("Enter the task description: ");
                    String description = sc.nextLine();

                    System.out.print("Enter the task due date - (dd/mm/aaaa): ");
                    String dueDate1 = sc.nextLine(); 
                    DateTimeFormatter format = DateTimeFormatter.ofPattern("(dd/MM/yyy)"); 
                    LocalDate dateF = LocalDate.parse(dueDate1, format); 
                    String dateOrigin = dateOrigin.format(format); 
                    LocalDate dueDate = dateOrigin;

                    System.out.println("PRIORITY: (HIGH, AVERAGE, LOW)");
                    String priority1 = sc.nextLine(); 
                    Priority priority = Priority.valueOf(priority1.toUpperCase()); 

                    Tasks tasks = new Tasks(id, title, description, priority, dueDate, false);
                    tasksManager.addTask(tasks);
                    break;
                
                case 2: 
                    List<Tasks> tasks2 = tasksManager.listTasks(); 
                    for (Tasks task : tasks2) {
                        System.out.println(task);
                    }
                    break;
            
                default:
                    break;
            }

        }


    }
    
}