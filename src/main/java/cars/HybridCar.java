package cars;

import carParts.Engine;
import carParts.Gearbox;
import carParts.Tyres;

public class HybridCar extends Car {

    private Gearbox gearbox;

    public HybridCar(Engine engine, Tyres tyres, double price, String colour, Gearbox gearbox) {
        super(engine, tyres, price, colour);
        this.gearbox = gearbox;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }
}
