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
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.PrintWriter;
import static java.lang.System.out;

/**
 *
 * @author jaryger
 */
public class ListMenuView extends MenuView {

    Scanner keyboard = new Scanner(System.in);
    private Object PrintWriter;

    public ListMenuView() {

        super("\n"
                + "**********************************\n"
                + "* CITY OF AARON: LIST MENU  *\n"
                + "**********************************\n"
                + " 1 - List Animals \n"
                + " 2 - List Provisions \n"
                + " 3 - List Tools\n"
                + " 4 - List Team\n"
                + " 5 - Quit\n",
                5);

    }

    /**
     *
     * @param ListMenuOptions
     */
    @Override
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

    /**
     *
     */
    public void listAnimals() {
        // dgw
        Game theGame = CityOfAaron.getTheGame();
        ArrayList<ListItem> animalsList = theGame.getAnimals();
        // Put your "for" statement here to loop through the number of Animals

        // For loop to show the animals
        for (int x = 0; x < animalsList.size(); x++) {

            System.out.println(animalsList.get(x).getName() + " " + animalsList.get(x).getNumber());
        }

        // in the Array list, and output their name and number.
        // TODO:  Enter your for loop here.
        // dgw
    }

    /**
     *
     *
     */
    public void listTools() {

        Game theGame = CityOfAaron.getTheGame();
        ArrayList<ListItem> toolsList = theGame.getTools();

        for (int x = 0; x < toolsList.size(); x++) {

            System.out.println(toolsList.get(x).getName() + " " + toolsList.get(x).getNumber());
        }

        /**
         *
         *
         */
    }

    public void listProvisions() {

        Game theGame = CityOfAaron.getTheGame();
        ArrayList<ListItem> provisionsList = theGame.getProvisions();

        for (int x = 0; x < provisionsList.size(); x++) {

            System.out.println(provisionsList.get(x).getName() + " " + provisionsList.get(x).getNumber());

        }

        /**
         *
         *
         */
    }

    public void listTeam() {

        System.out.print("\n"
                + "**********************************\n"
                + "* CITY OF AARON: TEAM            *\n"
                + "**********************************\n"
                + " 1 - De Marco German \n"
                + " 2 - Amosu   \n"
                + " 3 - Nefi Verduga \n"
                + " 4 - No one \n"
                + " 5 - Exit \n");

        max = 5;

    }

    public void PrintlistTools() {
        Game theGame = CityOfAaron.getTheGame();
        String filePath = keyboard.next();
        PrintWriter = null;
        GameControl.getSavedGame(filePath);
        System.out.println("Please enter the file path to load the Game: ");

        try (FileOutputStream fap = new FileOutputStream(filePath)) {

// create the PrintWriterobject
            ObjectOutputStream output = new ObjectOutputStream(fap);
// get a reference to the ArrayListyou want to output
            ArrayList<ListItem> toolsList = theGame.getTools();
// output a heading for the report
            out.println("List Of Tools ");
// use a for loop to get the data from the ArrayList

            for (int x = 0; x < toolsList.size(); x++) {

                System.out.println(toolsList.get(x).getName() + " " + toolsList.get(x).getNumber());
            }

// and output it
        } catch (Exception e) {
            System.out.println("There is an error; ");
        }

    }

    public void PrintlistAnimals() {

        Game theGame = CityOfAaron.getTheGame();
        String filePath = keyboard.next();
        PrintWriter = null;
        GameControl.getSavedGame(filePath);
        System.out.println("Please enter the file path to load the Game: ");

        try (FileOutputStream fap = new FileOutputStream(filePath)) {

// create the PrintWriterobject
            ObjectOutputStream output = new ObjectOutputStream(fap);
// get a reference to the ArrayListyou want to output
            ArrayList<ListItem> animalsList = theGame.getAnimals();
// output a heading for the report
            out.println("List Of  Animals ");
// use a for loop to get the data from the ArrayList

            for (int x = 0; x < animalsList.size(); x++) {

                System.out.println(animalsList.get(x).getName() + " " + animalsList.get(x).getNumber());
            }

// and output it
        } catch (Exception e) {
            System.out.println("There is an error; ");
        }

    }

    public void PrintlistProvisions() {

        Game theGame = CityOfAaron.getTheGame();
        String filePath = keyboard.next();
        PrintWriter = null;
        GameControl.getSavedGame(filePath);
        System.out.println("Please enter the file path to load the Game: ");

        try (FileOutputStream fap = new FileOutputStream(filePath)) {

// create the PrintWriterobject
            ObjectOutputStream output = new ObjectOutputStream(fap);
// get a reference to the ArrayListyou want to output
            ArrayList<ListItem> provisions = theGame.getProvisions();
// output a heading for the report
            out.println("List Of  Provisions ");
// use a for loop to get the data from the ArrayList

            for (int x = 0; x < provisions.size(); x++) {
                System.out.println(provisions.get(x).getName() + " " + provisions.get(x).getNumber());
            }

// and output it
        } catch (Exception e) {
            System.out.println("There is an error; ");
        }

    }

}
