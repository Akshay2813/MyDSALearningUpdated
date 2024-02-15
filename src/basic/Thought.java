package basic;

import java.util.Arrays;

public class Thought {
	
	public static void m1(String s)
	{
		String[] arr = s.split(", "); // this  20, 35, .5 
		System.out.println("arrrr==="+Arrays.toString(arr)); 
		//arrrr===[This is sample text with numbers 20,  35,  .5,  -455,  0.45
		
		double sum=0;
		for(int i=0; i<arr.length;i++){
			if(arr[i].contains("with")) {
				String[] arrNew = arr[i].split(" ");
				for(int j=0; j<arrNew.length;j++) {
					if(isNumeric(arrNew[j])) {
						sum = sum + Double.parseDouble(arrNew[j]);		
					}
				}
			}else if(arr[i].contains("and")) {
				String[] arrNewLast = arr[i].split("and");
				for(int k=0; k<arrNewLast.length;k++) {
					sum = sum + Double.parseDouble(arrNewLast[k]);
					//sum = sum + arrNewLast[k];
				}
			}else {
				sum = sum + Double.parseDouble(arr[i]);
				//sum = sum + arr[i];
			}
			
			
			
			//boolean b=Character.isDigit(arr[i]);
			
			System.out.println(arr[i]);
			//String temp=arr[i].replace(",", "");
			//double num = Integer.parseInt(arr[i]);
			//sum=sum+num;
			
			
		}
		System.out.print("Sum==="+sum);
	}
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	public static void m2(String s)
	{
		String[] arr = s.split(" ");
		double sum=0;
		for(int i=0; i<arr.length;i++)
		{
			String temp=arr[i].replace(",", "");
//	        System.out.print(temp +" ");
//			20 35 .5 -455 0.45 and 20.45
			
			try {
				
		        double d = Double.parseDouble(temp);
		        sum=sum+d;
//		        System.out.print(d +" ");
		    } catch (NumberFormatException e) {
		        
		    }
		}
		
		 System.out.print(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is sample text with numbers 20, 35, .5, -455, 0.45 and 20.45.
		
		String s = "This is sample text with numbers 20, 35, .5, -455, 0.45 and 20.45";
//		m1(s);
		m2(s);

	}

}
