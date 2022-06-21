import carParts.Engine;
import carParts.Gearbox;
import carParts.Tyres;
import cars.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PetrolCarTest {

    private PetrolCar petrolCar;
    private Engine engine;
    private Tyres tyres;
    private Gearbox gearbox;

    @Before
    public void before(){
        engine = new Engine("internal combustion", true);
        gearbox = new Gearbox(5, "manual");
        tyres = new Tyres("Michelin", "summer");
        petrolCar = new PetrolCar(engine, tyres, 3.00, "red", gearbox);
    }

    @Test
    public void hasEngine(){
        assertTrue(petrolCar.getEngine() != null);
    }

    @Test
    public void hasTyres(){
        assertTrue(petrolCar.getTyres() != null);
    }

    @Test
    public void hasPrice(){
        assertEquals(3.00, petrolCar.getPrice(), 0.00);
    }

    @Test
    public void hasColour(){
        assertEquals("red", petrolCar.getColour());
    }

    @Test
    public void hasGearbox(){
        assertTrue(petrolCar.getGearbox() instanceof Gearbox);
    }

    @Test
    public void canDamageCar(){
        petrolCar.damageCar(1.00);
        assertEquals(2.00, petrolCar.getPrice(), 0.01);
        assertEquals(1.00, petrolCar.getDamage(), 0.01);
    }
}
