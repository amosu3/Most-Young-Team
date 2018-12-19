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
import exceptions.CropException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jaryger
 */
public class GameMenuView extends MenuView {

    Scanner keyboard = new Scanner(System.in);

    public GameMenuView() {

        super("\n"
                + "**********************************\n"
                + "* CITY OF AARON: Game Menu *\n"
                + "**********************************\n"
                + " 1 - View Map \n"
                + " 2 - View List \n"
                + " 3 - Move to Another Location \n"
                + " 4 - Manage Crops\n"
                + " 5 - Quit\n",
                5);

    }

    /**
     *
     * @param GameMenuViewOptions
     */
    @Override
    public void doAction(int GameMenuViewOptions) {

        switch (GameMenuViewOptions) {
            case 1:  // MAP
                viewMap();
                break;
            // dgw
            case 2: // List
                viewList();
                break;
            case 3: {
            try {
                // Location
                moveToNewLocation();
            } catch (Exception ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case 4:{
            try {
                // MOVE
                manageCrops();
            } catch (CropException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case 5:
                System.out.println("Exit From MENU");
        }

    }

    /**
     *
     */
    @SuppressWarnings("empty-statement")
    public void viewMap() {

        Map theMap = (Map) CityOfAaron.getTheGame().getMap();
        Location loc = new Location();

        System.out.println("\t*** VILLAGE MAP ***\n");
        System.out.print("      1     2     3     4     5");

        for (int i = 0; i < 5; i++) {

            int row = i + 1;
            System.out.print("\n " + row + " | ");
            for (int x = 0; x < 5; x++) {

                loc = theMap.getLocation(i, x);
if ( x != 5) {
    

   String printLocation = loc.getSymbol() + " | "; 
}

else {
    
    String printLocation = loc.getSymbol() +  " | " ;

} 


}
}
System.out.println("~~~ - River");
System.out.println("!!! - Wheat ");
System.out.println("oOo - Village");
System.out.println("... - Desert");        
        }


    /**
     *
     */
    public void moveToNewLocation() throws Exception {

           int row;
        do {
            // dgw switched the order of the next 2 statements
            System.out.println("\n Enter the coordinates of the location you want to move to. \n"
                                + "Enter the x-coordinate: "
                                +  "Enter the Y-coordinate: "
            );
            row = keyboard.nextInt();
            if (row < 1 || row > 4) {
            System.out.format("\nPlease enter an option between 1 - 5: ", max);

            }

        } while (row < 1 || row > 4);
        
        
        
    }

    /**
     *
     */
    public void viewList() {

        // dgw
        ListMenuView listMenu = new ListMenuView();
        listMenu.displayMenu();

    }

    /**
     *
     */
    public void manageCrops() throws CropException {
        CropView.runCropsView();
    }

}
