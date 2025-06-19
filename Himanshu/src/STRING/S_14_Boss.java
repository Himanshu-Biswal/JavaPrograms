package STRING;

public class S_14_Boss {

	public static void main(String[] args) {
		String s = "Boossss";
		char[] ch = s.toCharArray();
		String res = "";

		for (int i = 0; i < ch.length; i++) {
			int count = 1;

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}

			}

			// Replace character with '$' if it appears exactly twice
			System.out.println(ch[i] + "=" + count);
			
				if (count%2!=0 && i>1) {
					ch[i] = '$';
					res += ch[i];
				} else {
					res += ch[i];
				}
		

		}

		System.out.println("\n" + res); 
	}
}
