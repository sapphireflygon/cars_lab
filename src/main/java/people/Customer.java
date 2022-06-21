package people;

import cars.Car;
import cars.ElectricCar;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private ArrayList<Car> ownedCars;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.ownedCars = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public double getMoney() {
        return this.money;
    }

    public int getNumberOfOwnedCars() {
        return this.ownedCars.size();
    }

    public void buyVehicle(Car car) {
        this.money -= car.getPrice();
        this.ownedCars.add(car);
    }
}
