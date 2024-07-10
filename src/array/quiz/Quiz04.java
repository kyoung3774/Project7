package array.quiz;

import java.util.Arrays;

public class Quiz04 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		System.out.println(arr); // 배열의 참조(주소)값
		System.out.println(Arrays.toString(arr)); // 배열의 각 요소값
		System.out.println();

		int cnt = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("i: " + i);
			if (i % 2 == 0) {
				arr[cnt] = i;
				cnt++;
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}

}
