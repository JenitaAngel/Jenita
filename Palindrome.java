public class Palindrome {

	public static void main(String[] args) {
		int[] number = new int[args.length];
		int t = 0;
		int sum = 0;
		int i = 0;
		int s;
		number[i] = Math.abs(number[i]);
		number[i] = Integer.parseInt(args[i]);
		 t = number[i];
		while (number[i] > 0) {

			s = number[i] % 10;
			sum = (sum * 10) + s;
			number[i] = number[i] / 10;
		}
		if (t == sum) {
			System.out.println(sum + " is a palindrome");
		} else {
			System.out.println(sum + " is not a palindrome");
		}
	}
}
