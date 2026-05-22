package cognizentInterview;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String strs[] = { "Raman", "shyam", "Banana", "racecar", "madam" };
		for (String str : strs) {
			if (chkStr(str)) {
				System.out.println(str + " is palindrome.");
			}

		}

	}

	public static boolean chkStr(String str) {
		int fwd = 0;
		int back = str.length() - 1;

		while (back > fwd) {
			if (str.charAt(back--) != str.charAt(fwd++)) {
				return false;
			}

		}

		return true;
	}

}
