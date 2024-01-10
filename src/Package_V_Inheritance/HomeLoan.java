package Package_V_Inheritance;

public class HomeLoan extends Loan {
	HomeLoan()
	{
		System.out.println("HomeLoan Constrcutor called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlotLoan P = new PlotLoan();

	}

}

class PlotLoan extends HomeLoan{
	PlotLoan()
	{
		System.out.println("PlotLoan Constrcutor called");
	}	
}