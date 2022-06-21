import carParts.Engine;
import carParts.Gearbox;
import carParts.Tyres;
import cars.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HybridCarTest {

    private HybridCar hybridCar;
    private Engine engine;
    private Tyres tyres;
    private Gearbox gearbox;

    @Before
    public void before(){
        engine = new Engine("hybrid", true);
        tyres = new Tyres("Michelin", "summer");
        gearbox = new Gearbox(7, "automatic");
        hybridCar = new HybridCar(engine, tyres, 1.50, "green", gearbox);
    }

    @Test
    public void hasEngine(){
        assertTrue(hybridCar.getEngine() != null);
    }

    @Test
    public void hasTyres(){
        assertTrue(hybridCar.getTyres() != null);
    }

    @Test
    public void hasPrice(){
        assertEquals(1.50, hybridCar.getPrice(), 0.00);
    }

    @Test
    public void hasColour(){
        assertEquals("green", hybridCar.getColour());
    }

    @Test
    public void hasGearbox(){
        assertTrue(hybridCar.getGearbox() instanceof Gearbox);
    }

    @Test
    public void canDamageCar(){
        hybridCar.damageCar(0.01);
        assertEquals(1.49, hybridCar.getPrice(), 0.01);
        assertEquals(0.01, hybridCar.getDamage(), 0.01);
    }
}
