package q20;

import java.util.Scanner;

public class HotelBookingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of rooms in the hotel: ");
        int n = sc.nextInt();
        Room[] rooms = new Room[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Room Number for registration: ");
            rooms[i] = new Room(sc.nextInt());
        }

        System.out.print("\nEnter number of booking attempts to simulate: ");
        int attempts = sc.nextInt();

        for (int i = 0; i < attempts; i++) {
            System.out.print("\nEnter room number to book: ");
            int targetRoom = sc.nextInt();
            boolean found = false;

            for (Room r : rooms) {
                if (r.roomNumber == targetRoom) {
                    found = true;
                    try {
                        r.bookRoom();
                    } catch (RoomNotAvailableException e) {
                        System.out.println("Booking Failed: " + e.getMessage());
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("Invalid Room Number.");
            }
        }
        sc.close();
	}

}
