/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/*
 *
 * @author German De Marco
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author jaryger
 */
public class Game implements Serializable {

  
    private Player  thePlayer;
    private CropData cropData;
    private Map map;
    private ArrayList<ListItem> animals = new ArrayList<>();
    private ArrayList<ListItem> tools = new ArrayList<>();
     private ArrayList<ListItem> provisions = new ArrayList<>();

    /**
     *
     * @return
     */
    public ArrayList<ListItem> getProvisions() {
        return provisions;
    }

    /**
     *
     * @param provisions
     */
    public void setProvisions(ArrayList<ListItem> provisions) {
        this.provisions = provisions;
    }

    /**
     *
     * @return
     */
    public ArrayList<ListItem> getAnimals() {
        return animals;
    }

    /**
     *
     * @param animals
     */
    public void setAnimals(ArrayList<ListItem> animals) {
        this.animals = animals;
    }

    /**
     *
     * @return
     */
    public ArrayList<ListItem> getTools() {
        return tools;
    }

    /**
     *
     * @param tools
     */
    public void setTools(ArrayList<ListItem> tools) {
        this.tools = tools;
    }
    
    /**
     *
     * @return
     */
    public CropData getCropData() {
        return cropData;
    }

    /**
     *
     * @param cropData
     */
    public void setCropData(CropData cropData) {
        this.cropData = cropData;
    }

    /**
     *
     * @return
     */
    public Map getMap() {
        return map;
    }

    /**
     *
     * @param map
     */
    public void setMap(Map map) {
        this.map = map;
    }

    /**
     *
     */
    public Game() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public Player getThePlayer() {
        return thePlayer;
    }

    /**
     *
     * @param thePlayer
     */
    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    /**
     *
     * @param thePlayer
     */
    public Game(Player thePlayer) {
        this.thePlayer = thePlayer;
    }
    
    
 
}
