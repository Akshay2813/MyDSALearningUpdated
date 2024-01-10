package demo;

import java.util.Scanner;

public class QA {

	
	public static void revNum()
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Enter a number = ");
		num= sc.nextInt();
		
		int temp=num;
		int reverse=0;
		while(num !=0 )
		{
			int digit= num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println("Reveser Number= " + reverse );
	}
	
	public static void revString()
	{
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter a String = ");
		s=sc.next();
		
		String revString="";
		for(int i=0;i<s.length();i++)
		{
			revString= s.charAt(i) + revString ;
		}
		
		System.out.println("Rev String = "+ revString);
	}
	
	public static int largestElement(int[] arr)
	{
		int largest= Integer.MIN_VALUE;
		
		for(int i=0; i< arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		
		return largest;
	}
	
	
	public static int SecondlargestElement(int[] arr)
	{
		int largest= Integer.MIN_VALUE;
		int Secondlargest= Integer.MIN_VALUE;
		
		for(int i=0; i< arr.length;i++)
		{
			if(arr[i]>largest)
			{
				Secondlargest=largest;
				largest=arr[i];
			}
			else if ( arr[i] < largest && arr[i] > Secondlargest)
			{
				Secondlargest=arr[i];
			}
		}
		
		return Secondlargest;
	}
	
	public static void RevEachWordInString(String s)
	{
		String FinalrevString="";
		
		String[] wordArr= s.split(" ");
		
		for(String w: wordArr)
		{
			String revStr="";
			for(int i=0; i<w.length();i++)
			{
				revStr=w.charAt(i)+ revStr;
			}
			
			FinalrevString=FinalrevString+revStr+ " ";
		}
		System.out.println(FinalrevString);
	}
	
	/*
	 *  File file = new File("location");
	 *  
	 *  Scanner sc = new Scanner(file)
	 *  while(sc.hasNextLine()
	 *  {
	 *  Sop(sc.nextline);}
	 *  
	 *  
	 *  //read file
	 *  
	 *  FileReader fw= new FileWriter(location);
	 *  
	 *  BaufferRead br= new BaufferRead(fw);
	 * String str; 
	 *  While str =br.readline != null
	 *  {sop str}
	 *  
	 *  //write file
	 *  
	 *  
	 *  FileReader fw= new FileWriter(location);
	 *  BaufferWriter bf = new BufferWriter(fw0;
	 *  
	 *  
	 *  bf.write("typ"e test);
	 *  
	 *  bf.close();
	 */
	
	
	
	
	 
	public static boolean isPrimeNum(int num)
	{
		for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
    
    return true;
	}
	
	//missinh in arr sum2-sum1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = new int[] {1,7,8,5,4,100,55,1111};
//		System.out.println("largestElement =" + largestElement(arr));
//		System.out.println("SecondlargestElement =" + SecondlargestElement(arr));

		
		RevEachWordInString("Weclome to IND");

	}

}
