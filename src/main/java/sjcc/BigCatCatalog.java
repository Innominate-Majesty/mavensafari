package sjcc;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class BigCatCatalog {
    private List<Pan> bigCats;

    public BigCatCatalog() {
        bigCats = new ArrayList<>();
    }

    //create a big cat and add it to the catalog
    public void createCat(String name, String species) {

        //checking if there is another cat with the same name
        for (Pan cat : bigCats) {
            if (cat.name().equalsIgnoreCase(name)) {
                System.out.println("There is another cat with the same name. Please choose another name!\n");
                return;
            }
        }

        Pan newCat = null;
        switch (species.toLowerCase()) {
            case "lion":
                newCat = new Lions(name);
                break;
            case "tiger":
                newCat = new Tigers(name);
                break;
            case "jaguar":
                newCat = new Jaguars(name);
                break;
            default:
                System.out.println("Please select a breed of cats that are above!\n");
                return;
        }


        bigCats.add(newCat);
        System.out.println(" \n");
        newCat.roar();
        System.out.println("A new cat has been created\n");
    }

    //delete cat by name
    public void deleteCat(String name) {
        Iterator<Pan> iterator = bigCats.iterator();
        while (iterator.hasNext()) {
            Pan cat = iterator.next();
            if (cat.name().equalsIgnoreCase(name)){
                iterator.remove();
                System.out.println("Status: " + name + " has been successfully deleted from the catatog\n");
                return;
            }

        }
    
        System.out.println(name + " is not found in the catalog.\n");
    }

    //finding cats that match part of the search term
    public List<Pan> findCats(String searchTerm) {
        List<Pan> foundCats = new ArrayList<>();
        for (Pan cat : bigCats) {
            if (cat.name().toLowerCase().contains(searchTerm.toLowerCase())) {
                foundCats.add(cat);
            }
        }

        return foundCats;
    }

    public List<Pan> getAllCats() {
        return new ArrayList<>(bigCats);
    }

}


