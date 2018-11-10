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
public class ListMenuView {
    
     Scanner keyboard = new Scanner(System.in);
    private String listMenuView;
    private int max;
    
    
    
    public  ListMenuView(){
    
      listMenuView = "\n"
                + "**********************************\n"
                + "* CITY OF AARON: HELP GAME MENU  *\n"
                + "**********************************\n"
                + " 1 - List Animals \n"
                + " 2 - List Provisions \n"
                + " 3 - List Tools\n"
                + " 4 - List Team"
                + " 5 - Quit\n";
        max = 5;
    
    
    }
    
    public void doAction(int ListMenuOptions) { 
        
        switch (ListMenuOptions) {
            case 1:  // GOALS
                listAnimals();
                break;
            case 2: // MAP
                listProvisions();
                break;
            case 3: // HELP LIST
                listTools();
                break;
            case 4:// MOVE 
                listTeam();
                break;
            case 5:
                System.out.println("Exit from Options");
        }
        
        
    
    }
    
    public void displayMenu() {
    
        int listMenuOptions;
        do {

            System.out.println();
            listMenuOptions = getListMenuOption();
            doAction(listMenuOptions);

        } while (listMenuOptions != max);
    
    }
    
    
    public int getListMenuOption() {
    
            int userInput;
        do {

            userInput = keyboard.nextInt();

            if (userInput < 1 || userInput > max) {
                System.out.println("Option must be between 1 and " + max);

            }

        } while (userInput < 1 || userInput > max);
        return userInput;
    
    }
    
    public void listAnimals(){
    
      System.out.print("\n"
      + "**********************************\n"  
      + "* CITY OF AARON: Animals  *\n"  
      + "**********************************\n"
      + " 1 - Animal 1\n"
     + " 2 - Animal 2 \n"
     + " 3 - Animal 3\n"
     + " 4 - Animal 4"
     + " 5 - Quit\n");
               
        max = 5;
    
    
    }
    
    public void listTools() {
          System.out.print("\n"
      + "**********************************\n"  
      + "* CITY OF AARON: Tool             *\n"  
      + "**********************************\n"
      + " 1 - Tool  1\n"
     + " 2 - Tool 2 \n"
     + " 3 - Tool 3 \n"
     + " 4 - Tool 4"
     + " 5 - Quit\n");
               
        max = 5;}
    
    public void listProvisions() {
    
          System.out.print("\n"
      + "**********************************\n"  
      + "* CITY OF AARON: Provisions      *\n"  
      + "**********************************\n"
      + " 1 - Provision 1\n"
     + " 2 - Provision  2\n"
     + " 3 - Provision 3 \n"
     + " 4 - Provision 4\n"
     + " 5 - Quit\n");
               
        max = 5;
    
    }
    
    public void listTeam() {
    
    System.out.print("\n"
      + "**********************************\n"  
      + "* CITY OF AARON: TEAM            *\n"  
      + "**********************************\n"
      + " 1 - De Marco German \n"
     + " 2 - Amosu   \n"
     + " 3 - Nefi Verduga \n"
     + " 4 - TEAM \n"
     + " 5 - Quien \n");
               
        max = 5;
    
    
    
    }
    
    
    
    
}
