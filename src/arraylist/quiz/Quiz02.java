package arraylist.quiz;

import java.util.ArrayList;

public class Quiz02 {

	public static void main(String[] args) {

		ArrayList<Boolean> list = new ArrayList<Boolean>();
		int lastIndex = list.size()-1;
		list.add(true);
		list.add(true);
		list.add(false);

		for (int i = 0; i < list.size(); i++) {
			boolean num = list.get(i);
			System.out.println(num);
		}
		System.out.println("---------1----------");

		for (boolean a : list) {
				System.out.println(a);
		}
		System.out.println("---------2----------");
		
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		System.out.println(list.get(lastIndex));
	}

}
