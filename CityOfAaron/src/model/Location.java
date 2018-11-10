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
public class Location implements Serializable {
    
    private String description;
    private String symbol;

    /**
     *
     * @return
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     *
     * @param symbol
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
