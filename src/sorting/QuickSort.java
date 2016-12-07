package sorting;

public class QuickSort {

	static int[] printTable(int[] table) {
		for (int i = 0; i < table.length; ++i) {
			System.out.print(table[i]);
			System.out.print(" , ");
		}
		System.out.println();
		return table;
	}

	public static void quickSort(int[] table, int left, int right) {
		int i = left;
		int j = right;
		int pivot = table[(left + right) / 2];
		do {
			while (table[i] < pivot) {
				i++;
			}
			while (table[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = table[i];
				table[i] = table[j];
				table[j] = temp;
				i++;
				j--;
			}
		} while (i <= j);

		if (left < j) {
			quickSort(table, left, j);
		}
		if (i < right)
			quickSort(table, i, right);
	}

	public static void main(String[] args) {
		int[] table = { 6, 2, 8, 4, 0, 5, 3, 7, 1, 9 };
		quickSort(table, 0, (table.length - 1));
		printTable(table);
	}

}
