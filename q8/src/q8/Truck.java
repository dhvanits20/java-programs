package q8;

public class Truck extends Vehicle {

	Truck(String vehicleNumber, double vehiclePrice) {
        super(vehicleNumber, vehiclePrice);
    }

    @Override
    double calculateInsurance() {
        return (vehiclePrice * 0.08) + 2000;
    }
}
