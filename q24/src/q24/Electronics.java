package q24;

public class Electronics extends Product {
	Electronics(int id, String name, double price) throws InvalidPriceException {
        super(id, name, price);
    }

    @Override
    public double calculateTax() {
        return price * 0.18;
    }

    @Override
    double calculateFinalPrice() {
        return price + calculateTax();
    }
}
