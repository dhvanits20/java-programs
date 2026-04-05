package q1;

public class TeachingStaff extends Employee{

	String subject;
    double researchAllowance;

    TeachingStaff(int id, String name, double basicSalary, String subject, double researchAllowance) {
        super(id, name, basicSalary);
        this.subject = subject;
        this.researchAllowance = researchAllowance;
    }

    @Override
    double calculateSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        return basicSalary + hra + da + researchAllowance; 
    }
}
