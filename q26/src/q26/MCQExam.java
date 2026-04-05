package q26;

public class MCQExam extends Exam implements Certifiable {
	MCQExam(String subject, int marks) throws InvalidMarksException {
        super(subject, marks);
    }

    @Override
    boolean calculateResult() {
        return marks >= 40;
    }

    @Override
    public void issueCertificate() {
        System.out.println("Certificate of Achievement issued for MCQ Exam in " + subject);
    }
}
