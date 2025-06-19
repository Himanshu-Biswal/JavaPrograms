package STRING;

public class S_15_RemoveSpace{


		public static void main(String[] args) {
			String s = "java           is  easy";
	        char[] ch = s.toCharArray();
	        String res = "";

	        for (int i = 0; i < ch.length; i++) {
	            if (i==0|| ch[i] != ' ' || ch[i - 1] != ' ') {
	                res += ch[i];
	            }
	        }

	        System.out.println(res);

		}

	}

