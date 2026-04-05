package q34;

public class Photo implements Printable {
	private String resolution;
    private double sizeMB;

    public Photo(String resolution, double sizeMB) {
        this.resolution = resolution;
        this.sizeMB = sizeMB;
    }

    @Override
    public void printDetails() {
        System.out.println("[Photo] Resolution: " + resolution + " | Size: " + sizeMB + " MB");
    }
}
