package carParts;

public class Engine {

    private String type;
    private boolean needsOilChange;

    public Engine(String type, boolean needsOilChange) {
        this.type = type;
        this.needsOilChange = needsOilChange;
    }

    public String getType() {
        return this.type;
    }

    public boolean getNeedsOilChange() {
        return this.needsOilChange;
    }
}
