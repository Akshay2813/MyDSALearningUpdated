package leetCode;

public class L_67_AddBinary {

	public static String addBinary(String a, String b) {

        String carry="0";
        
        int i=0;
        int j=0;
        String ans="";
        while(i<a.length() && j<b.length())
        {
            if(a.charAt(i)=='1' && b.charAt(j)=='1' && carry=="0")
            {
               ans=ans+'0';
               carry="1";
            }
            else if(a.charAt(i)=='1' && b.charAt(j)=='1' && carry=="1")
            {
               ans=ans+'1';
               carry="1";
            }

            else if(a.charAt(i)=='1'  && b.charAt(j)=='0' && carry=="0")
            {
                ans=ans+'1';
                carry="0";
            }

            else if(a.charAt(i)=='1' && b.charAt(j)=='0' && carry=="1")
            {
                ans=ans+'0';
               carry="1";
            }

            else if(a.charAt(i)=='0'  && b.charAt(j)=='1' && carry=="0")
            {
                ans=ans+'1';
                carry="0";
            }

            else if(a.charAt(i)=='0' && b.charAt(j)=='1' && carry=="1")
            {
                ans=ans+'0';
                carry="1";
            }
            
            else if(a.charAt(i)=='0' && b.charAt(j)=='0' && carry=="0")
            {
                ans=ans+'0';
                carry="0";
            }
            else if(a.charAt(i)=='0' && b.charAt(j)=='0' && carry=="1")
            {
                ans=ans+'1';
                carry="0";
            }
            i++;
            j++;
        }
        
        while(i<a.length())
        {
        	if(a.charAt(i)=='0' && carry=="0")
        	{
        		ans=ans+'0';
                carry="0";
        	}
        	else if(a.charAt(i)=='0' && carry=="1")
        	{
        		ans=ans+'1';
                carry="0";
        	}
        	i++;
        }
        
        while(j<b.length())
        {
        	if(b.charAt(i)=='0' && carry=="0")
        	{
        		ans=ans+'0';
                carry="0";
        	}
        	else if(b.charAt(i)=='0' && carry=="1")
        	{
        		ans=ans+'1';
                carry="0";
        	}
        	j++;
        }
        
        if(carry=="1")
        {
        	ans=ans+'1';
        }
        else if(carry=="0")
        {
        	ans=ans+'0';
        }
        return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="11";
		String b="1";
		System.out.print(addBinary(a,b));
	}

}
