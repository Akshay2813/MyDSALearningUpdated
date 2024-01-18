package leetCode;

import java.util.HashMap;
import java.util.Map;

public class L_13_RomantoInteger {
	
	public static int romanToInt(String s) {
		int ans=0;
        Map<Character, Integer> m = new HashMap();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10); 
        m.put('L',50); 
        m.put('C',100); 
        m.put('D',500); 
        m.put('M',1000);
        // System.out.print(m);
        
        for(int i=0 ; i<s.length();i++)
        {
        	if(i<s.length()-1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1)))
        	{
        		ans = ans - m.get(s.charAt(i));
        	}
        	else
        	{
        		ans= ans + m.get(s.charAt(i));
        	}
        }
        return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 ="III";
		String s2 ="IX";
				
		
		System.out.println(romanToInt(s1));
		System.out.println(romanToInt(s2));

	}

}
