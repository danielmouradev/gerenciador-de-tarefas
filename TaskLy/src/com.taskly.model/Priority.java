package com.taskly.model;

public enum Priority{
    HIGH ("High"),
    AVERAGE ("Average"),
    LOW ("Low"); 

    private String tipePriority; // Atributos

    //Construtores (vazio e com parâmetros)
    
     Priority (String tipePriority){
        this.tipePriority = tipePriority; 
     }


     //Getter's e Setter's

    
    public String getTipePriority() {
        return tipePriority;
    }

    
    public void setTipePriority(String tipePriority) {
            this.tipePriority = tipePriority; 
    }

    //Para deixar a palavra maiúscula
    public String getTyppCapital(){
        return tipePriority.toUpperCase();
    }

}


