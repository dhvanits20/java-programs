package q3;

public class Electronics extends Product {

	Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateTax() {
        return price * 0.18; // 18% GST
    }
}
