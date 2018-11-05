/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

// The Main Menu view class - part of the view layer
// Object of this class manage the main menu
// Author: Jones, Smith, Brown team
// Date last modified: January 2018
//
public class MainMenuView {

    public MainMenuView() {
        this.theMenu = theMenu;
        theMenu = "\n"
                + "**********************************\n"
                + "* CITY OF AARON: MAIN GAME MENU *\n"
                + "**********************************\n"
                + " 1 - Start new game\n"
                + " 2 - Get and start a saved game\n"
                + " 3 - Get help on playing the game\n"
                + " 4 - Save game \n"
                + " 5 - Quit \n";
        max = 5;

    }

    Scanner keyboard = new Scanner(System.in);
    private String theMenu;
    private int max;

    /**
     *
     */
    public void displayMenu() {
        int menuOption;
        do {
            // Display the menu
            System.out.println(theMenu);
// Prompt the user and get the user’s input
            menuOption = getMenuOption();

// Perform the desired action
            doAction(menuOption);

// Determine and display the next view
        } while (menuOption != max);

    }

    /**
     *
     *
     * @return
     */
    public int getMenuOption() {
        int userInput;

        do {
            userInput = keyboard.nextInt();

            if (userInput < 1 || userInput > max) {

                System.out.println(“Option must be between 1 and " + max);
           }
            
        } while (userInput < 1 || userInput > max );
        
    return userInput; 
    }
 /**
  * 
  */
    
    public  void doAction(int option){
        
       
        
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
