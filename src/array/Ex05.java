package array;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {

		char[] srcArr = { 'a', 'b', 'c', 'd', 'e' }; // 원본배열
		char[] newArr = new char[3]; // 새배열

		// 원본 배열, 원본 시작 위치, 새벼열, 새배열 시작위치, 갯수
		System.arraycopy(srcArr, 0, newArr, 0, 3); // 배열 복사

		System.out.println("원본배열: " + Arrays.toString(srcArr));
		System.out.println("새로운배열: " + Arrays.toString(newArr));
	}

}
