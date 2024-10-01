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

            // Imprimindo as opções
            System.out.println("Option 1: Add task");
            System.out.println("Option 2: List task");
            System.out.println("Option 3: Edit task");
            System.out.println("Option 4: Remove task");
            System.out.println("Option 5: Mark task");
            System.out.println("Option 6: Filter by date");
            System.out.println("Option 7: Filter by priority");
            System.out.println("Option 8: Exit");

            System.out.println();

            System.out.print("Enter the option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                // Caso seja escolhida a 1° opção: Adiciona uma nova tarefa
                case 1:
                    System.out.print("Enter task id: ");
                    int id = sc.nextInt();

                    System.out.print("Enter the task title: ");
                    sc.nextLine();
                    String title = sc.nextLine();

                    System.out.print("Enter the task description: ");
                    String description = sc.nextLine();

                    System.out.print("Enter due date - (dd/mm/aaaa): ");
                    String firstDate = sc.nextLine();

                    DateTimeFormatter formatAmerican = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                    LocalDate dueDate = LocalDate.parse(firstDate, formatAmerican);
            
                        System.out.print("PRIORITY: (HIGH, AVERAGE, LOW): ");
                        String priority1 = sc.nextLine();
                        Priority priority = Priority.valueOf(priority1.trim().toUpperCase());

                    Tasks tasks = new Tasks(id, title, description, priority, dueDate);
                    
                    tasksManager.addTask(tasks);
                    System.out.println();
                    break;

                case 2: 
                List<Tasks> listTasks1 = tasksManager.listTasks();
                for (Tasks task : listTasks1) {
                    System.out.println(task);
                }
                break;

                case 3: 
                System.out.print("Enter task id: ");
                 id = sc.nextInt();

                System.out.print("Enter the task new title: ");
                sc.nextLine();
                String newTitle = sc.nextLine(); 

                System.out.print("Enter the task new description: ");
                String newDescription = sc.nextLine();

                System.out.print("Enter new due date - (dd/mm/aaaa): ");
                String newFirstDate = sc.nextLine();

                DateTimeFormatter formatAmerican2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                LocalDate newDueDate = LocalDate.parse(newFirstDate, formatAmerican2);


                System.out.print("PRIORITY: (HIGH, AVERAGE, LOW): ");
                String priority2 = sc.nextLine();
                Priority newPriority = Priority.valueOf(priority2.trim().toUpperCase());
                
                Tasks tasks2 = new Tasks(id, newTitle, newDescription, newPriority, newDueDate);
                break;


                case 4: 
                System.out.print("Enter task id: ");
                id = sc.nextInt();
                tasksManager.removeTask(id);
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