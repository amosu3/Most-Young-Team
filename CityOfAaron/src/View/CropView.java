/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;
import model.*;
import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
/**
 *
 * @author German De Marco -- CIT 260
 */
public class CropView {
    // Create a Scanner object
private static Scanner keyboard = new Scanner(System.in);   
private static final CityOfAaron theGame = CityOfAaron.getTheGame();
private static CropData cropData = theGame.getCropData();


/**
* The buyLandView method
* Purpose: interface with the user input for buying land
* Parameters: none
* Returns: none
*/

public static void buyLand() {
    
    int price = CropControl.calcLandCost();
    System.out.format("Land is selling for %d bushels per acre.%n", price);
    System.out.print("How many acres of land do you wish to buy?");
    
    int toBuy;
    toBuy = keyboard.nextInt();
    
    CropControl.buyLand(toBuy, price, cropData);
    
    System.out.format("You now own%d acres of land.", cropData.getAcresOwned());
    
}
/**
* The runCropsView method
* Purpose: interface with the user input for buying land
* Parameters: none
* Returns: none
*/
    public static void runCropsView() {
    
        buyLand();
        sellLandView();
        feedPeopleView();
        plantCropsView();
        displayCropsReportView();
    }

/**
* The displayCropsReportView method
* Purpose: interface with the user input for buying land
* Parameters: none
* Returns: none
*/
    
     public static void displayCropsReportView(){}
/**
* The sellLandView method
* Purpose: interface with the user input for buying land
* Parameters: none
* Returns: none
*/
     
      public static void sellLandView() {}
/**
* The plantCropsView method
* Purpose: interface with the user input for buying land
* Parameters: none
* Returns: none
*/
      
      public static void plantCropsView(){}
      
      
/**
* The feedPeopleView method
* Purpose: interface with the user input for buying land
* Parameters: none
* Returns: none
*/
      public static void feedPeopleView() {}
      
    
}
