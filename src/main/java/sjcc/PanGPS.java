package sjcc;

import java.util.Random;

import org.json.JSONObject;

/*
 * Panthera base class that simulates GPS information
 */
public class PanGPS {

    // constants
    private final Integer maxLongitude = 1000;
    private final Integer maxLatitude = 1000;
    protected final float minSpeed = 0f;
    protected final float maxSpeed = 50.0f;

    // attributes
    private String name;
    private String species;

    private Float longitude;
    private Float latitude;

    private Random longitudeRandom;
    private Random latitudeRandom;

    // constructor
    public PanGPS(String name) {

        // initialize attributes
        this.name = name;
        this.species = species;

        // seed the random number generators for repeatable results
        this.longitudeRandom = new Random();
        this.longitudeRandom.setSeed(this.seed(name + "longitude"));
        this.latitudeRandom = new Random();
        this.latitudeRandom.setSeed(this.seed(name + "latitude"));

        // move the panthera into it's initial position
        this.longitude = longitudeRandom.nextFloat() * maxLongitude;
        this.latitude = latitudeRandom.nextFloat() * maxLatitude;

    }

    // serializes attributes into a string
    @Override
    public String toString() {
        JSONObject json = new JSONObject();
        json.put("longitude", this.longitude());
        json.put("latitude", this.latitude());
        return json.toString();
    }
        

    // getters
    public String name() {
        return this.name;
    }

    public String species() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // make a seed, based on the name
    private Integer seed(String s) {
        Integer seed = 0;

        for (Integer i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            seed += (int) ch;
        }

        return seed;
    }

    public void move() {
        this.longitude += longitudeRandom.nextFloat() * maxSpeed;
        this.latitude += latitudeRandom.nextFloat() * maxSpeed;
    }

    // longitude of the panthera
    public Float longitude() {
        return longitude;
    }

    // latitude of the panthera
    public Float latitude() {
        return latitude;
    }


}

