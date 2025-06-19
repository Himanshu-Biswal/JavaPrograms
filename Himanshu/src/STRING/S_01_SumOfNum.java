package STRING;

public class S_01_SumOfNum {
    public static void main(String[] args) {
        String s = "Himanshu 123 @456 cbsbv 789";
        int sum = 0;
        // Use regular expression to extract numbers
        String[] numbers = s.split("\\D+"); // split by non-digit characters
        for (String num : numbers) {
            if (!num.isEmpty()) {
                sum += Integer.parseInt(num);
            }   
        }
        System.out.println("Sum: " + sum); // Output: 600
    }
}

//String s="Himanshu100Madhu200Salu300",res="";
//int sum=0;
//
//for(int i=0;i<s.length();i++) {
//	char ch=s.charAt(i);
//	if(ch>='0' && ch<='9') {
//		res+=ch;
//	}
//	else {
//		if(!res.isEmpty()) {
//			sum+=Integer.parseInt(res);
//			res="";
//		}
//	}
//}
//if(!res.isEmpty()) {
//	sum+=Integer.parseInt(res);
//}
//System.out.println(sum);
