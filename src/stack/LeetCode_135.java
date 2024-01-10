package stack;

import java.util.ArrayList;
import java.util.List;
//import javafx.util.Pair;

public class LeetCode_135 {  //Min_Stack  ===LeetCode_135
	
	 ArrayList<Integer> list;
	    ArrayList<Integer> minList;
	    int mini = Integer.MAX_VALUE; 
	    public LeetCode_135() {  ////Min_Stack===LeetCode_135
	         list = new ArrayList<>();
	         minList = new ArrayList<>();
	         minList.add(mini);
	        
	        
	    }
	    
	    public void push(int val) {

	        int lastIndex=minList.size()-1;
	        if(val <=minList.get(lastIndex))
	        {
	            minList.add(val);
	        }
	        list.add(val);
	    }
	    
	    public void pop() {

	       int removed =  list.remove(list.size()-1);
	        int lastIndex=minList.size()-1;
	       if(minList.get(lastIndex)==removed)
	       {
	           minList.remove(lastIndex);
	       }
	        
	    }
	    
	    public int top() {
	        return list.get(list.size()-1);
	        
	    }
	    
	    public int getMin() {
	        int lastIndex=minList.size()-1;
	        return minList.get(lastIndex);
	    }
	

	    public static void main(String[] args)
	    {}


	}


