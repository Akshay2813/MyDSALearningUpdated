package recurssion;

public class R_05_NumOfWayToReachZNthStep {

	
	//Find number of ways to reach nth step
	//steps allowed one step at time or two step at time
	//n=2 to reach second step we can one step at one time 1+1 and two step in one time 
	// so we have two ways

	// that is for nth step we have either n-1 way or n-2 way
	
	//n=3 1+1+1 || 1+2 || 2+1  3 ways
	
	public static int numberOfWaysToReachNthStep(int step)
	{
		if(step==0 || step==1)
		{
			return 1;
		}
		int ans = numberOfWaysToReachNthStep(step-1)+numberOfWaysToReachNthStep(step-2);
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int stepMumber=4;
		
		System.out.print("total ways to reach nth step is=" + numberOfWaysToReachNthStep(stepMumber));
		
		

	}

}
