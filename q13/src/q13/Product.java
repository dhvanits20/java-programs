package q13;

public class Product {

	int productId;
    String name;
    double price;
    int stock;

    Product(int productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    void purchase(int quantity) throws OutOfStockException {
        if (quantity > stock) {
            throw new OutOfStockException("Cannot purchase " + quantity + ". Only " + stock + " left in stock.");
        }
        stock -= quantity;
        System.out.println("Purchase successful! Total: Rs. " + (quantity * price));
        System.out.println("Remaining stock for " + name + ": " + stock);
    }
}
