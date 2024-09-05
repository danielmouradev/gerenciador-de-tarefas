package com.taskly.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.taskly.model.Priority;
import com.taskly.model.Tasks;

public class TasksManager {

    

    //Atributo 
    private List <Tasks> tasks; 

    //Construtor que recebe apenas um array list
    public TasksManager(){
        this.tasks = new ArrayList<>();
    }

    // Adiciona tarefa através do objeto task
    public void addTask(Tasks task){
        task.add(task);  
    }

    //remove através de condição (se o id digitado for existente)
    public void removeTask(int id){
        tasks.removeIf(tasks -> tasks.getId() == id); 
        System.out.println("Task " + tasks.getId + " successfully removed");
    }

    public void editTask(int id, Tasks newTask){
        for (Tasks task : tasks) {
            if (task.getId() == id) {
                task.getTitle(newTask.setTitle());
                task.getDescription(newTask.setDescription());
                task.getDueDate(newTask.setDueDate());
                task.getPriority(newTask.setPriority());
            }
        }
    }

    public void markAsCompleted(int id){
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                break;
                System.out.println("Task completed successfully!");
            }
        }
    }

    public List<Tasks> listTasks(){
        return tasks;
    }

    public List<Tasks> filterByDate(LocalDate date){
        return tasks.stream().filter(tasks -> tasks.getDueDate().equals(date))
        .collect(Collectors.toList());
    }

    public List <Tasks> filterByPriority(Priority priority){
        return tasks.stream().filter(tasks -> tasks.getPriority().equals(priority))
        .collect(Collectors.toList());
    }


    
    public List <Tasks> getTasks() {
        return tasks;
    }

   
    public void setTasks(List <Tasks> tasks) {
        this.tasks = tasks;
    }

}