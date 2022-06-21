import carParts.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class EngineTest {

    private Engine engine;

    @Before
    public void before(){
        engine = new Engine("electric motor", false);
    }

    @Test
    public void hasEngineType(){
        assertEquals("electric motor", engine.getType());
    }

    @Test
    public void doesNotNeedOilChanges(){
        assertFalse(engine.getNeedsOilChange());
    }
}
