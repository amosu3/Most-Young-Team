/**
*The CropControl class - part of the control layer
* class contains all of the calculation methods for managing the crops
* Author: German De Marco
* Date last modified: October 2018
*/

package control;

import cityofaaron.CityOfAaron;
import exceptions.CropException;
import model.CropData;
import java.util.Random;
import model.Game;

/**
 *
 * @author de marco, german
 */
public class CropControl {
 Game theGame = CityOfAaron.getTheGame();
//constants
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;

// random number generator
    private static Random random = new Random();
    private static int wheatInStore;

    /**
     * calcLandCost method Purpose: To calculate a random land cost between 30
     * and 50 bushels/acre Par: None
     *
     * @return
     */
    public static int calcLandCost() {

        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
        return landPrice;
    }

    /**
     * The sellLand method Purpose: To sell land
     *
     * @param landPrice
     * @param acresToSell
     * @param cropData
     * @return the number of acres Pre-Conditions: acres to sell must be
     * positive and <= acresOwned
     */
    public static void sellLand(int landPrice, int acresToSell, CropData cropData)throws CropException { 
        //if  acresToSell < 0, return -1
        if (acresToSell < 0) {
     throw new CropException("A negative Value was input");
        }
        //if acresToSell > acresOwned, return -1
        int acresOwned = cropData.getAcresOwned();
        if (acresToSell > acresOwned) {
     throw new CropException("A negative Value was input");
        }
        // acresOwned = acresOwned - acresToSell
        acresOwned -= acresToSell;
        cropData.setAcresOwned(acresOwned);
        //whetInStore = wheatInStore + acresToSell * 
        int wheatInStore = cropData.getWheatInStore();
        wheatInStore += (acresToSell * landPrice);
        cropData.setWheatInStore(wheatInStore);
        //return acresOwned
        

    }

    
    
    /**
     * The BuyLand method Purpose: Show the final amount of land
     *
     * @param landPrice
     * @param acresToBuy
     * @param cropData
     * @return the number of acres after the operations Pre-Conditions: acres to
     * sell must be <= acresOwned
     */
  
  
  /**
   * 
   * @param plantAcres
   * @param cropData
   * @throws CropException 
   */
  public static void feedPeople(int grain, CropData cropData) throws CropException {
  
   if (grain < 0) {
     throw new CropException("There is not sufficient grain to feed people");
        }
  int wheatInstorage = cropData.getWheatInStore();
  if (wheatInstorage > grain) {
     throw new CropException("There is not space to save grain");
        }
   cropData.setWheatForPeople(wheatInStore);
  }
  
  
  
  /**
   * 
   * 
   * @param plantAcres
   * @param cropData
   * @throws CropException 
   */

  public static void plantCrops(int plantAcres, CropData cropData) throws CropException {
  
  if (plantAcres < 0) 
   {
     throw new CropException("There is not acres to plant");
        }
        
  
  int acresOwned = cropData.getAcresOwned();
   if (plantAcres > acresOwned) 
   {
     throw new CropException("The acres to plant need to be minus than the acres owned");
        }
  
  cropData.setAcresPlanted(acresOwned);
  }
  
  
    /**
     * SetOffering Method Purpose: Show valid values for offerings.
     *
     * @param offering_Payment
     * @param cropData
     * @param cropdata
     * @return
     * @throws exceptions.CropException
     */
  
  /**
     * The BuyLand method Purpose: Show the final amount of land
     *
     * @param landPrice
     * @param acresToBuy
     * @param cropData
     * @return the number of acres after the operations Pre-Conditions: acres to
     * sell must be <= acresOwned
     */
 public static void buyLand(int landPrice, int acresToBuy, CropData cropData) throws CropException {

// if acresTobuy < 0, return -1
        if (acresToBuy < 0) {
     throw new CropException("A negative Value was input");
        }
        

//if wheatInStore < acresToBuy * landPrice, return -1
        int wheatAmount = cropData.getWheatInStore();
        if (wheatAmount < acresToBuy * landPrice) {
 throw new CropException("There is insufficient wheat to buy this much land");}

//acresOwned = acresOwned + acresToBuy
        int acresOwned = cropData.getAcresOwned();

        acresOwned = acresOwned + acresToBuy;
        cropData.setAcresOwned(acresOwned);

//wheatAfterBuyAcres = wheatInStore – (acresOwned + acresToBuy)
        wheatAmount -= (acresToBuy * landPrice);
        cropData.setWheatInStore(wheatAmount);
        

        
    }
    public static void setOffering(int offering_Payment, CropData cropData) throws CropException {

        //if offering < 1 %, Return -1 
        if (offering_Payment < 1) {
            throw new CropException("The offering needs to be more than 1 % ");
        }

        //if offering > 99 % Return – 1
        if (offering_Payment > 99){
            throw new CropException("The offering need to be less than 100 % ");
        }

        cropData.setOffering(offering_Payment);
        

    }

}
