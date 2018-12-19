/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.util.Scanner;
/**
 *
 * @author De Marco German
 */
public abstract class MenuView implements ViewInterface

{
       protected final static Scanner keyboard = new Scanner(System.in);
       protected String menu;  
       protected int max; 
       

       /**
        * 
     * @param <error>
     * 
        */
       public MenuView(String _menu, int _max) 
      {
       
           menu = _menu;
           max = _max;
            
       }
       
// The displayMenu method
// Purpose: displays the menu, gets the user's input, and does the 
//  selected action
// Parameters: none
// Returns: none
// ===================================
@Override 
public void displayMenu() {
        int menuOption;
        do {

            System.out.println(menu);
            menuOption = getMenuOption();
            doAction(menuOption);

        } while (menuOption != max);

}

/**
 * 
 * @return 
 */

@Override 
public int getMenuOption() {

        int userInput;
        do {
            // dgw switched the order of the next 2 statements
            System.out.format("Please enter an option(1-%d):", max);
            userInput = keyboard.nextInt();
            if (userInput < 1 || userInput > max) {
            System.out.format("\nPlease enter an option between 1 - %d: ", max);

            }

        } while (userInput < 1 || userInput > max);
        return userInput;
    }

/**
 * 
 * @param option 
 */
 @Override
    public void doAction(int option) {
        // Implement in each class... 
    }
}
