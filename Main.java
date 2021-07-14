
public class Main {

	public static void main(String[] args) {

//		System.out.println(fact(0));
//		System.out.println(sum(100));
//		printLine(10);
//		triangle(5);
//		pattern(5, 1);
//		fibonachi(5);
		// PrintReverseTriangle(5);
		reverseNumber(12345);

	}

	public static void PrintReverseTriangle(int n) {
		if (n == 0) {
			System.out.print("");
		} else {
			for (int i = 1; i < n + 1; i++) {
				PeeReverseTriangle(i);
			}
		}
	}

	public static void PeeReverseTriangle(int i) {
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static int reverseNumber(int number) {
		String sNumber = Integer.toString(number);
		int numberLength = sNumber.length();
		String Temp = "";

		for (int i = numberLength - 1; i >= 0; i--) {

			Temp += sNumber.charAt(i);

		}

		System.out.println(sNumber);
		System.out.println(Temp);

		return Integer.parseInt(Temp);

	}

	public static int fibonachi(int num) {
		if (num <= 1)
			return num;
		return fibonachi(num - 1) + fibonachi(num - 2);

	}

	// function to print a row
	static void printn(int num) {
		// base case
		if (num == 0)
			return;
		System.out.print("* ");

		// recursively calling printn()
		printn(num - 1);
	}

	// function to print the pattern
	static void pattern(int n, int i) {
		// base case
		if (n == 0)
			return;
		printn(i);
		System.out.println();

		// recursively calling pattern()
		pattern(n - 1, i + 1);
	}

	public static void triangle(int num) {
		if (num == 0) {
			System.out.println("");

		}

		if (num >= 1) {
			for (int i = 0; i < num; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		if (num > 0) {
			triangle(num - 1);
		}

	}

	public static void printLine(int num) {
		if (num == 0) {
			System.out.println("");

		}

		if (num == 1) {
			System.out.print("*");
		}
		if (num > 1) {
			System.out.print("*");
		}

		if (num > 0) {
			printLine(num - 1);
		}

	}

	public static int sum(int num) {
		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}

		return num + sum(num - 1);
	}

	public static int fact(int n) {

		if (n == 1 || n == 0) {
			return 1;
		}

		return n * fact(n - 1);

	}

}
