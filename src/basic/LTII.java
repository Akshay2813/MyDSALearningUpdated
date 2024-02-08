package basic;

import java.util.ArrayList;

public class LTII {
	
	public static void m1(ArrayList<String> li)
	{
		for(int i=0 ; i<li.size();i++)
		{
			int minIndex=i;
			for(int j=i+1; j<li.size();j++)
			{
				if(li.get(j).compareTo(li.get(minIndex)) > 0)
				{
					minIndex=j;
				}
			}
			//swap
			String temp=li.get(minIndex);
			String curr=li.get(i);
			li.set(i,temp );
			li.set(minIndex,curr);
		}
	}

	public static void main(String[] args) {
		
		ArrayList<String> li = new ArrayList();
		
		li.add("Akshay");
		li.add("Ram");
		li.add("Ajay");
		li.add("Abhi");
		li.add("Vicky");
		
		m1(li);
		System.out.print(li);
	}

}
