package carParts;

public class Gearbox {

    private int numberOfGears;
    private String transmissionType;

    public Gearbox(int numberOfGears, String transmissionType) {
        this.numberOfGears = numberOfGears;
        this.transmissionType = transmissionType;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public String getTransmissionType() {
        return transmissionType;
    }
}
