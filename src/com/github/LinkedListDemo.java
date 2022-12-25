package com.github;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
	Iterator<Integer> itr1=list.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
		
	}

	}

}
