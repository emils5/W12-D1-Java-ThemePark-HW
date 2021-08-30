package attractions;

import junit.framework.TestResult;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(18, 220, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canAllowVisitorToRide(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor) );
    }
    @Test
    public void hasEntryPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0);
    }
    @Test
    public void canModifyEntryPrice(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0);
    }
}
