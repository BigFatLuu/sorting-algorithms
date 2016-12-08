package sorting;

public class BubbleSort {
	private static void swap(int[] table, int i, int j) {
		int change = table[i];
		table[i] = table[j];
		table[j] = change;
	}
	
	public static void bubblesort(int[] table) {
		int n = table.length - 1;
		while (n > 0) {
			int last = 0;
			for (int i = 0; i < table.length - 1; i++) {
				if (table[i] > table[i + 1]) {
					swap(table, i, i + 1);
					last =i;
				}
			}
			n=last;
		}
	}

	public static void main(String[] args) {
		int[] table = { 6, 2, 8, 4, 5, 0, 3, 7, 1, 9 };
		bubblesort(table);
		for (int i = 0; i < table.length; i++){
			System.out.print(table[i]);
		}
	}
}
