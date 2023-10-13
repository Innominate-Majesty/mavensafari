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

    @Override
    public String toString() {
        JSONObject json = new JSONObject();
        json.put("name", this.name());
        json.put("species", this.species());
        json.put("weight", this.weight());
        json.put("speed", this.speed());
        json.put("fur", this.getFurColor());
        json.put("location", super.toString());
        return json.toString();
    }
    //name() method
    public String name() {
        return this.name;
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
