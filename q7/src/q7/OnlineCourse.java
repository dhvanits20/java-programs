package q7;

public class OnlineCourse extends Course {

	double platformFee;

    OnlineCourse(String courseCode, double fee, double platformFee) {
        super(courseCode, fee);
        this.platformFee = platformFee;
    }

    @Override
    double calculateTotalFee() {
        return fee + platformFee;
    }

    @Override
    public void issueCertificate() {
        System.out.println("Emailing Digital E-Certificate for Online Course: " + courseCode);
    }
}
