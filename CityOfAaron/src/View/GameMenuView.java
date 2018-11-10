/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import java.util.Scanner;
import model.*;
import control.GameControl;
/**
 *
 * @author jaryger
 */
public class GameMenuView {
    Scanner keyboard = new Scanner(System.in);
    private String gameMenuView;
    private int max;
    
    
    
    public  GameMenuView(){
    
      gameMenuView = "\n"
                + "**********************************\n"
                + "* CITY OF AARON: Game Menu *\n"
                + "**********************************\n"
                + " 1 - View Map \n"
                + " 2 - View List \n"
                + " 3 - Move to Another Location \n"
                + " 4 - Manage Crops"
                + " 5 - Quit\n";
        max = 5;
    
    
    }
    
    public void doAction(int GameMenuViewOptions) { 
        
        switch (GameMenuViewOptions) {
            case 1:  // MAP
                viewMap();
                break;
            case 2: // Location
                moveToNewLocation();
                break;
            case 3: // List
                viewList();
                break;
            case 4:// MOVE 
               manageCrops();
                break;
            case 5:
                System.out.println("Exit From MENU");
        }
        
        
    
    }
    
    public void displayGameMenuView() {
    
        int gameMenuView;
        do {

            System.out.println();
            gameMenuView =  getGameMenuView();
            doAction(gameMenuView);

        } while (gameMenuView != max);
    
    }
    
    
    public int getGameMenuView() {
    
            int userInput;
        do {

            userInput = keyboard.nextInt();

            if (userInput < 1 || userInput > max) {
                System.out.println("Option must be between 1 and " + max);

            }

        } while (userInput < 1 || userInput > max);
        return userInput;
    
    }
    
    public void viewMap(){

    }
    
    public void moveToNewLocation() {
        
    }
    
    public void viewList() {
    
   View.ListMenuView.ListMenuView();
    
    }
    
    public void manageCrops() {
    
    
    }
    
   
    
}

