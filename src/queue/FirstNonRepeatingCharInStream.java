package queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharInStream{

	
	public static String FirstNonRepeatingCharInStream(String str)
	{
		
		Queue<Character> q= new LinkedList<>();
		String ans="";

		int[] freq=  new int[26];  
		// frquency value fo each char is 0 at start and index mapped to each char means index 0 shows character a frequncy
		
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			freq[ch-'a']=freq[ch-'a']+1;    //97- 97 mapped to zero index   98-97 >> mapped to one index and so on
		
			q.add(ch);
			
			while(!q.isEmpty())
			{
				if(freq[q.peek()-'a'] > 1)
				{
					q.remove();
				}
				else
				{
					ans=ans+q.peek();
					break;
				}
			}
			
			if(q.isEmpty())
			{
				ans=ans+"#";
			}
		}
		
//		System.out.print(ans);
		return ans;
	}

	public static void main(String[] args) {
		
		
		String s= "aabc";
		System.out.print(FirstNonRepeatingCharInStream(s));

	}

}
