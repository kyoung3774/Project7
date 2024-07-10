package array.quiz;

import java.util.Arrays;

public class Quiz06 {

	public static void main(String[] args) {

		int[] arr = { 5, 20, 100, 30, 77 };
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 20) {
				System.out.println(arr[i]+"이 저장된 인덱스:"+i);
				break;
			}
		}

	}
}
