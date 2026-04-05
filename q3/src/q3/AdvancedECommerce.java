package q3;

public class AdvancedECommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product[] cart = new Product[4];
        cart[0] = new Electronics(1, "Laptop", 50000);
        cart[1] = new Clothing(2, "T-Shirt", 1000);
        cart[2] = new Electronics(3, "Smartphone", 30000);
        cart[3] = new Clothing(4, "Jeans", 2000);

        double totalBill = 0;
        System.out.println("--- E-Commerce Bill ---");
        for (Product p : cart) {
            double finalPrice = p.getFinalPrice();
            totalBill += finalPrice;
            System.out.println(p.name + " | Base: " + p.price + " | Tax: " + p.calculateTax() + " | Final: " + finalPrice);
        }
        System.out.println("-----------------------");
        System.out.println("Total Final Bill: Rs. " + totalBill);
	}

}
