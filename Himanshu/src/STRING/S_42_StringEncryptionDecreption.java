package STRING;

public class S_42_StringEncryptionDecreption {
	public static String encode(String s, int n) {
		char ch[] = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(ch[i])) {
				ch[i] = (char) (((((ch[i] - 'A'+n) % 26) + 26) % 26 )+ 'A');
			}// ( ( ( 72 -67) % 26 ) + 26 ) % 26+ 65
			 // ((((5)%26)+26)%26+65

			if (Character.isLowerCase(ch[i])) {
				ch[i] = (char) (((((ch[i] - 'a'+n) % 26) + 26) % 26 + 'a'));
			}
		}
		return new String(ch);
	}
	
	public static String decode(String s, int n) {
		return encode(s, -n);
	}

	public static void main(String[] args) {
      System.out.println(encode("abc", 2));
      System.out.println(decode("abc", 2));
      
	}//(((((ch[i]-'A'+n)%26)+26)%26)+'A');
}
