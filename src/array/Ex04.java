package array;

public class Ex04 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 반복문
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		// 람다식 for문(for each)
		for (int value : arr) {
			System.out.println(value + " ");
		}
	}

}
