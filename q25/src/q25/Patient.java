package q25;

public abstract class Patient {
	int id;
    String name;
    double baseCharge;
    double calculatedBill;

    Patient(int id, String name, double baseCharge) {
        this.id = id;
        this.name = name;
        this.baseCharge = baseCharge;
    }

    abstract double calculateBill(int days) throws InvalidStayException;
}
