package leetCode;

public class L_67_AddBinary {

	public static String addBinary(String a, String b) {

        String carry="0";
        
        int i=a.length()-1;
        int j=b.length()-1;
        String ans="";
        while(i>=0 && j>=0)
        	
        {
            if(a.charAt(i)=='1' && b.charAt(j)=='1' && carry=="0")
            {	
               ans=ans+'0';
               carry="1";
               
//               System.out.println(a.charAt(i) +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

            }
            else if(a.charAt(i)=='1' && b.charAt(j)=='1' && carry=="1")
            {
               ans=ans+'1';
               carry= "1";
//               System.out.println(a.charAt(i) +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

            }

            else if(a.charAt(i)=='1'  && b.charAt(j)=='0' && carry=="0")
            {
                ans=ans+'1';
                carry="0";
//                System.out.println(a.charAt(i) +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

            }

            else if(a.charAt(i)=='1' && b.charAt(j)=='0' && carry=="1")
            {
               ans=ans+'0';
               carry="1";
//               System.out.println(a.charAt(i) +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

            }

            else if(a.charAt(i)=='0'  && b.charAt(j)=='1' && carry=="0")
            {
                ans=ans+'1';
                carry="0";
//                System.out.println(a.charAt(i) +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

            }

            else if(a.charAt(i)=='0' && b.charAt(j)=='1' && carry=="1")
            {
                ans=ans+'0';
                carry="1";
//                System.out.println(a.charAt(i) +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

            }
            
            else if(a.charAt(i)=='0' && b.charAt(j)=='0' && carry=="0")
            {
                ans=ans+'0';
             
//                System.out.println(a.charAt(i) +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

            }
            else if(a.charAt(i)=='0' && b.charAt(j)=='0' && carry=="1")
            {
                ans=ans+'1';
                carry="0";
//                System.out.println(a.charAt(i) +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

            }
            i--;
            j--;
        }
        
        while(i>=0)
        {
        	if(a.charAt(i)=='0' && carry=="0")
        	{
        		ans=ans+'0';
                
//                System.out.println(a.charAt(i) +" + " +"_"+" = "+ans +" Carry="+carry);


        	}
        	else if(a.charAt(i)=='0' && carry=="1")
        	{
        		ans=ans+'1';
                carry="0";
//                System.out.println(a.charAt(i) +" + " +"_"+" = "+ans +" Carry="+carry);

        	}
        	else if(a.charAt(i)=='1' && carry=="0")
        	{
        		ans=ans+'1';
//                System.out.println(a.charAt(i) +" + " +"_"+" = "+ans +" Carry="+carry);

        	}
        	else if(a.charAt(i)=='1' && carry=="1")
        	{
        		ans=ans+'0';
        		carry="1";
//                System.out.println(a.charAt(i) +" + " +"_"+" = "+ans +" Carry="+carry);

        	}
        	i--;
        }
        
        while(j>=0)
        {
        	if(b.charAt(j)=='0' && carry=="0")
        	{
        		ans=ans+'0';
                carry="0";
//                System.out.println("_" +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);


        	}
        	else if(b.charAt(j)=='0' && carry=="1")
        	{
        		ans=ans+'1';
                carry="0";
//                System.out.println("_"+" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

        	}
        	else if(b.charAt(j)=='1' && carry=="0")
        	{
        		ans=ans+'1';
                
//                System.out.println("_"+" + " +b.charAt(j)+" = "+ans +" Carry="+carry);
        	}
        	else if(b.charAt(j)=='1' && carry=="1")
        	{
        		ans=ans+'0';
                carry="1";
//                System.out.println("_"+" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

        	}
        	j--;
        }
        
        if(carry=="1")
        {
        	ans=ans+'1';
//            System.out.println("_" +" + " +"_"+" = "+ans +" Carry="+carry);

        }
       
        String revStr="";
		for(int m=0; m<ans.length();m++)
		{
			revStr=ans.charAt(m)+revStr;
		}
        return revStr;
        
	}
	
