package q18;

public class Exam {
	String studentName;
    int marks;

    Exam(String studentName, int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        }
        this.studentName = studentName;
        this.marks = marks;
    }

    String calculateResult() {
        if (marks >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}
