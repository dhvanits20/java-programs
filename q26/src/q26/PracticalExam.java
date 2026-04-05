package q26;

public class PracticalExam extends Exam implements Certifiable {
	PracticalExam(String subject, int marks) throws InvalidMarksException {
        super(subject, marks);
    }

    @Override
    boolean calculateResult() {
        return marks >= 40;
    }

    @Override
    public void issueCertificate() {
        System.out.println("Certificate of Excellence issued for Practical Exam in " + subject);
    }
}
