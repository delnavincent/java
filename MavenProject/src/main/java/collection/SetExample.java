package collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer> s1=new HashSet();
		s1.add(10);
		s1.add(20);
		s1.add(30);
        System.out.println(s1);
        
       HashSet<Integer> h1=new HashSet();
       h1.add(100);
		h1.add(200);
		h1.add(300);
       System.out.println(h1);
       
       s1.addAll(h1);
       System.out.println(s1);
       
       System.out.println(s1.contains(20));
       
       


	}

}
