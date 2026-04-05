package q3;

public class Clothing extends Product {

	Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateTax() {
        return price * 0.05; // 5% GST
    }
}
