package com.taskly.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.taskly.model.Priority;
import com.taskly.model.Tasks;

public class TaskLyManager {
    public static void main(String[] args) {
        Tasks task = new Tasks();
        TasksManager manager = new TasksManager(); 
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Edit task");
            System.out.println("4. Mark as complete");
            System.out.println("5. List task");
            System.out.println("6. Filter by date");
            System.out.println("7. Filter by priority");
            System.out.println("8. Exit");
        

        System.out.println("Enter option");
        int option = sc.nextInt(); 
        sc.nextLine();
        

        switch (option) {
            case 1:
                System.out.print("Enter id: ");
                int id = sc.nextInt();

                System.out.print("Enter title: ");
                String title = sc.nextLine();
            
                System.out.print("Enter description: ");
                String description = sc.nextLine();

                System.out.print("Enter due date - (dd/mm/aaaa): ");
                String firstDate = sc.nextLine(); 
                DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dueDate = LocalDate.parse(firstDate, format1);

                System.out.print("Priority - (High, Average, Low): ");
                String newPriority = sc.nextLine();
                Priority priority = Priority.valueOf(newPriority.toUpperCase());

                Tasks newTasks = new Tasks(id, title, description, dueDate, priority);

              System.out.println(task.toString());
                break;
        
            default:
                break;
        }
    }
    }
}
