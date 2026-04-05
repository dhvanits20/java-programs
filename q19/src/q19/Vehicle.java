package q19;

public class Vehicle {
	String vehicleNumber;
    double vehiclePrice;

    Vehicle(String vehicleNumber, double vehiclePrice) throws InvalidPriceException {
        if (vehiclePrice < 0) {
            throw new InvalidPriceException("Vehicle price cannot be negative.");
        }
        this.vehicleNumber = vehicleNumber;
        this.vehiclePrice = vehiclePrice;
    }

    double calculatePremium() {
        return 0;
    }
}
