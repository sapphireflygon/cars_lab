import carParts.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    private Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("Michelin", "summer");
    }

    @Test
    public void hasMake(){
        assertEquals("Michelin", tyres.getMake());
    }

    @Test
    public void hasType(){
        assertEquals("summer", tyres.getType());
    }
}
