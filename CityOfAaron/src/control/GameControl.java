/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Game;
import model.Player;
import model.CropData;
import cityofaaron.CityOfAaron;

/**
 *
 * @author jaryger
 */
public class GameControl {

    public static void createNewGame(String name) 
    {
        Game game = new Game();
        Player Player = new Player();
        
        Player.setName(name);
       CityOfAaron.setThePlayer(Player);

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
        game.setCropData(cropData);
        CityOfAaron.setGame(game);
    }

 
    }

}
