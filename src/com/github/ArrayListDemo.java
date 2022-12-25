package com.github;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Vijay");
		list.add("Sachin");
		list.add("Vinay");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		/*for(String s:list) {
			System.out.println(s);
		}
*/
	}

}
