package sjcc;

import java.util.ArrayList;
import java.util.List;

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
                System.out.println("There is another cat with the same name. Please choose another name!");
                return;
            }
        }

        Pan newCat = new Pan(name, species);
        bigCats.add(newCat);
        System.out.println("A new cat has been created");
    }

    //delete cat by name
    public void deleteCat(String name) {
        for (Pan cat : bigCats) {
            if (cat.name().equalsIgnoreCase(name)){
                bigCats.remove(cat);
                System.out.println(name + " has been successfully deleted from the catatog");
                return;
            }

        }
    
        System.out.println(name + " is not found in the catalog.");
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

    public void listAllCats() {
        for (Pan cat : bigCats) {
            System.out.println(cat.toString());
        }
    }
}

