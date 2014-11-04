import java.util.Scanner;

public class _02_K_Sequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] inputNumbersAsString = scan.nextLine().split(" ");
		int k = scan.nextInt();

		int[] inputNumbers = new int[inputNumbersAsString.length];

		for (int i = 0; i < inputNumbers.length; i++) {
			inputNumbers[i] = Integer.parseInt(inputNumbersAsString[i]);
		}

		if (k == 1) {

		} else {
			int count = 1;
			for (int i = 1; i < inputNumbers.length; i++) {
				if (i == inputNumbers.length - 1 && count==k) {
					for (int j = 0; j < count % k; j++) {
						System.out.print(inputNumbers[i - 1] + " ");

					}
					System.out.print(inputNumbers[i]);
				}
				if (inputNumbers[i] == inputNumbers[i - 1]) {
					count++;
					if (i == inputNumbers.length - 1) {
						for (int j = 0; j < count % k; j++) {
							System.out.print(inputNumbers[i - 1] + " ");

						}
					}

				} else {
					for (int j = 0; j < count % k; j++) {
						System.out.print(inputNumbers[i - 1] + " ");
					}
					count = 1;
				}

			}
		}
	}
}
