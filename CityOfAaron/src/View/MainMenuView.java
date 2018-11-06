/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import cityofaaron.CityOfAaron;
import java.util.Scanner;

/**
 *
 * @author jaryger
 */
public class MainMenuView {

    Scanner keyboard = new Scanner(System.in);
    private String theMenu;
    private int max;

    /**
     *
     */
    public MainMenuView() {

        theMenu = "\n"
                + "**********************************\n"
                + "* CITY OF AARON: MAIN GAME MENU  *\n"
                + "**********************************\n"
                + " 1 - Start new game\n"
                + " 2 - Get and start a saved game\n"
                + " 3 - Get help on playing the game\n"
                + " 4 - Save game\n"
                + " 5 - Quit\n";
        max = 5;
    }

    public void displayMenu() {
        int menuOption;
        do {

            System.out.println(theMenu);
            menuOption = getMenuOption();
            doAction(menuOption);

        } while (menuOption != max);

    }

    public int getMenuOption() {

        int userInput;
        do {

            userInput = keyboard.nextInt();

            if (userInput < 1 || userInput > max) {
                System.out.println("Option must be between 1 and " + max);

            }

        } while (userInput < 1 || userInput > max);
        return userInput;
    }

    public void doAction(int option) {

        switch (option) {
            case 1:  // create and start a new game
                startNewGame();
                break;
            case 2: // get and start a saved game
                startSavedGame();
                break;
            case 3: // get help menu
                displayHelpMenuView();
                break;
            case 4:// save game
                displaySaveGameView();
                break;
            case 5:
                System.out.println("Thanks for playing... goodbye");

        }

    }

    public void startNewGame() {

        /**
         * The startNewGame method Purpose: creates game object and starts the
         * game Parameters: none Returns: none
         */
         // ===================================     
        System.out.println("Start a new game option selected. ");

    }

    public void startSavedGame() {

    }

    public void displayHelpMenuView() {

    }

    public void displaySaveGameView() {
        
        System.out.println("Welcome to the city of Aaron.");
  
        // Call the CreateNewGame() method in the GameControlclass
        // Display a welcome message
        // Display the Game menu
        
        String name;
        System.out.println("Please type in you first name:  ");
        name = keyboard.next();
        
        // Call the createNewGame() method in the GameControl class
        GameControl.createNewGame();
        
        // Display a welcome message

        
        System.out.println("Welcome" + name + "have fun!!!");
        
        // Display the Game menu
        
    }
}
