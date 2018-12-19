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
import exceptions.CropException;
/**
 *
 * @author German De Marco -- CIT 260
 */
public class CropView {
    // Create a Scanner object
private static Scanner keyboard = new Scanner(System.in);   
private static final Game theGame = CityOfAaron.getTheGame();
private static CropData cropData = theGame.getCropData();


/**
* The buyLandView method
* Purpose: interface with the user input for buying land
* Parameters: none
* Returns: none
     * @throws exceptions.CropException
*/

public static void buyLand() throws CropException {
    Game theGame = CityOfAaron.getTheGame();
    int price = CropControl.calcLandCost();
    System.out.format("Land is selling for %d bushels per acre.%n", price);
    
    
    int toBuy;
    boolean paramsNotOkay;
    do {
    paramsNotOkay = false;
    System.out.print("How many acres of land do you wish to buy?");
    toBuy = keyboard.nextInt();
    
   try {
    
       CropControl.buyLand(price, toBuy, cropData);
    }
   catch(CropException e)
   {
     System.out.println("I am sorry master, I cannot do this.");
     System.out.println(e.getMessage());
      paramsNotOkay = true;
       
   }
    } while(paramsNotOkay);
    
    CropControl.buyLand(toBuy, price, cropData);
    
    System.out.format("You now own%d acres of land.", cropData.getAcresOwned());
    }
    
/**
* The runCropsView method
* Purpose: interface with the user input for buying land
* Parameters: none
* Returns: none
*/
    public static void runCropsView() throws CropException {
    
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
     
      public static void sellLandView() throws CropException {
      
      
      Game theGame = CityOfAaron.getTheGame();
       int price = CropControl.calcLandCost();
    System.out.format("Land is selling for %d bushels per acre.%n", price);
    
    
    int toSellLand;
    boolean paramsNotOkay;
    do {
    paramsNotOkay = false;
    System.out.print("How many acres of land do you wish to buy?");
    toSellLand = keyboard.nextInt();
    
   try {
    
       CropControl.sellLand(price, toSellLand, cropData);
    }
   catch(CropException e)
   {
     System.out.println("I am sorry master, I cannot do this.");
     System.out.println(e.getMessage());
      paramsNotOkay = true;
       
   }
    } while(paramsNotOkay);
    
    CropControl.sellLand(price, toSellLand, cropData);
    
    System.out.format("You now own%d acres of land.", cropData.getAcresOwned());
      
      
      
      }
/**
* The plantCropsView method
* Purpose: interface with the user input for buying land
* Parameters: none
* Returns: none
*/
      
      public static void plantCropsView() throws CropException{
      
      
      Game theGame = CityOfAaron.getTheGame();
       int price = CropControl.calcLandCost();
    System.out.format("", price);
    
    
    int thingsToPlant;
    boolean paramsNotOkay;
    do {
    paramsNotOkay = false;
    System.out.print("");
    thingsToPlant = keyboard.nextInt();
    
   try {
    
       CropControl.plantCrops(price, cropData);
    }
   catch(CropException e)
   {
     System.out.println("");
     System.out.println(e.getMessage());
      paramsNotOkay = true;
       
   }
    } while(paramsNotOkay);
    
    CropControl.plantCrops(price, cropData);
    
    System.out.format("You now own%d acres of land.", cropData.getAcresOwned());
      
      
      
      
      }
      
      
/**
* The feedPeopleView method
* Purpose: interface with the user input for buying land
* Parameters: none
* Returns: none
*/
      public static void feedPeopleView() throws CropException {
      
      Game theGame = CityOfAaron.getTheGame();
       int price = CropControl.calcLandCost();
    System.out.format("", price);
    
    
    int toFeed;
    boolean paramsNotOkay;
    do {
    paramsNotOkay = false;
    System.out.print("");
    toFeed = keyboard.nextInt();
    
   try {
    
       CropControl.feedPeople(price, cropData);
    }
   catch(CropException e)
   {
     System.out.println("");
     System.out.println(e.getMessage());
      paramsNotOkay = true;
       
   }
    } while(paramsNotOkay);
    
    CropControl.feedPeople(price, cropData);
    
    System.out.format("You now own%d acres of land.", cropData.getAcresOwned());
      
      
      
      
      
      
      }
      
    
}
