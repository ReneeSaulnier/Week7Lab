/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author Renee
 */
public class Role implements Serializable{
    
    private int id;
    private String name;
    
    public Role(){
        
    }
    
    public Role(int id){
        this.id = id; 
    }
    
    public Role(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public Role(String name){
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        
    }
    
}
