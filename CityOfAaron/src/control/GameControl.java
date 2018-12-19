/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import cityofaaron.CityOfAaron;
import model.*;
import View.*;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author jaryger
 */
public class GameControl {

    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;

    private static Game theGame;
    private static CropData CropData;

    public static void createNewGame(String name) {

        theGame = new Game();
        cityofaaron.CityOfAaron.setTheGame(theGame);
        Game theGame = CityOfAaron.getTheGame();

        Player thePlayer = new Player();
        thePlayer.setName(name);
        theGame.setThePlayer(thePlayer);

        // dgw model.Player.setThePlayer(thePlayer);
        // dgw Need to call the methods to set up the lists
        createAnimalList();
        // Create the other lists.

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

        new Game().setCropData(cropData);

        cityofaaron.CityOfAaron.setTheGame(theGame);
    }

    /**
     *
     *
     */
    public static void createAnimalList() {

        ArrayList<ListItem> animals = new ArrayList<ListItem>();
        animals.add(new ListItem("Cows", 12));
        animals.add(new ListItem("Horses", 3));
        animals.add(new ListItem("Pigs", 7));
        animals.add(new ListItem("Goats", 4));
        animals.add(new ListItem("Chicken", 15));

        theGame.setAnimals(animals);

    }

    /**
     *
     *
     */
    public static void createToolList() {

        ArrayList<ListItem> tools = new ArrayList<ListItem>();
        tools.add(new ListItem("Hammer", 50));
        tools.add(new ListItem("Anvil", 5));
        tools.add(new ListItem("Forge", 2));
        tools.add(new ListItem("Stone", 10));
        tools.add(new ListItem("Rope", 50));

        // Add this following lines
        theGame.setTools(tools);

    }

    /**
     *
     *
     */
    public static void createProvisionsList() {

        ArrayList<ListItem> provisions = new ArrayList<ListItem>();
        provisions.add(new ListItem("Sugar", 100));
        provisions.add(new ListItem("Milk", 50));
        provisions.add(new ListItem("Meat", 35));
        provisions.add(new ListItem("Egg", 200));
        provisions.add(new ListItem("Water", 5000));

        theGame.setProvisions(provisions);

    }

    /**
     * The createMap method Purpose: creates the location objects and the map
     * Parameters: none Returns: none
     */
    public static void createMap() {

// create the Map object,
// refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);
//****************************************************************
//*  River Contains the location and the String
//****************************************************************
        String river = "\nYou are on the River. The river is the source"
                + "\nof life for our city. The river marks the eastern "
                + "\nboundary of the city - it is wilderness to the East.";

        Location loc = new Location();
        loc.setDescription(river);
        loc.setSymbol("~~~");

        for (int i = 0; i < MAX_ROW; i++) {
            theMap.setLocation(i, 4, loc);

        }

//****************************************************************
//* Farmland Contains the location and the String
//****************************************************************
        String farmland = "\nYou are in the fertile farmland."
                + "\nThe river nurishes the soil here,"
                + "\nflooding it in the spring. Wheat can be planted here.";

        loc = new Location();
        loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
        loc.setSymbol("!!!");
        for (int i = 0; i < MAX_ROW; i++) {
            theMap.setLocation(i, 5, loc);

        }

//****************************************************************
//* Mountain Contains the location and the String
//****************************************************************
        String mountain = "\nYou are in the Mountains."
                + "\nThe mountains are far away from the farm,"
                + "\nThe snow cover the mountains high peaks.";

        loc = new Location();
        loc.setDescription(mountain);
        loc.setSymbol("***");
        theMap.setLocation(0, 5, loc);

        for (int i = 0; i < MAX_ROW; i++) {
            theMap.setLocation(i, 6, loc);

        }

//****************************************************************
//* Hills Contains the location and the String
//****************************************************************
        String hills = "\nYou in the hills"
                + "\nThe hills are in a half distance "
                + "\nbetween the mountains and the farm"
                + "\nThe snow cover the mountains high peaks.";

        loc = new Location();
        loc.setDescription(hills);
        loc.setSymbol("???");

        for (int i = 0; i < MAX_ROW; i++) {
            theMap.setLocation(i, 4, loc);

        }

//****************************************************************
//*  Road Contains the location and the String
//****************************************************************
        String road = "\nYou in the hills"
                + "\nThe hills are in a half distance "
                + "\nbetween the mountains and the farm"
                + "\nThe snow cover the mountains high peaks.";

        loc = new Location();
        loc.setDescription(road);
        loc.setSymbol("????");
        for (int i = 0; i < MAX_ROW; i++) {
            theMap.setLocation(i, 7, loc);

        }

        theGame.setMap(theMap);
    }

 /**
* getSavedGame method
* Purpose: load a saved game from disk
* Parameters: the file path
* Returns: none
* Side Effect: the game reference in the driver is updated
*/

    public static void getSavedGame(String filePath) {

        Game theGame = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {

            ObjectInputStream input = new ObjectInputStream(fips);
            theGame = (Game) input.readObject();
            CityOfAaron.setTheGame(theGame);

        } catch (Exception e) {

            System.out.println("There was an error reading the saved game file\n");

        }
    }
 /**
* SaveMethod method
* Purpose: Save an object into the disk
* Parameters: the file path
* Returns: none
* Side Effect:   --
*/
    public static void saveGame(String filePath) {
        Game theGame = CityOfAaron.getTheGame();

        try (FileOutputStream faps = new FileOutputStream(filePath)) {

            ObjectOutputStream output = new ObjectOutputStream(faps);
            output.writeObject(theGame);
            CityOfAaron.setTheGame(theGame);

        } catch (Exception e) {

            System.out.println("There was an error reading the saved game file\n");

        }

    }
}
