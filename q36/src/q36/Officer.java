package q36;

public class Officer extends Staff {
	private String grade;

    public Officer(String code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    public void retrieveOfficerInfo() {
        displayStaffInfo();
        System.out.println(" | Role: Officer | Grade: " + grade);
    }
}
