import java.util.Scanner;


public class _01_Fit_Box_in_Box {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w1 = scan.nextInt();
		int h1 = scan.nextInt();
		int d1 = scan.nextInt();
		
		int w2 = scan.nextInt();
		int h2 = scan.nextInt();
		int d2 = scan.nextInt();
		
		BoxFit(w1, h1, d1, w2, h2, d2);
		BoxFit(w1, h1, d1, w2, d2, h2);
		BoxFit(w1, h1, d1, h2, w2, d2);
		BoxFit(w1, h1, d1, h2, d2, w2);
		BoxFit(w1, h1, d1, d2, w2, h2);
		BoxFit(w1, h1, d1, d2, h2, w2);
		
		BoxFit(w2, h2, d2, w1, h1, d1);
		BoxFit(w2, h2, d2, w1, d1, h1);
		BoxFit(w2, h2, d2, h1, w1, d1);
		BoxFit(w2, h2, d2, h1, d1, w1);
		BoxFit(w2, h2, d2, d1, w1, h1);
		BoxFit(w2, h2, d2, d1, h1, w1);			
	}
	
	private static void BoxFit (
			int firstBoxWidth, int firstBoxHeight, int firstBoxDepth,
			int secondBoxWidth ,int secondBoxHeight, int secondBoxDepth) {
		
		if (firstBoxWidth < secondBoxWidth && firstBoxHeight < secondBoxHeight && firstBoxDepth < secondBoxDepth) {
			System.out.printf("(%d, %d, %d) < (%d, %d, %d)" , firstBoxWidth , firstBoxHeight , firstBoxDepth,
					secondBoxWidth, secondBoxHeight, secondBoxDepth).println();
		}
	}

}
