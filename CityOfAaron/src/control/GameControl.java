/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;




import cityofaaron.CityOfAaron;
import model.*;
import View.*;
/**
 *
 * @author jaryger
 */
public class GameControl {
private static final int MAX_ROW = 5;
private static final int MAX_COL = 5;

private static Game theGame;
private static CropData CropData;

    public static void createNewGame(String name) 
    {

        theGame = new Game();
        cityofaaron.CityOfAaron.setTheGame(theGame);
        
        Player thePlayer = new Player();
        String playerName = null;
        thePlayer.setName(playerName);
       
        model.Player.setThePlayer(thePlayer);

        CropData cropData = new CropData();

        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setAcresPlanted(1000);
        
        
        Game.setCropData(cropData);
        
        cityofaaron.CityOfAaron.setTheGame(theGame);
    }

 
    }