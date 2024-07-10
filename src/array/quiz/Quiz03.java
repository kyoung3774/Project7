package array.quiz;

public class Quiz03 {

	public static void main(String[] args) {

		int[] arr = { 10, 15, 20, 25, 30 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
