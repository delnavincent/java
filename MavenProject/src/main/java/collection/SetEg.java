package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEg {

	public static void main(String[] args) {
		// get,set,sort not possible
		
		Set<Integer> s1=new HashSet();
		s1.add(10);
		s1.add(12);
		s1.add(13);
		s1.add(14);
		System.out.println(s1);
		
		HashSet<Integer> h1=new HashSet();
		h1.add(20);
		h1.add(30);
		h1.add(40);
		System.out.println(h1);
		
		h1.remove(30);
		System.out.println(h1);
		
		System.out.println(h1.size());
		
		h1.addAll(s1);
		System.out.println(h1);
		
		h1.removeAll(s1);
		System.out.println(h1);
		
		System.out.println(h1.contains(30));
		
		Iterator<Integer> it=h1. iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

}
