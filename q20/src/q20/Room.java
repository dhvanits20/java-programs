package q20;

public class Room {
	int roomNumber;
    boolean isAvailable;

    Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isAvailable = true;
    }

    void bookRoom() throws RoomNotAvailableException {
        if (!isAvailable) {
            throw new RoomNotAvailableException("Room " + roomNumber + " is already booked.");
        }
        isAvailable = false;
        System.out.println("Success! Room " + roomNumber + " is now booked.");
    }
}
