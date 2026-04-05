package q15;

public class Employee {

	int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double basicSalary) throws InvalidSalaryException {
        if (basicSalary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative. Provided: " + basicSalary);
        }
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateGrossSalary() {
        return basicSalary;
    }
}
