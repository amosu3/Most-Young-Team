/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import View.*;
import model.Game;
import control.*;
import model.CropData;
import model.Map;

/**
 *
 * @author De Marco German
 */
public class CityOfAaron {
// dgw  private static CityOfAaron theGame = null;
    private static Game theGame = null;


 // dgw  public static CityOfAaron getTheGame() {
 public static Game getTheGame() {
        return theGame;
    }
    

    public static void setTheGame(Game _Game) {
        // dgw  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        theGame = _Game;
    }

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();
        
}

    public CropData getCropData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Map getMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

