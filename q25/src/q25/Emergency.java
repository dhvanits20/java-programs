package q25;

public class Emergency extends Patient implements Insurable {
	Emergency(int id, String name, double baseCharge) {
        super(id, name, baseCharge);
    }

    @Override
    double calculateBill(int days) throws InvalidStayException {
        if (days <= 0) {
            throw new InvalidStayException("Stay duration must be greater than zero.");
        }
        calculatedBill = (baseCharge * days) + 2000;
        return calculatedBill;
    }

    @Override
    public double calculateInsuranceCoverage() {
        return calculatedBill * 0.80;
    }
}
