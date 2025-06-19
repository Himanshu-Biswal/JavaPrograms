package Arrays;

import java.util.Arrays;

public class Array_19_MergeSort {
	static void sort(int a[]) {
		if (a.length == 1) {
			return;
		}
		int left[] = new int[a.length / 2];
		int right[] = new int[a.length - left.length];

		for (int i = 0; i < left.length; i++) {
			left[i] = a[i];
		}
//	  System.arraycopy(left, 0, right, 0, 0);

		for (int i = 0; i < right.length; i++) {
			right[i] = a[i + left.length];
		}
		sort(left);
		sort(right);
		merge(left, right, a);
	}

	static void merge(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) c[k++] = a[i++];
			else c[k++] = b[j++];
		}

		while (i < a.length) c[k++] = a[i++];
		while (j < b.length)c[k++] = b[j++];

	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 8, 9, 1, 3, 0, 5, 7, 9 };
		sort(a);
		System.out.println(Arrays.toString(a));
	}
}
