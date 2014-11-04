import java.util.Scanner;

public class _03_Disk {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = scan.nextInt();

		int center = (n / 2) + 1;

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				int y = center - (row + 1);
				int x = center - (col + 1);
				// double x = Math.sqrt(r*r-y*y);
				boolean isInDisk = x * x + y * y <= r * r;
				if (isInDisk) {
					System.out.print('*');
				} else {
					System.out.print('.');
				}
			}
			System.out.println();
		}
	}
}
