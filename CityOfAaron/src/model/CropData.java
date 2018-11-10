/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author demarcogerman
 */
import java.io.Serializable;

/**
 *
 * @author jaryger
 */
public class CropData  implements Serializable{
    
    private int year;
    private int population;
    private int acresOwned;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int harvestAfterOffering;
    private int offering;
    private int offeringBushels;
    private int peopleFed;
    private int acresPlanted;
    private int numStarved;
    private int eatenByRats;
    private int wheatForPeople;
    
    /**
     *
     * @return
     */
    public int getWheatForPeople() {
        return wheatForPeople;
    }

    /**
     *
     * @param wheatForPeople
     */
    public void setWheatForPeople(int wheatForPeople) {
        this.wheatForPeople = wheatForPeople;
    }

    /**
     *
     * @return
     */
    public int getEatenByRats() {
        return eatenByRats;
    }

    /**
     *
     * @param eatenByRats
     */
    public void setEatenByRats(int eatenByRats) {
        this.eatenByRats = eatenByRats;
    }

    /**
     *
     * @return
     */
    public int getNumStarved() {
        return numStarved;
    }

    /**
     *
     * @param numStarved
     */
    public void setNumStarved(int numStarved) {
        this.numStarved = numStarved;
    }

    /**
     *
     * @return
     */
    public int getAcresPlanted() {
        return acresPlanted;
    }

    /**
     *
     * @param acresPlanted
     */
    public void setAcresPlanted(int acresPlanted) {
        this.acresPlanted = acresPlanted;
    }

    /**
     *
     * @return
     */
    public int getPeopleFed() {
        return peopleFed;
    }

    /**
     *
     * @param peopleFed
     */
    public void setPeopleFed(int peopleFed) {
        this.peopleFed = peopleFed;
    }
    
    /**
     *
     * @return
     */
    public int getOfferingBushels() {
        return offeringBushels;
    }

    /**
     *
     * @param offeringBushels
     */
    public void setOfferingBushels(int offeringBushels) {
        this.offeringBushels = offeringBushels;
    }
    
    /**
     *
     * @return
     */
    public int getOffering() {
        return offering;
    }

    /**
     *
     * @param offering
     */
    public void setOffering(int offering) {
        this.offering = offering;
    }

    /**
     *
     * @return
     */
    public int getHarvestAfterOffering() {
        return harvestAfterOffering;
    }

    /**
     *
     * @param harvestAfterOffering
     */
    public void setHarvestAfterOffering(int harvestAfterOffering) {
        this.harvestAfterOffering = harvestAfterOffering;
    }
    
    /**
     *
     * @return
     */
    public int getHarvest() {
        return harvest;
    }

    /**
     *
     * @param harvest
     */
    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }
    
    /**
     *
     * @return
     */
    public int getNewPeople() {
        return newPeople;
    }

    /**
     *
     * @param newPeople
     */
    public void setNewPeople(int newPeople) {
        this.newPeople = newPeople;
    }
    
    /**
     *
     * @return
     */
    public int getNumberWhoDied() {
        return numberWhoDied;
    }

    /**
     *
     * @param numberWhoDied
     */
    public void setNumberWhoDied(int numberWhoDied) {
        this.numberWhoDied = numberWhoDied;
    }

    /**
     *
     * @return
     */
    public int getWheatInStore() {
        return wheatInStore;
    }

    /**
     *
     * @param wheaInStore
     */
    public void setWheatInStore(int wheaInStore) {
        this.wheatInStore = wheaInStore;
    }

    /**
     *
     * @return
     */
    public int getCropYield() {
        return cropYield;
    }

    /**
     *
     * @param cropYield
     */
    public void setCropYield(int cropYield) {
        this.cropYield = cropYield;
    }

    /**
     *
     * @return
     */
    public int getAcresOwned() {
        return acresOwned;
    }

    /**
     *
     * @param acresOwned
     */
    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }
    
    /**
     *
     * @return
     */
    public int getPopulation() {
        return population;
    }

    /**
     *
     * @param population
     */
    public void setPopulation(int population) {
        this.population = population;
    }

    /**
     *
     * @return
     */
    public int getYear() {
        return year;
    }

    /**
     *
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    
}
