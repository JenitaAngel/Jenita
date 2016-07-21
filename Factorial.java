import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scanner.nextInt();
		int i=1;
		while (n > 1) {
			fact = fact * i;
			
			if(i==n)
				break;
			i++;
		}
		System.out.println("Factorial of "+n+" is: " + fact);
		scanner.close();
	}
}
