package q15;

public class Manager extends Employee {

	Manager(int id, String name, double basicSalary) throws InvalidSalaryException {
        super(id, name, basicSalary);
    }

    @Override
    double calculateGrossSalary() {
        return basicSalary + (basicSalary * 0.20);
    }
}
