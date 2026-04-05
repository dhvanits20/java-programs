package q26;

public abstract class Exam {
	String subject;
    int marks;

    Exam(String subject, int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        }
        this.subject = subject;
        this.marks = marks;
    }

    abstract boolean calculateResult();
}
