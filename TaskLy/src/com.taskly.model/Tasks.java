package com.taskly.model;

import java.time.LocalDate;

public class Tasks {

    private int id; 
    private String title; 
    private String description; 
    private LocalDate dueDate; 
    private Priority priority;
    private boolean completed; 

    //constructor with id and title attributes
    public Tasks(int id, String title){
        this.id = id; 
        this.title = title; 
    }

    //constructor without attributes
    public Tasks(){}

    

    //constructor with all attributes
    public Tasks(int id, String title, String description, LocalDate dueDate, Priority priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.completed = false;
    }



    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return LocalDate return the dueDate
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return Priority return the priority
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    /**
     * @return boolean return the completed
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * @param completed the completed to set
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void compareByDate(){}

    public void compareByPriority(){}

    @Override
    public String toString(){
        return "id: " + getId() + 
        "\nTitle: " + getTitle() + 
        "\nDescription: " + getDescription() + 
        "\nDue date: " + getDueDate() + 
        "\nCompleted (true or false): " + isCompleted();
        }

}