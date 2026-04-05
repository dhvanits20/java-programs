package q1;

public class Employee extends Person {

	double basicSalary;

    Employee(int id, String name, double basicSalary) {
        super(id, name);
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }
}