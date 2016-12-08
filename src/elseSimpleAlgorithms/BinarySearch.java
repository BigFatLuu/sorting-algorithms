package elseSimpleAlgorithms;
import java.util.Scanner;

public class BinarySearch {
	static Scanner sc = new Scanner(System.in);

	static class NumberToFind {
		int x;
	}

	static boolean data(NumberToFind d) {
		try {
			d.x = sc.nextInt();
		} catch (NumberFormatException e) {
			System.out.print("Only Integers");
			System.exit(1);
		}
		return true;
	}

	public static void bubblesort(int[] table) {
		int n = table.length - 1;
		while (n > 0) {
			int last = 0;
			for (int i = 0; i < table.length - 1; i++) {
				if (table[i] > table[i + 1]) {
					swap(table, i, i + 1);
					last = i;
				}
			}
			n = last;
		}
	}

	private static void swap(int[] table, int i, int j) {
		int change = table[i];
		table[i] = table[j];
		table[j] = change;
	}

	static int solve(int[] table, int x) {
		int i = (table.length - 1);
		int n = 0;
		while (n < i) {
			int m = (i + n) / 2;
			if (table[m] > x) {
				i = m;
			} else if (table[m] < x) {
				n = m;
			} else
				return m;
		}
		return -1;
	}

	public static void main(String[] args) {
		NumberToFind d = new NumberToFind();
		int[] table = { 6, 2, 8, 4, 5, 3, 7, 1, 9 };
		bubblesort(table);
		for (int i = 0; i < table.length; i++) {
			System.out.print(table[i] + ",");
		}
		System.out.println("Enter a number to find.");
		data(d);
		System.out.println("Number " + d.x + " has index "
				+ solve(table, d.x) + " .");
	}
}
