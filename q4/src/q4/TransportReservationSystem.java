package q4;

public class TransportReservationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transport[] vehicles = new Transport[3];
        vehicles[0] = new Bus("Ahmedabad to Surat", 280);
        vehicles[1] = new Train("Ahmedabad to Mumbai", 530);
        vehicles[2] = new Flight("Ahmedabad to Delhi", 950);

        double totalRevenue = 0;
        System.out.println("--- Transport Revenue Report ---");
        for (Transport t : vehicles) {
            double fare = t.calculateFare();
            totalRevenue += fare;
            System.out.println("Route: " + t.route + " (" + t.getClass().getSimpleName() + ") | Fare: Rs. " + fare);
        }
        System.out.println("--------------------------------");
        System.out.println("Total Revenue: Rs. " + totalRevenue);
	}

}
