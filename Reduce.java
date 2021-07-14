
public class Reduce {

	public static void main(String[] args) {
		// System.out.println(reduce("aaabbccccxxxyzz"));

	}

	public static String replace(String str, String from, String to) { // from : or

		if (str.length() < from.length()) {
			return str;
		}

		if (str.startsWith(from)) {
			return to + replace(str.substring(from.length()), from, to);
		} else {
			return str.charAt(0) + replace(str.substring(1), from, to);
		}

	}

	public static String reduce(String str) {
		if (str.length() == 1 || str.length() == 0) {
			return str;
		}

		char current = str.charAt(0);
		char next = str.charAt(1);

		if (current == next) {
			return reduce(str.substring(1));
		} else {
			return current + reduce(str.substring(1));
		}

//		for (int i = 0; i < str.length() - 2; i++) {
//
//			if (str.charAt(i) == str.charAt(i + 1)) {
//				System.out.println(str.substring(i, i + 1));
//				System.out.println(str.substring(i + 1, str.length()));
//				str = str.substring(i, i + 1) + reduce(str.substring(i + 1, str.length()));
//			} else {
//				System.out.println(str.substring(i + 1, i + 2));
//				System.out.println(str.substring(i + 2, str.length()));
//				str = str.substring(i, i + 2) + reduce(str.substring(i + 2, str.length()));
//			}
//
//		}

	}

}
