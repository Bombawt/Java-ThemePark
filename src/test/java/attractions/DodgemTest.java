package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(10, 120, 2.95);
        visitor2 = new Visitor(25, 168, 54.30);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){ assertEquals(4.50, dodgems.getDefaultPrice(), 0.01);}

    @Test
    public void visitorsUnder12PayHalfPrice(){assertEquals(2.25, dodgems.getPriceFor(visitor1), 0.01);}

    @Test
    public void visitorsOver12PayDefaultPrice(){assertEquals(4.50, dodgems.getPriceFor(visitor2), 0.01);}
}
