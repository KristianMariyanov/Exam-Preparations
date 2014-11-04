import java.util.Scanner;

public class _04_Poker_Straight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int weight = scan.nextInt();
		// int [] cards = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		// int [] suits = {1,2,3,4};
		//
		int count = 0;
		for (int card1 = 1; card1 < 15; card1++) {
			for (int suit1 = 1; suit1 < 5; suit1++) {

				for (int suit2 = 1; suit2 < 5; suit2++) {

					for (int suit3 = 1; suit3 < 5; suit3++) {

						for (int suit4 = 1; suit4 < 5; suit4++) {
							
							for (int suit5 = 1; suit5 < 5; suit5++) {
								int tempWeight = 
										10*card1 + suit1 +
										20*(card1+1) + suit2 +
										30*(card1+2) + suit3 +
										40*(card1+3) + suit4 +
										50*(card1+4) + suit5;
								if (weight == tempWeight) {
									count++;
								}
										
							}

						}
					}
				}
			}
		}
		System.out.println(count);

	}

}
