package array.quiz;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Quiz07 {

	public static void main(String[] args) {

		char[] cha = { 'a', 'b', 'c', 'd', 'e' };
		char[] cha2 = new char[2];

		System.arraycopy(cha, 3, cha2, 0, 2);

		System.out.println(Arrays.toString(cha));
		System.out.println(Arrays.toString(cha2));
	}

}
