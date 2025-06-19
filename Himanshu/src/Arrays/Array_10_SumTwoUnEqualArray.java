package Arrays;

//import java.util.Arrays;

public class Array_10_SumTwoUnEqualArray {
	public static void main(String[] args) {
		  
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7};

        int maxLength = Math.max(a.length, b.length);

        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            int n1 = (i < a.length) ? a[i] : 0; 
            int n2 = (i < b.length) ? b[i] : 0; 
            result[i] = n1 + n2; 
        }

        System.out.print("Resulting Array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        
//        System.out.println(Arrays.toString(result));
    }
}