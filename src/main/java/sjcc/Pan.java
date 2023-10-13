package sjcc;

import java.util.Random;
import org.json.JSONObject;


public class Pan extends PanGPS {
    
    private String name;
    private String species;
    private int weight;
    private Random speedRandom = new Random();

    //constructor
    public Pan(String name, String species) {
        super(name);
        this.name = name;
        this.species = species;
        this.weight = new Random().nextInt(591) + 10;
    }

    public String getFurColor() {
        return "Unknown";
    }

    @Override
    public String toString() {

        String s;

        s = "{ ";
        s += "\"name\": \"" + this.name() + "\"";
        s += ", ";
        s += "\"species\": \"" + this.species() + "\"";
        s += ", ";
        s += "\"fur\": \"" + this.getFurColor() + "\"";
        s += ", ";
        s += "\"weight\": \"" + this.weight() + "\"";
        s += ", ";
        s += "\"speed\": \"" + this.speed() + "\"";
        s += ", ";
        s += "\"latitude\": \"" + this.latitude() + "\"";
        s += ", ";
        s += "\"longitude\": \"" + this.longitude() + "\"";
        s += " }";

        return s;

        //using the json library won't make it print in order
        // JSONObject json = new JSONObject();
        // json.put("name", this.name());
        // json.put("species", this.species());
        // json.put("fur", this.getFurColor());
        // json.put("weight", this.weight());
        // json.put("speed", this.speed());
        // json.put("latitude", this.latitude());
        // json.put("longitude", this.longitude());

        // return json.toString();

        // return String.format("%s (species: %s) - Fur: %s, Weight: %d, Speed: %.2f, Location: (%.2f, %.2f)",
        // this.name(), this.species(), this.getFurColor(), this.weight, this.speed(), this.latitude(), this.longitude());
    }

    //name() method
    public String name() {
        return this.name;
    }

    //species() method
    public String species() {
        return this.species;
    }
    
    //roar() method
    public void roar() {
        System.out.println("Roooooooarrrrr!");
    }

    //speed() method
    public float speed() {
        return speedRandom.nextFloat() * (50.0f - 0.0f) + 0.0f;
    }

    //weight() method
    public int weight() {
        return this.weight;
    }
}
