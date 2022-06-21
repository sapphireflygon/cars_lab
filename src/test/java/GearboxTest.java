import carParts.Gearbox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GearboxTest {

    private Gearbox gearbox;

    @Before
    public void before(){
        gearbox = new Gearbox(6, "manual");
    }

    @Test
    public void hasNumberOfGears(){
        assertEquals(6, gearbox.getNumberOfGears());
    }

    @Test
    public void hasTransmissionType(){
        assertEquals("manual", gearbox.getTransmissionType());
    }
}
