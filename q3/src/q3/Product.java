package q3;

public abstract class Product implements Taxable {

	int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
     double getFinalPrice() {
        return price + calculateTax();
    }
}
