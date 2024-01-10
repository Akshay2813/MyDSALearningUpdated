package basic;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class sortString {
	
	public static void sortStr(String str)
	{
		char[] arr= str.toCharArray();
		for(int i=0; i< arr.length-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] <arr[minIndex])
				{
					minIndex=j;
				}
			}
			//Swap current element with minIndex element
			char temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		//System.out.println(Arrays.toString(arr));
		System.out.println(new String(arr));	
	}

	public  static int removeConsecutiveSame(Vector <String > v) 
    {
        // Your code goes here
        Stack s= new Stack();
        
        for(int i=0; i<v.size();i++ )
        {
            if(s.empty()==false && s.peek() == v.elementAt(i))
            {
                s.pop();
                
              
            }
            else
            {
                s.push(v.elementAt(i));
            }
        }
        System.out.println(s);

        return s.size();
    }
	public static boolean isPalindromeString(String s)
	{
		int start=0;
		int end=s.length()-1;
		while(start<=end)
		{
			if(s.charAt(start) != s.charAt(end))
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
		
	}
	
	public static int reverseNum(int num) //123
	{
		int temp=num;
		int ans=0;
		while(temp !=0)
		{
			int digit=temp%10;
			ans=ans*10+digit;
			temp=temp/10;
		}
		
		return ans;
	}

	
	public static boolean isPalindromeNumber(int num)
	{
		
		int rev=reverseNum(num);
		if(rev==num)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sortStr("DABC");
		
//		Vector <String > v=new Vector<>();
//		v.addElement("tom");
//		v.addElement("jerry");
//		v.addElement("jerry");
//		v.addElement("tom");
//
//		System.out.println (v);
//		System.out.println (removeConsecutiveSame(v));
//		
//		Vector <String > v1=new Vector<>();
//		//ab aa aa bcd ab
//
//		v1.addElement("ab");
//		v1.addElement("aa");
//		v1.addElement("aa");
//		v1.addElement("bcd");
//		v1.addElement("ab");
//
//		System.out.println (v1);
//		System.out.println (removeConsecutiveSame(v1));
		
//		System.out.println(isPalindromeString("Akshay") +" " + isPalindromeString("ABABA"));
		System.out.println(isPalindromeNumber(1001) +" " + isPalindromeNumber(100));
		
		
		
		System.out.println(reverseNum(1001) +" " + reverseNum(8987));


	}

}


