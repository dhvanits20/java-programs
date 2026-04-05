package q33;

import java.util.Scanner;

public class WordCounterApp {
	public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to count its words: ");
        String input = sc.nextLine();
        
        int count = countWords(input);
        System.out.println("The number of words in the string is: " + count);
        sc.close();
    }
}
