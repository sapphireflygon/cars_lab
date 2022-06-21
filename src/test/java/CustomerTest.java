import carParts.Engine;
import carParts.Tyres;
import cars.Car;
import cars.ElectricCar;
import org.junit.Before;
import org.junit.Test;
import people.Customer;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private ArrayList<Car> ownedCars;

    @Before
    public void before(){
        ownedCars = new ArrayList<>();
        customer = new Customer("Emilio", 10.00);
    }

    @Test
    public void hasName(){
        assertEquals("Emilio", customer.getName());
    }

    @Test
    public void hasMoney(){
        assertEquals(10.00, customer.getMoney(), 0.00);
    }

    @Test
    public void hasNoOwnedCarsToStart(){
        assertEquals(0, customer.getNumberOfOwnedCars());
    }

    @Test
    public void customerCanBuyVehicle(){
        Engine engine = new Engine("electric motor", false);
        Tyres tyres = new Tyres("Michelin", "summer");
        ElectricCar electricCar = new ElectricCar(engine, tyres, 3.50, "black");
        customer.buyVehicle(electricCar);
        assertEquals(6.50, customer.getMoney(), 0.00);
        assertEquals(1, customer.getNumberOfOwnedCars());
    }
}
