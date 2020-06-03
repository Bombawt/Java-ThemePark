package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    Visitor visitor1;
    Visitor visitor2;
    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(14, 210, 10.80);
        visitor2 = new Visitor(15, 125, 25.00);
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
    public void hasDefaultPrice(){ assertEquals( 8.40, rollerCoaster.getDefaultPrice(), 0.01);}

    @Test
    public void isVisitorAllowedToRideYES(){assertTrue(rollerCoaster.isAllowedTo(visitor1));}

    @Test
    public void isVisitorAllowedToRideNO(){assertFalse(rollerCoaster.isAllowedTo(visitor2));}

    @Test
    public void tallPeopleAreDiscriminatedAgainst(){assertEquals(16.80, rollerCoaster.getPriceFor(visitor1), 0.01);}

    @Test
    public void shortPeopleAreBetter(){ assertEquals(8.40, rollerCoaster.getPriceFor(visitor2), 0.01);}
}
