/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import cityofaaron.CityOfAaron;
import java.util.Scanner;
import model.*;
import control.GameControl;

/**
 *
 * @author jaryger
 */




public class HelpMenuView {
    Scanner keyboard = new Scanner(System.in);
    private String helpMenuView;
    private int max;
    
    
    
    public  HelpMenuView(){
    
      helpMenuView = "\n"
                + "**********************************\n"
                + "* CITY OF AARON: HELP GAME MENU  *\n"
                + "**********************************\n"
                + " 1 - Start new game\n"
                + " 2 - View Goals \n"
                + " 3 - View Move Help\n"
                + " 4 - View List Help"
                + " 5 - Quit\n";
        max = 5;
    
    
    }
    
    public void doAction(int helpMenuOption) { 
        
        switch (helpMenuOption) {
            case 1:  // GOALS
                viewGoals();
                break;
            case 2: // MAP
                viewMapHelp();
                break;
            case 3: // HELP LIST
                viewListHelp();
                break;
            case 4:// MOVE 
                viewMoveHelp();
                break;
            case 5:
                System.out.println("Thanks for playing... goodbye");
        }
        
        
    
    }
    
    public void displayMenu() {
    
        int helpMenuOption;
        do {

            System.out.println(helpMenuView);
            helpMenuOption = getMenuHelpOption();
            doAction(helpMenuOption);

        } while (helpMenuOption != max);
    
    }
    
    
    public int getMenuHelpOption() {
    
            int userInput;
        do {

            userInput = keyboard.nextInt();

            if (userInput < 1 || userInput > max) {
                System.out.println("Option must be between 1 and " + max);

            }

        } while (userInput < 1 || userInput > max);
        return userInput;
    
    }
    
    public void viewGoals(){
    
      System.out.print("\n"
      + "**********************************\n"  
      + "* CITY OF AARON: GOALS  *\n"  
      + "**********************************\n"
      + " 1 - GOAL 1\n"
     + " 2 - GOAL 2 \n"
     + " 3 - GOAL 3\n"
     + " 4 - GOAL 4"
     + " 5 - Quit\n");
               
        max = 5;
    
    
    }
    
    public void viewMapHelp() {
          System.out.print("\n"
      + "**********************************\n"  
      + "* CITY OF AARON: HELP             *\n"  
      + "**********************************\n"
      + " 1 - HELP  1\n"
     + " 2 - HELP 2 \n"
     + " 3 - HELP 3 \n"
     + " 4 - HELP 4"
     + " 5 - Quit\n");
               
        max = 5;}
    
    public void viewMoveHelp() {
    
          System.out.print("\n"
      + "**********************************\n"  
      + "* CITY OF AARON: Move HELP        *\n"  
      + "**********************************\n"
      + " 1 - Move Help 1\n"
     + " 2 - Move Help  \n"
     + " 3 - Move Help \n"
     + " 4 - Move Help \n"
     + " 5 - Move Help \n");
               
        max = 5;
    
    }
    
    public void viewListHelp() {
    
    System.out.print("\n"
      + "**********************************\n"  
      + "* CITY OF AARON: List Help        *\n"  
      + "**********************************\n"
      + " 1 - List Help \n"
     + " 2 - List Help  \n"
     + " 3 - List Help \n"
     + " 4 - List Help \n"
     + " 5 - List Help \n");
               
        max = 5;
    
    
    
    }
    
    
    
}
