package arrays;


import java.util.List;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.ListIterator;
/*
 * Write a program to implement that array size should be increment automatically as long as user provide values.
 * This will be done by ArrayList
 */
public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(59);
		arrayList.add(6);
		arrayList.add(1);
		arrayList.add(81);
		arrayList.add(-1);
		
		
		/* for(int elem: arrayList) {
			System.out.println(elem);
		} */
		
		/*Using Iterator -- Only support forward print
		Iterator<Integer> it = arrayList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		} */
		
		/*Using List Iterator -- Forward Print
		ListIterator<Integer> list = arrayList.listIterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		} */
		
		//Using ListIterator -- Backward print
		ListIterator<Integer> list = arrayList.listIterator(arrayList.size());
		while(list.hasPrevious()) {
			System.out.println(list.previous());
		}
		
	}

}
