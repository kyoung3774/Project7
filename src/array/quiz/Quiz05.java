package array.quiz;

import java.util.Arrays;

public class Quiz05 {

	public static void main(String[] args) {

		int[] arr = { 5, 20, 100, 30, 77 };
		System.out.println(Arrays.toString(arr));
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			System.out.println(max + "vs" + arr[i]);
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
