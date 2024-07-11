package array;

public class Ex07 {

	public static void main(String[] args) {

		// 2차원 배열 생성 및 초기화
		int[][] arr = { { 2, 4, 6 }, { 3, 6, 9 } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + i + "," + j + "] ");
			}
			System.out.println();
		}
	}

}
