package gfg;

import java.util.Map;
import java.util.TreeMap;

public class MaximumOccuringCharacter {
	
	public static char getMaxOccuringChar(String line)
    {
		Map<Character,Integer> m = new TreeMap<>();
		
		for(int i=0;i<line.length();i++)
		{
			int val = m.getOrDefault(line.charAt(i), 0);
			
			m.put(line.charAt(i), val+1);
		}
		
        System.out.println(m);
        return 'a';
       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getMaxOccuringChar("testsample");
		
		getMaxOccuringChar("output");

	}

}
