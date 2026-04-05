package q25;

public class GeneralWard extends Patient implements Insurable {
	GeneralWard(int id, String name, double baseCharge) {
        super(id, name, baseCharge);
    }

    @Override
    double calculateBill(int days) throws InvalidStayException {
        if (days <= 0) {
            throw new InvalidStayException("Stay duration must be greater than zero.");
        }
        calculatedBill = baseCharge * days;
        return calculatedBill;
    }

    @Override
    public double calculateInsuranceCoverage() {
        return calculatedBill * 0.50;
    }
}
