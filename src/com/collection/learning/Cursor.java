package com.collection.learning;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;


public class Cursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Enumeration for Vector and Stack
		Vector v= new Vector();
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement());
		}
		
		//Iterator for any collection object
		ArrayList li = new ArrayList();
		li.add(10);
		li.add(20);
		Iterator it=li.iterator();
		while(it.hasNext())
		{
			it.next();
		}

		//ListIterator
		List myList = new ArrayList();
		ListIterator lit=myList.listIterator();
		
		while(lit.hasNext())
		{
			lit.next();
			lit.nextIndex();
			lit.set("");
			lit.remove();
			lit.add("sfhsfj");
		}
		while(lit.hasPrevious())
		{
			lit.previous();
			lit.previousIndex();
		}
	}

}
