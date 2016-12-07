package sorting;

import java.util.Scanner;

public class CreateTable {
	static Scanner sc = new Scanner(System.in);
	static int tableLenght;
	static int table[];

	static boolean numbers() {
		try {
			tableLenght = sc.nextInt();
		} catch (NumberFormatException e) {
			System.out.print("Only Integers");
			System.exit(1);
		}
		return true;
	}

	static int[] createTable() {
		table = new int[tableLenght];
		if (tableLenght > 0) {
			for (int i = 0; i < tableLenght; ++i) {
				try {
					table[i] = sc.nextInt();
				} catch (NumberFormatException e) {
					System.out.print("Only Integers");
					System.exit(1);
				}
			}
		}
		return table;
	}

	static int[] printTable() {
		for (int i = 0; i < tableLenght; ++i) {
			System.out.print(table[i]);
			System.out.print(" , ");
		}
		System.out.println();
		return table;
	}

	public static void main(String[] args) {
		System.out.println("How many numbers are in the table?");
		numbers();
		System.out.println("type " + tableLenght + " numbers");
		createTable();
		printTable();
	}
}
