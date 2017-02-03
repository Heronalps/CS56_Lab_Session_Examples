import java.util.*;

public class CopyDemo{
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(100);

		//Shallow Copy
		ArrayList<Integer> list2 = list1;
		list1.add(0,list1.get(0) + 200);


		System.out.println(list1.get(0));
		System.out.println(list1.get(1));


		System.out.println(list2.get(0));
		System.out.println(list2.get(1));

		//Deep Copy
		ArrayList<Integer> list3 = new ArrayList<>(list1);
		list1.add(0,list1.get(0) + 200);

		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));

		System.out.println(list3.get(0));
		System.out.println(list3.get(1));
		//System.out.println(list3.get(2));

	}
}