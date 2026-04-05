package q24;

public abstract class Product implements Taxable {
	int id;
    String name;
    double price;

    Product(int id, String name, double price) throws InvalidPriceException {
        if (price < 0) {
            throw new InvalidPriceException("Product price cannot be negative.");
        }
        this.id = id;
        this.name = name;
        this.price = price;
    }

    abstract double calculateFinalPrice();
}
