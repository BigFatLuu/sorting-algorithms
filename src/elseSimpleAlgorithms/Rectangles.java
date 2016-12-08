package elseSimpleAlgorithms;
import java.util.Scanner;

public class Rectangles {
	static Scanner sc = new Scanner(System.in);

	static class Size {
		int width, height;

		public Size(int w, int h) {
			width = w;
			height = h;
		}
	}

	static class Triple {
		int n, m, r;

		Triple(int n, int m, int r) {
			this.n = n;
			this.m = m;
			this.r = r;
		}
	}

	static Size box = new Size(0, 0);

	static int solve(Size page) {
		if (page.width < box.width && page.width < box.height
				|| page.height < box.width && page.height < box.height) {
			return (0);
		}
		int r, bestR;
		int m;
		int nMax = page.height / box.height;
		bestR = Integer.MAX_VALUE;
		Triple best = null;
		for (int n = 0; n <= nMax; ++n) {
			r = page.height - n * box.height;
			m = r / box.width;
			r = page.height - (n * box.height + m * box.width);
			if (bestR > r) {
				bestR = r;
				best = new Triple(n, m, r);
			}
		}
		Size p1 = new Size(best.n * box.height, page.width - box.width);
		Size p2 = new Size(best.m * box.width + best.r, page.width - box.height);
		return best.n + best.m + solve(p1) + solve(p2);
	}

	static boolean read(Size d) {
		try {
			d.width = sc.nextInt();
			d.height = sc.nextInt();
		} catch (NumberFormatException e) {
			System.out.print("Only Integers");
			System.exit(1);
		}
		return true;
	}

	public static void main(String[] args) {
		Size page = new Size(0, 0);
		System.out.println("Specify the dimensions of a sheet of paper");
		read(page);
		System.out.println("Specify the dimensions of the rectangle");
		read(box);
		System.out.println(solve(page));
	}
}
