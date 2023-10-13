package sjcc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Venus H
 * Class: CIS 59 - Object Oriented Programming
 * Date: 10-12-2023
 */


public class App {

    private static ArrayList<Pan> panList = new ArrayList<>();
    public static void main(String[] args) {
        
        Scanner userSelection = new Scanner (System.in);

        BigCatCatalog catalog = new BigCatCatalog();

        printDisplay();

        boolean quit = false;
        while (!quit) {
            System.out.print("Enter your command: ");
            String choice = userSelection.nextLine().trim().toLowerCase();

            switch (choice) {
                case "c":
                    createCat(userSelection, catalog);
                    break;
                case "d":
                    deleteCat(userSelection, catalog);
                    break;
                case "f":
                    findCat(userSelection, catalog);
                    break;
                case "l":
                    listAllCats(catalog);
                    break;
                case "q":
                    quit = true;
                    System.out.println("Thank you for using the application. Have a great day!");
                    break;
                default:
                    System.out.println("Please select one of the options above or Q to quit!");

            }
        }

        userSelection.close();
    }
        
    public static void printDisplay() {
        System.out.println("  ");
        System.out.println("****************************************\n");
        System.out.println("         Safari with Venus   \n");
        System.out.println("****************************************\n");
        System.out.println("c    :    [C]reate a big cat]");
        System.out.println("d    :    [D]elete a big cat]");
        System.out.println("f    :    [F]ind a big cat");
        System.out.println("l    :    [L]ist all big cats");
        System.out.println("q    :    [Q]uit");
        System.out.println("****************************************\n");

    }

    private static void displayPanList() {
        System.out.println("****************************************\n");
        System.out.println("         Big Cat Catalog   \n");
        System.out.println("****************************************\n");

        //printing the cats in order of creation
        for (int i = 0; i < panList.size(); i++) {
            Pan pan = panList.get(i);
            String output = String.format("#%04d %s", i + 1, pan.toString());
            System.out.println(output);
        }

        System.out.println("****************************************\n");
                                
    }
    
    public static void createCat(Scanner userSelection, BigCatCatalog catalog) {
        System.out.println("Please enter the cat's name: ");
        String catName = userSelection.nextLine();
        System.out.print("Please enter the cat's species (Tiger, Lion, or Jaquar): ");
        String catSpecies = userSelection.nextLine();

        catalog.createCat(catName, catSpecies);
    }

    public static void deleteCat(Scanner userSelection, BigCatCatalog catalog) {
        System.out.print("Please enter the name of the cat that you would like to delete: ");
        String catToDelete = userSelection.nextLine();

        catalog.deleteCat(catToDelete);
    }

    public static void findCat(Scanner userSelection, BigCatCatalog catalog) {
        System.out.print("Enter a the cat's name or part of the cat's name: ");
        String searchTerm = userSelection.nextLine();

        catalog.findCats(searchTerm);
    }

    public static void listAllCats(BigCatCatalog catalog) {
        catalog.listAllCats();
    }
}


