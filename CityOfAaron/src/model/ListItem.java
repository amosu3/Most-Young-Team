/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author demarcogerman
 */
import java.io.Serializable;

/**
 *
 * @author jaryger
 */
public class ListItem implements Serializable {
    
    private String name;
    private int number;

    public ListItem() {
        
       
    }

     public ListItem(String name, int number) {
        this.name = name;
        this.number = number;
    }
    
    
    /**
     *
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     *
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }
    
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
