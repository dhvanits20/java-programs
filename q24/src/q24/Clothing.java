package q24;

public class Clothing extends Product {
	Clothing(int id, String name, double price) throws InvalidPriceException {
        super(id, name, price);
    }

    @Override
    public double calculateTax() {
        return price * 0.12;
    }

    @Override
    double calculateFinalPrice() {
        return price + calculateTax();
    }
}
