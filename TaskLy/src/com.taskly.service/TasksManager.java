package com.taskly.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.taskly.model.Tasks;

public class TasksManager {

    //list type attribute with the class
    private List<Tasks> tasks;

    //builder who receives ArrayList
    public TasksManager(){
        this.tasks = new ArrayList<>();
    }

    public void addTask(Tasks task){
        tasks.add(task);
        System.out.println("Task added successfully");
    }

    public void removeTask(int id){
        tasks.removeIf(tasks -> tasks.getId() == id);
        System.out.println("Task removed successfully");
    }

    public void editTask(int id, Tasks newTask){
        for (Tasks task : tasks) {
            if (task.getId() == id) {
                task.getTitle(newTask.setTitle());
                task.getDescription(newTask.setDescription());
                task.getDueDate(newTask.setDueDate());
                task.getPriority(newTask.setPriority());
                System.out.println("Task edited successfully");                
                break;
            }
        }
    }

    public List<Tasks> listTasks(){
        return tasks;
    }

    public void markTask(int id){
        for (Tasks task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                System.out.println("Task marked as completed");
            }
        }
    }

    public List<Tasks> filterByDate(LocalDate date){
        return tasks.stream()
        .filter(tasks -> tasks.getDueDate().equals(date))
        .collect(Collectors.toList());
    }

    private List<Tasks> filterByPriority(Priority priority){
        return tasks.stream()
        .filter(tasks -> tasks.getPriority().equals(priority))
        .collect(Collectors.toList());
    }

     

}