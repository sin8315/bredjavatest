package tw.org.iii.classroom;

import java.util.LinkedList;

public class Java63 {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.add(12);
		list.add("Java");
		list.add("Java");
		list.add(12);
		list.add(1,"iii");
//		list.add(7,34);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(4));
		list.remove(4);
		System.out.println(list);
		
	}

}
