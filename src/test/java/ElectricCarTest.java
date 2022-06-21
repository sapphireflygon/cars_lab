import carParts.Engine;
import carParts.Gearbox;
import carParts.Tyres;
import cars.ElectricCar;
import cars.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricCarTest {

    private ElectricCar electricCar;
    private Engine engine;
    private Tyres tyres;

    @Before
    public void before(){
        engine = new Engine("electric motor", false);
        tyres = new Tyres("Michelin", "summer");
        electricCar = new ElectricCar(engine, tyres, 2.50, "blue");
    }

    @Test
    public void hasEngine(){
        assertTrue(electricCar.getEngine() != null);
    }

    @Test
    public void hasTyres(){
        assertTrue(electricCar.getTyres() != null);
    }

    @Test
    public void hasPrice(){
        assertEquals(2.50, electricCar.getPrice(), 0.00);
    }

    @Test
    public void hasColour(){
        assertEquals("blue", electricCar.getColour());
    }

    @Test
    public void canDamageCar(){
        electricCar.damageCar(2.49);
        assertEquals(0.01, electricCar.getPrice(), 0.01);
        assertEquals(2.49, electricCar.getDamage(), 0.01);
    }
}
