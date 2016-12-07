package sorting;

public class HeapSort {
	private static int n;
	private static int leftChild;
	private static int rightChild;
	private static int largest;

	static int[] printTable(int[] table) {
		for (int i = 0; i < table.length; ++i) {
			System.out.print(table[i]);
			System.out.print(" , ");
		}
		System.out.println();
		return table;
	}

	public static void buildheap(int[] table) {
		n = table.length - 1;
		for (int i = n / 2; i >= 0; i--) {
			maxheap(table, i);
		}
	}

	public static void maxheap(int[] table, int i) {
		leftChild = 2 * i;
		rightChild = 2 * i + 1;
		if (leftChild <= n && table[leftChild] > table[i]) {
			largest = leftChild;
		} else {
			largest = i;
		}

		if (rightChild <= n && table[rightChild] > table[largest]) {
			largest = rightChild;
		}
		if (largest != i) {
			swap(table, i, largest);
			maxheap(table, largest);
		}
	}

	public static void swap(int[] table, int i, int j) {
		int t = table[i];
		table[i] = table[j];
		table[j] = t;
	}

	public static void heapSort(int[] table) {
		buildheap(table);

		for (int i = n; i > 0; i--) {
			swap(table, 0, i);
			n = n - 1;
			maxheap(table, 0);
		}
	}

	public static void main(String[] args) {
		int[] table = { 6, 2, 8, 4, 5, 0, 3, 7, 1, 9 };
		heapSort(table);
		printTable(table);
	}
}
