package com.taskly.model;

public enum Priority {

    HIGH ("High"), 
    AVERAGE ("Average"), 
    LOW ("Low"); 

    private String tipePriority; 

     Priority (){}; 
     Priority (String tipePriority){
        this.tipePriority = tipePriority;
     }; 



    
    public String getTipePriority() {
        return tipePriority;
    }

    
    public void setTipePriority(String tipePriority) {
        this.tipePriority = tipePriority;
    }

    public String getTyppCapital(){
        return tipePriority.toUpperCase();
    }

}
