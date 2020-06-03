import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    ArrayList<IReviewed> reviewedAttractionsAndStalls;

    public ThemePark() {
        this.reviewedAttractionsAndStalls = new ArrayList<IReviewed>();
    }

    public void addNewAttraction(Attraction attraction){
        this.reviewedAttractionsAndStalls.add(attraction);
    }

    public void addNewStall(Stall stall){
        this.reviewedAttractionsAndStalls.add(stall);
    }

    public int getAllReviewed(){
        return reviewedAttractionsAndStalls.size();
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.increaseVisitCount();
        visitor.addVisitedAttraction(attraction);
    }
}
