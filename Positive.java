import java.util.Scanner;

public class CountPosAndNegNum {

	public static void main(String[] args) {
		int num[] = new int[5];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the number: ");
			num[i] = s.nextInt();
			if(num[i] == 0) {
			  System.out.println("Number is zero");
			  break;
			} else if (num[i] > 0) {
				System.out.println("Number is Positive");
				break;
			} else {
				System.out.println("Number is Negative");
			}
		}
		s.close();
	}
}
