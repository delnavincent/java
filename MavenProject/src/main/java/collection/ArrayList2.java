package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList();
		a.add(10);
		a.add(11);
		a.add(12);
		a.add(13);
		for(int i:a) //for each
		{
			System.out.println(i);
		}
		
		
		Iterator<Integer> it=a.iterator();  //iterator interface
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove(); //for removing last element of arraylist
		System.out.println(a); 
	}

}
