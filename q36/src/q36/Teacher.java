package q36;

public class Teacher extends Staff {
	private String subject;
    private String publication;

    public Teacher(String code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    public void retrieveTeacherInfo() {
        displayStaffInfo();
        System.out.println(" | Role: Teacher | Subject: " + subject + " | Publication: " + publication);
    }
}
