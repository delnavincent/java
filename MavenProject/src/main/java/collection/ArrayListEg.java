package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEg {

	public static void main(String[] args) {
		List<String> l1=new ArrayList();
		l1.add("grapes");
		l1.add("mangoes");
		l1.add("guava");
		l1.add("kiwi");
		l1.add("grapes");
		System.out.println(l1);
		
		System.out.println("Non generic");
		ArrayList l2=new ArrayList();
		l2.add(12);
		l2.add("orange");
		l2.add(50);
		l2.add(null);
		l2.add(null);
		System.out.println(l2);
		
		System.out.println("generic");
		ArrayList<String> l3=new ArrayList();
		l3.add("diya");
		l3.add("neha");
		l3.add("divya");
		l3.add("kiwi");
		System.out.println(l3);
		
		l3.remove(1);
		l3.remove("diya");
		System.out.println(l3);
		
		System.out.println(l3.size());
		
		System.out.println("for loop iteration");
		for(int i=0;i<l3.size();i++)
		{
			System.out.println(l3.get(i));
		}
		Collections.sort(l1);
		System.out.println(l1);
		
		l1.addAll(l3);
		System.out.println(l1);
		
		System.out.println(l1.contains("kiwi"));
		
		l1.removeAll(l3);
		System.out.println(l1);
		
		System.out.println(l2.get(0));
		l2.set(2, 100);
		System.out.println(l2);
		
		ArrayList<Integer> l4=new ArrayList();
		l4.add(10);
		l4.add(11);
		l4.add(12);
		l4.add(15);
		System.out.println(l4);
		
		ArrayList<Character> l5=new ArrayList();
		l5.add('a');
		l5.add('b');
		l5.add('c');
		l5.add('d');
		System.out.println(l5);
		
		
		

	}

}
