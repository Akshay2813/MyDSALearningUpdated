import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapLearn {
	
	public static void m1() throws IOException
	{
		FileReader fi= new FileReader( System.getProperty("user.dir")+ "/abc.txt");
		BufferedReader br= new BufferedReader(fi);
		
		String str;
		while((str=br.readLine()) != null)
		{
			System.out.println(str);
		}
		br.close();
		fi.close();
	}
	
	public static void m2() throws IOException
	{
		FileWriter fw = new FileWriter(System.getProperty("user.dir")+ "abc.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write("Akshay");
		bw.close();
		fw.close();
	}
	
	public static void main(String[] args)
	{
//		Map<Integer, String> myMap= new HashMap<>();
//		
//		myMap.put(1, "Ajay");
//		myMap.put(2, "Akshay");
//		myMap.put(3, "Amruta");
//		myMap.put(4, "Shelke");
//		
//		myMap.get(1);
//		
//		
//		for(Entry<Integer,String> m: myMap.entrySet())
//		{
//			System.out.println("Key= " + m.getKey());
//			System.out.println("Value= " + m.getValue());
//		
//		}
//		System.out.println("Only Key");
//		for(int key: myMap.keySet())
//		{
//			System.out.println("Key= " + key);		
//		}
//		
//		System.out.println("Only Value");
//
//		for(String value: myMap.values())
//		{
//			System.out.println("Value= " + value);		
//		}
//		
//		System.out.println();
		
		int[] arr = new int[] {1,1,1,1,2,5,5,5,6,6};
		Map<Integer, Integer> numMap= new HashMap<>();
		for(int i=0; i<arr.length;i++)
		{
			
			int val = numMap.getOrDefault(arr[i], 0);
			
			numMap.put(arr[i],val+1);
			
		}
		
		System.out.print(numMap);
		
		
		
	
	}
	
	

	
	
}