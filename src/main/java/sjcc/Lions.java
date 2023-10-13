package sjcc;

public class Lions extends Pan{

    public Lions(String name) {
        super(name, "Lion");
    }

    @Override
    public String getFurColor() {
        return "mane";
    }
}
