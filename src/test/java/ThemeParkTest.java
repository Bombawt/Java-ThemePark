import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.ParkingSpot;
import stalls.Stall;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Attraction rollerCoaster;
    Stall tobaccoStall;
    Visitor visitor;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Oblivion", 5);
        tobaccoStall = new TobaccoStall("How Is This Legal", "Shady McShady", ParkingSpot.A3);
        visitor = new Visitor(25, 178, 45);
        themePark = new ThemePark();
    }

    @Test
    public void canAddAttraction(){
        themePark.addNewAttraction(rollerCoaster);
        assertEquals(1, themePark.getAllReviewed());
    }

    @Test
    public void canAddStall(){
        themePark.addNewStall(tobaccoStall);
        assertEquals(1, themePark.getAllReviewed());
    }

    @Test
    public void canAddBoth(){
        themePark.addNewStall(tobaccoStall);
        themePark.addNewAttraction(rollerCoaster);
        assertEquals(2, themePark.getAllReviewed());
    }

    @Test
    public void canVisitAttractions(){
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, visitor.getVisitedAttractions());
    }

}
