package queue;

public class GasStationOptimalLeetCode_134 {
	
public int canCompleteCircuit(int[] gas, int[] cost) {
	
	
	int ansIndex=0;
	
	int balance=0;
	int deficiet=0;
	
	
	for(int i=0;i<gas.length;i++)
	{
		balance=balance+gas[i]-cost[i];
		
		if(balance<0)
		{
			
			deficiet=deficiet+balance;
			ansIndex=i+1;
			balance=0;
		}
	}
	
	if(balance+deficiet >=0)
	{
		return ansIndex;
	}
	
	else
	{
		return -1;
	}
	
	
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
