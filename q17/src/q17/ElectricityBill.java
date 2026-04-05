package q17;

public class ElectricityBill {
	String consumerId;
    int units;

    ElectricityBill(String consumerId, int units) throws InvalidUnitException {
        if (units < 0) {
            throw new InvalidUnitException("Units cannot be negative. Provided: " + units);
        }
        this.consumerId = consumerId;
        this.units = units;
    }

    double calculateBill() {
        double total = 0;
        if (units <= 100) {
            total = units * 5;
        } else if (units <= 200) {
            total = (100 * 5) + ((units - 100) * 7);
        } else {
            total = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }
        return total;
    }
}
