package arraylist.quiz;

import java.util.ArrayList;

public class Quiz03 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");

		String num = list.get(0);

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		System.out.println("----------1----------");

		for (String a : list) {
			System.out.println(a);
		}
		System.out.println("----------2----------");
		
		list.removeAll(list);
		System.out.println(list.size());
		System.out.println("----------4----------");

//		System.out.println(list.get(0));
	}

}
