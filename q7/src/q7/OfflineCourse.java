package q7;

public class OfflineCourse extends Course {

	OfflineCourse(String courseCode, double fee) {
        super(courseCode, fee);
    }

    @Override
    double calculateTotalFee() {
        return fee; // No extra fees
    }

    @Override
    public void issueCertificate() {
        System.out.println("Issuing Physical Certificate for Offline Course: " + courseCode);
    }
}
