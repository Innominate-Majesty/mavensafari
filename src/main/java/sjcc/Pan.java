package sjcc;

public class Pan extends PanGPS {
    
    private String name;
    private String species;

    //constructor
    public Pan(String name, String species) {
        super(name);
        this.name = name;
        this.species = species;
    }

    //name() method
    public String name() {
        return this.name;
    }
    
}
