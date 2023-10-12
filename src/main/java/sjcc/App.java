package sjcc;

import java.util.Scanner;

/**
 * Venus H
 * Class: CIS 59 - Object Oriented Programming
 * Date: 10-12-2023
 */


public class App {
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
                    findCats(userSelection, catalog);
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
        System.out.println("    Big Cat Catalog by Venus   \n");
        System.out.println("****************************************\n");
        System.out.println("c    :    [C]reate a big cat]");
        System.out.println("d    :    [D]elete a big cat]");
        System.out.println("f    :    [F]ind a big cat");
        System.out.println("l    :    [L]ist all big cats");
        System.out.println("q    :    [Q]uit");
        System.out.println("****************************************\n");

    }
    
    }


