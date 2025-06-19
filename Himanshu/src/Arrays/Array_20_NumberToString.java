package Arrays;

public class Array_20_NumberToString {
	static void Bal(int n, String s) {

		String one[] = { " ","one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String two[] = { " ", " ", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };

		if (n <= 19) {
			System.out.print(one[n]);
		}

		else {
			System.out.print(two[n / 10] +" "+ one[n % 10]);
		}
		if (n != 0) {
			System.out.println(s+" ");
		}

	}

	public static void main(String[] args) {
		int n = 1732;

		Bal(n / 10000000, " core");
		Bal((n / 100000) % 100, " lakhs");
		Bal((n / 1000) % 100, " thousands");
		Bal((n / 100) % 10, " hundreds");
		Bal((n % 100), " ");
//		System.out.println(n / 10000000);
//		System.out.println((n / 100000) % 100);
//		System.out.println((n / 1000) % 100);
//		System.out.println((n / 100) % 10);
//		System.out.println();
	}
}
