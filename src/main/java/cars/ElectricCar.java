package cars;

import carParts.Engine;
import carParts.Tyres;

public class ElectricCar extends Car {

    public ElectricCar(Engine engine, Tyres tyres, double price, String colour) {
        super(engine, tyres, price, colour);
    }
}