	public static String addBinary_try_1(String a, String b) {

        String carry="0";
        
        int i=a.length()-1;
        int j=b.length()-1;
        String ans="";
        while(i>=0 && j>=0)
        	
        {
            if(a.charAt(i)=='1' && b.charAt(j)=='1' && carry=="0")
            {	
               ans='0'+ans;
               carry="1";
               
//               System.out.println(a.charAt(i) +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

            }
            else if(a.charAt(i)=='1' && b.charAt(j)=='1' && carry=="1")
            {
               ans='1'+ans;
               carry= "1";
//               System.out.println(a.charAt(i) +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

            }

            else if(a.charAt(i)=='1'  && b.charAt(j)=='0' && carry=="0")
            {
                ans='1'+ans;
                carry="0";
//                System.out.println(a.charAt(i) +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

            }

            else if(a.charAt(i)=='1' && b.charAt(j)=='0' && carry=="1")
            {
               ans='0'+ans;
               carry="1";
//               System.out.println(a.charAt(i) +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

            }

            else if(a.charAt(i)=='0'  && b.charAt(j)=='1' && carry=="0")
            {
                ans='1'+ans;
                carry="0";
//                System.out.println(a.charAt(i) +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

            }

            else if(a.charAt(i)=='0' && b.charAt(j)=='1' && carry=="1")
            {
                ans='0'+ans;
                carry="1";
//                System.out.println(a.charAt(i) +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

            }
            
            else if(a.charAt(i)=='0' && b.charAt(j)=='0' && carry=="0")
            {
                ans='0'+ans;
             
//                System.out.println(a.charAt(i) +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

            }
            else if(a.charAt(i)=='0' && b.charAt(j)=='0' && carry=="1")
            {
                ans='1'+ans;
                carry="0";
//                System.out.println(a.charAt(i) +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

            }
            i--;
            j--;
        }
        
        while(i>=0)
        {
        	if(a.charAt(i)=='0' && carry=="0")
        	{
        		ans='0'+ans;
                
//                System.out.println(a.charAt(i) +" + " +"_"+" = "+ans +" Carry="+carry);


        	}
        	else if(a.charAt(i)=='0' && carry=="1")
        	{
        		ans='1'+ans;
                carry="0";
//                System.out.println(a.charAt(i) +" + " +"_"+" = "+ans +" Carry="+carry);

        	}
        	else if(a.charAt(i)=='1' && carry=="0")
        	{
        		ans='1'+ans;
//                System.out.println(a.charAt(i) +" + " +"_"+" = "+ans +" Carry="+carry);

        	}
        	else if(a.charAt(i)=='1' && carry=="1")
        	{
        		ans='0'+ans;
        		carry="1";
//                System.out.println(a.charAt(i) +" + " +"_"+" = "+ans +" Carry="+carry);

        	}
        	i--;
        }
        
        while(j>=0)
        {
        	if(b.charAt(j)=='0' && carry=="0")
        	{
        		ans='0'+ans;
                carry="0";
//                System.out.println("_" +" + " +b.charAt(j)+" = "+ans +" Carry="+carry);


        	}
        	else if(b.charAt(j)=='0' && carry=="1")
        	{
        		ans='1'+ans;
                carry="0";
//                System.out.println("_"+" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

        	}
        	else if(b.charAt(j)=='1' && carry=="0")
        	{
        		ans='1'+ans;
                
//                System.out.println("_"+" + " +b.charAt(j)+" = "+ans +" Carry="+carry);
        	}
        	else if(b.charAt(j)=='1' && carry=="1")
        	{
        		ans='0'+ans;
                carry="1";
//                System.out.println("_"+" + " +b.charAt(j)+" = "+ans +" Carry="+carry);

        	}
        	j--;
        }
        
        if(carry=="1")
        {
        	ans='1'+ans;
//            System.out.println("_" +" + " +"_"+" = "+ans +" Carry="+carry);

        }
       
        
        return ans;
        
	}
	
	public static String addBinary_try_2(String a, String b) {

		StringBuilder sb = new StringBuilder();
	    int carry = 0;
	    int i = a.length() - 1;
	    int j = b.length() - 1;

	    while (i >= 0 || j >= 0 || carry == 1) // 0 1  //0 1 
	    {
	      if(i >= 0)
	      {
	    	  carry += a.charAt(i) - '0';  //
		      i--;
	      }
	      if(j >= 0)
	      {
	    	  carry += b.charAt(j) - '0';
		      j--;
	      }
	      sb.append(carry % 2);
	      carry /= 2;
	    }
	    return sb.reverse().toString();
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="1010";
		String b="1011";
		//       10101
//		String ans = addBinary(a,b);
		
		
		String ans = addBinary_try_2(a,b);
	
		System.out.println(ans);
	}

}
