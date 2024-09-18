package com.taskly.model;

import java.time.LocalDate;

public class Tasks {

    private int id; 
    private String title; 
    private String description; 
    private Priority priority; 
    private LocalDate dueDate; 
    private boolean completed;

    //constructors
    public Tasks(int id, String title, String description, Priority priority, LocalDate dueDate){
        this.id = id; 
        this.title = title; 
        this.description = description; 
        this.priority = priority; 
        this.dueDate = dueDate;
        this.completed = false;
    }

    

    
    //Getter's and Setter's
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getDescription() {
        return description;
    }

   
    public void setDescription(String description) {
        this.description = description;
    }

    
    public Priority getPriority() {
        return priority;
    }

    
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    
    public boolean isCompleted() {
        return completed;
    }

    
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}