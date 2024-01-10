package Package_VI_EnumDataType;

public class Role {
	
	enum Designation
	{
		CEO,TeamLead,TechLead,QA,PM;
	}
	
	public void roleDefined(Designation d)
	{
		switch(d)
		{
		case CEO:
			System.out.println("CEO Role");
			break;
		case TeamLead:
			System.out.println("TeamLead Role");
			break;
		case TechLead:
			System.out.println("TechLead Role");
			break;
		case QA:
			System.out.println("QA Role");
			break;
		case PM:
			System.out.println("PM Role");
			break;
		}
	}

	public static void main(String[] args) {
		
		Role r= new Role();
		r.roleDefined(Designation.QA);
		

	}

}
