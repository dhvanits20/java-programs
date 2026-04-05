package q7;

public abstract class Course implements Certification  {

	String courseCode;
    double fee;

    Course(String courseCode, double fee) {
        this.courseCode = courseCode;
        this.fee = fee;
    }

    abstract double calculateTotalFee();
}
