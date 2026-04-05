package q24;

public class Grocery extends Product {
	Grocery(int id, String name, double price) throws InvalidPriceException {
        super(id, name, price);
    }

    @Override
    public double calculateTax() {
        return price * 0.05;
    }

    @Override
    double calculateFinalPrice() {
        return price + calculateTax();
    }
}
