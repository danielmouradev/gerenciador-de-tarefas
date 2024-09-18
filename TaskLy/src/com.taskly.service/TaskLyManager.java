package com.taskly.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.taskly.model.Priority;
import com.taskly.model.Tasks;

public class TaskLyManager {
    public static void main(String[] args) {
        TasksManager tasksManager = new TasksManager(); 
        Scanner sc = new Scanner(System.in);


        System.out.println();


        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Edit task");
            System.out.println("4. Mark as complete");
            System.out.println("5. List task");
            System.out.println("6. Filter by date");
            System.out.println("7. Filter by priority");
            System.out.println("8. Exit");
        

        System.out.print("\nEnter option: ");
        int option = sc.nextInt(); 
        sc.nextLine();
        
        System.out.println();

        switch (option) {
            case 1:
                System.out.print("Enter id: ");
                int id = sc.nextInt();

                System.out.print("Enter title: ");
                sc.nextLine();
                String title = sc.nextLine();
            
                System.out.print("Enter description: ");
                String description = sc.nextLine();

                System.out.print("Enter due date - (dd/mm/aaaa): ");
                String firstDate = sc.nextLine(); 
                DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dueDate = LocalDate.parse(firstDate, format1);

                System.out.print("Priority - (High, Average, Low): ");
                String priorityStr = sc.nextLine();

                Priority priority = Priority.valueOf(priorityStr.toUpperCase());

                Tasks task = new Tasks(id, title, description, dueDate, priority);

                System.out.println(task.toString());
                //tasksManager.addTask(task);

                break;
        


                case 8: 
                System.out.println("Até mais!");
                sc.close();
                System.exit(8);
                break;
        }
    }
    }
}
