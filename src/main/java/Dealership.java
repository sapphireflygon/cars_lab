import cars.Car;
import cars.ElectricCar;
import cars.PetrolCar;
import people.Customer;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> stock;
    private double till;

    public Dealership(ArrayList<Car> stock, double till) {
        this.stock = stock;
        this.till = till;
    }

    public ArrayList<Car> getStock() {
        return this.stock;
    }

    public double getTill() {
        return this.till;
    }

    public void addCar(Car car) {
        this.stock.add(car);
    }

    public int getTotalNumberOfCarsInStock() {
        return this.stock.size();
    }

    public void buyArrayListOfCars(ArrayList<Car> newCars) {
        double totalCost = 0;
        for (Car car : newCars) {
            totalCost += car.getPrice();
        }
        this.till -= totalCost;
        this.stock.addAll(newCars);
    }

    public void sellVehicleToCustomer(Car car, Customer customer) {
        customer.buyVehicle(car);
        this.stock.remove(car);
        this.till += car.getPrice();
    }
}
