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
        String s = super.toString();

        s = s.substring(0, s.length() - 2);

        s += ", ";
        s += "\"funFact\": \"" + this.funFact() + "\"";
        s += " }";

        return s;
        
        // JSONObject json = new JSONObject(super.toString());
        // json.put("funFact", this.funFact());
        // return json.toString();
    }
}
