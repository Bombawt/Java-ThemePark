package behaviours;

import people.Visitor;

public interface ITicketed {

    public double getDefaultPrice();

    public double getPriceFor(Visitor visitor);
}
