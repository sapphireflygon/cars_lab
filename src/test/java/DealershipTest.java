import carParts.Engine;
import carParts.Gearbox;
import carParts.Tyres;
import cars.Car;
import cars.ElectricCar;
import cars.PetrolCar;
import org.junit.Before;
import org.junit.Test;
import people.Customer;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DealershipTest {

    private Dealership dealership;
    private ArrayList<Car> stock;

    @Before
    public void before(){
        stock = new ArrayList<>();
        dealership = new Dealership(stock, 20);
    }

    @Test
    public void hasStockArrayList(){
        assertTrue(dealership.getStock() != null);
    }

    @Test
    public void hasTill(){
        assertEquals(20, dealership.getTill(), 0.00);
    }

    @Test
    public void canAddCarToStock(){
        Engine engine = new Engine("electric motor", false);
        Tyres tyres = new Tyres("Michelin", "summer");
        ElectricCar electricCar = new ElectricCar(engine, tyres, 3.50, "blue");
        dealership.addCar(electricCar);
        assertEquals(1, dealership.getTotalNumberOfCarsInStock());
    }

    @Test
    public void canBuyVehicles(){
        Engine engine = new Engine("internal combustion", true);
        Tyres tyres = new Tyres("Michelin", "summer");
        Gearbox gearbox = new Gearbox(6, "manual");
        PetrolCar petrolCar = new PetrolCar(engine, tyres, 2.50, "white", gearbox);
        ArrayList<Car> newCars = new ArrayList<>();
        newCars.add(petrolCar);
        newCars.add(petrolCar);
        newCars.add(petrolCar);
        dealership.buyArrayListOfCars(newCars);
        assertEquals(12.50, dealership.getTill(), 0.00);
        assertEquals(3, dealership.getTotalNumberOfCarsInStock());
    }

    @Test
    public void canSellVehicleToCustomer(){
        Engine engine = new Engine("internal combustion", true);
        Tyres tyres = new Tyres("Michelin", "summer");
        Gearbox gearbox = new Gearbox(6, "manual");
        PetrolCar petrolCar = new PetrolCar(engine, tyres, 2.50, "white", gearbox);
        dealership.addCar(petrolCar);
        Customer customer = new Customer("Emilio", 20);
        dealership.sellVehicleToCustomer(petrolCar, customer);
        assertEquals(22.50, dealership.getTill(), 0.00);
        assertEquals(17.50, customer.getMoney(), 0.00);
        assertEquals(0, dealership.getTotalNumberOfCarsInStock());
    }
}
