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
       
        //while (true) {
            System.out.print("\n-------------------WELCOME TO APP TASKLY MANAGER------------------\n");

            System.out.println("## OPTIONS ##");
            
            //Imprimindo as opções
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
                //Caso seja escolhida a 1° opção: Adiciona uma nova tarefa
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
                
                    //Caso a 2° opção: Lista as tarefas 
                case 2: 
                    List<Tasks> tasks2 = tasksManager.listTasks(); 
                    for (Tasks task : tasks2) {
                        System.out.println(task);
                    }

                    //Caso a 3° opção: Edita a tarefa
                    case 3: 
                     System.out.print("Enter the id to modify the task: ");
                     id = sc.nextInt();
                     if (id == tasks.getId()) {
                        
                        System.out.print("Enter the new task title: ");
                        String newTitle = sc.nextLine(); 

                        System.out.print("Enter the new task description: ");
                        String newDescription = sc.nextLine();

                        System.out.print("Enter the new task due date - (dd/mm/aaaa): ");
                        String newDueDate1 = sc.nextLine(); 
                        DateTimeFormatter newDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
                        LocalDate formatDateGeral = LocalDate.parse(newDueDate1, newDateFormat); 
                        String dateFinal = dateFinal.format(formatDateGeral); 
                        LocalDate newDueDate = dateFinal;

                        System.out.println("NEW PRIORITY: (HIGH, AVERAGE, LOW)");
                        sc newPriority1 = sc.nextLine(); 
                        
                        
                    // }

                    break;
            
                //default:
                    break;
            }

        }


    }
    
}