package sjcc;

import org.json.JSONObject;

public class Jaguars extends Pan {

    public Jaguars(String name) {
        super(name, "Jaguar");
    }

    public String getFurColor() {
        return "spots";
    }

    //Jaguars sleep in trees
    public String funFact() {
        return "Fun fact: jaguars sleep in trees!";
    }

    @Override
    public String toString() {
        JSONObject json = new JSONObject(super.toString());
        json.put("funFact", this.funFact());
        return json.toString();
    }
}
