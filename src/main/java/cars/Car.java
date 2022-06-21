package cars;

import carParts.Engine;
import carParts.Tyres;

public abstract class Car {

    private Engine engine;
    private Tyres tyres;
    private double price;
    private String colour;
    private double damage;

    public Car(Engine engine, Tyres tyres, double price, String colour) {
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
        this.damage = 0;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Tyres getTyres() {
        return this.tyres;
    }

    public double getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public double getDamage() {
        return this.damage;
    }

    public void damageCar(double valueOfAmountOfDamage){
        this.damage += valueOfAmountOfDamage;
        this.price -= valueOfAmountOfDamage;
    }
}
