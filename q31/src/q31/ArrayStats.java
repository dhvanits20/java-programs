package q31;

import java.util.Scanner;

public class ArrayStats {
	public static double getTotal(double[] array) {
        double total = 0;
        for (double v : array) {
            total += v;
        }
        return total;
    }

    public static double getAverage(double[] array) {
        if (array.length == 0) return 0;
        return getTotal(array) / array.length;
    }

    public static double getHighest(double[] array) {
        if (array.length == 0) return 0;
        double highest = array[0];
        for (double v : array) {
            if (v > highest) {
                highest = v;
            }
        }
        return highest;
    }

    public static double getLowest(double[] array) {
        if (array.length == 0) return 0;
        double lowest = array[0];
        for (double v : array) {
            if (v < lowest) {
                lowest = v;
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        double[] data = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            data[i] = sc.nextDouble();
        }

        System.out.println("\n--- Array Statistics ---");
        System.out.println("Total: " + getTotal(data));
        System.out.println("Average: " + getAverage(data));
        System.out.println("Highest: " + getHighest(data));
        System.out.println("Lowest: " + getLowest(data));
        sc.close();
    }
}
