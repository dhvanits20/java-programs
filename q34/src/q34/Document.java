package q34;

public class Document implements Printable {
	private String title;
    private String author;

    public Document(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void printDetails() {
        System.out.println("[Document] Title: " + title + " | Author: " + author);
    }
}
