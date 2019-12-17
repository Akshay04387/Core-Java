package package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		array.add(2);
		array.add(5);
		array.add(6);

		System.out.println(array);

		Iterator<Integer> iter = array.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		for (Integer i : array) {
			System.out.println(i);
		}
	}

}
