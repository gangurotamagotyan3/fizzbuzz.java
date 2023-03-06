public class FizzBuzz {
	public static void main(String[] args) {
		String result;
		int max = Integer.parseInt(args[0]);
		for (int i = 0; i < max; i++) {
			int n = i + 1;
			if ((n % 3 == 0) && (n % 5 == 0)) {
				result = "FizzBuzz";
			} else if (n % 3 == 0) {
				result = "Fizz";
			} else if (n % 5 == 0) {
				result = "Buzz";
			} else {
				result = Integer.toString(n);
			}
			System.out.print(result + " ");
		}
	}
}
