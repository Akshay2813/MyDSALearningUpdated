package com.homework.question;

import java.util.HashMap;
import java.util.Map;

public class H_20_MinimizeStringLength {

	public static int minimizedStringLength(String s) {

        Map<Character,Integer> m = new HashMap();

        for(int i=0; i<s.length();i++)
        {
            int val = m.getOrDefault(s.charAt(i),0);

            m.put(s.charAt(i),val+1);
        }

//        System.out.println(m.keySet());
        return  m.keySet().size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaabc";
		int ans = minimizedStringLength(s);
		
		System.out.print(ans);
	}

}
