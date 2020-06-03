package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double getDefaultPrice() {
        return 4.50;
    }

    public double getPriceFor(Visitor visitor) {
        if (visitor.getAge() < 12){
            return getDefaultPrice() * 0.5;
        }
        return getDefaultPrice();
    }
}
