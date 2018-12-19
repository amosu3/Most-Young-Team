/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author German D. De Marco
 */

import java.io.Serializable;

/**
 *
 * @author jaryger
 */
public class Player implements Serializable{

    /**
     *
     * @param thePlayer
     */
    public static void setThePlayer(Player thePlayer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
private String name;

    /**
     *
     */
    public Player() {
        // dgw throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    /**
     *
     * @param name
     */
    public Player(String name) {
        this.name = name;
    }
    
    }
